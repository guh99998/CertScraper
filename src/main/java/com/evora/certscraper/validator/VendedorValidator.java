package com.evora.certscraper.validator;

import com.evora.certscraper.model.Vendedor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class VendedorValidator {

    public static List<String> validar(Vendedor vendedor) {
        List<String> erros = new ArrayList<>();

        if (!validarNome(vendedor.getNomeVendedor())) {
            erros.add("Nome inválido: mínimo de 3 caracterres, somente letras.");
        }
        if (!validarCpf(vendedor.getCpfVendedor())) {
            erros.add("CPF inválido.");
        }
        if (!validarRg(vendedor.getRgVendedor())) {
            erros.add("RG inválido.");
        }
        if (!validarData(vendedor.getDataNascimento())) {
            erros.add("Data de Nascimento inválida. Use o formato dd/MM/yyyy");
        }
        if (vendedor.getEndereco() != null && !validarCep(vendedor.getEndereco().getCep())) {
            erros.add("CEP inválido: deve ter 8 dígitos");
        }

        return erros;
    }

    private static boolean validarNome(String nome) {
        return nome != null && nome.trim().length() >= 3 && nome.matches("[a-zA-ZÀ-ú ]+");
    }

    private static boolean validarRg(String rg) {
        return rg != null && rg.trim().length() >= 5;
    }

    private static boolean validarCep(String cep) {
        String cepLimpo = cep.replaceAll("[^0-9]", "");
        return cepLimpo.length() == 8;
    }

    private static boolean validarData(String data) {
        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate nascimento = LocalDate.parse(data, fmt);
            int idade = LocalDate.now().getYear() - nascimento.getYear();
            return idade >= 18 && idade <= 120;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private static boolean validarCpf(String cpf) {
        String cpfLimpo = cpf.replaceAll("[^0-9]", "");
        if (cpfLimpo.length() != 11) return false;
        if (cpfLimpo.chars().distinct().count() == 1) return false; // ex: 111.111.111-11

        int soma = 0;
        for (int i = 0; i < 9; i++) soma += (cpfLimpo.charAt(i) - '0') * (10 - i);
        int dig1 = (soma * 10) % 11;
        if (dig1 == 10) dig1 = 0;

        soma = 0;
        for (int i = 0; i < 10; i++) soma += (cpfLimpo.charAt(i) - '0') * (11 - i);
        int dig2 = (soma * 10) % 11;
        if (dig2 == 10) dig2 = 0;

        return dig1 == (cpfLimpo.charAt(9) - '0') && dig2 == (cpfLimpo.charAt(10) - '0');
    }
}
