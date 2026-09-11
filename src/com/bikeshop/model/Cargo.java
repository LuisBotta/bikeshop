package com.bikeshop.model;

public enum Cargo {

    MECANICO("Mecânico"),
    VENDEDOR("Vendedor"),
    ATENDENTE("Atendente");

    private final String descricao;

    Cargo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }


}
