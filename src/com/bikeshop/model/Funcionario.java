package com.bikeshop.model;

public class Funcionario extends Pessoa {

    private Cargo cargo;
    private float salario;

    public Funcionario(String nome, String cpf, String telefone, String email, Cargo cargo, float salario) {
        super(nome, cpf, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
