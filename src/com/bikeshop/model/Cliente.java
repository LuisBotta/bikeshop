package com.bikeshop.model;

public class Cliente extends Pessoa {

    private String endereco;

    public Cliente(String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
