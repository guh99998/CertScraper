package com.evora.certscraper.controller;

import com.evora.certscraper.model.Endereco;
import com.evora.certscraper.model.Vendedor;
import com.evora.certscraper.validator.VendedorValidator;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.List;

public class VendedorController {
    @FXML
    private TextField cpfVendedorField;

    @FXML
    private TextField rgVendedorField;

    @FXML
    private TextField orgaoExpedidorField;

    @FXML
    private TextField nomeVendedorField;

    @FXML
    private TextField dataNascimentoField;

    @FXML
    private TextField cepEnderecoField;

    @FXML
    private void onAvancarClick() {
        String cpf = cpfVendedorField.getText();
        String rg = rgVendedorField.getText();
        String orgaoExpedidor = orgaoExpedidorField.getText();
        String nomeVendedor = nomeVendedorField.getText();
        String dataNascimento = dataNascimentoField.getText();
        String cep = cepEnderecoField.getText();
        Endereco endereco = new Endereco(cep);
        Vendedor vendedor = new Vendedor(nomeVendedor, cpf, rg, orgaoExpedidor, dataNascimento, endereco);
        List<String> erros = VendedorValidator.validar(vendedor);
    }
}
