package com.evora.certscraper.model;

public class Vendedor {
    private String nomeVendedor;
    private String cpfVendedor;
    private String rgVendedor;
    private String orgaoExpedidorRgVendedor;
    private String dataNascimento;
    private Endereco endereco;

    public Vendedor(String nomeVendedor, String cpfVendedor, String rgVendedor, String orgaoExpedidorRgVendedor, String dataNascimento, Endereco endereco) {
        this.nomeVendedor = nomeVendedor;
        this.cpfVendedor = cpfVendedor;
        this.rgVendedor = rgVendedor;
        this.orgaoExpedidorRgVendedor = orgaoExpedidorRgVendedor;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getCpfVendedor() {
        return cpfVendedor;
    }

    public void setCpfVendedor(String cpfVendedor) {
        this.cpfVendedor = cpfVendedor;
    }

    public String getRgVendedor() {
        return rgVendedor;
    }

    public void setRgVendedor(String rgVendedor) {
        this.rgVendedor = rgVendedor;
    }

    public String getOrgaoExpedidorRgVendedor() {
        return orgaoExpedidorRgVendedor;
    }

    public void setOrgaoExpedidorRgVendedor(String orgaoExpedidorRgVendedor) {
        this.orgaoExpedidorRgVendedor = orgaoExpedidorRgVendedor;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
