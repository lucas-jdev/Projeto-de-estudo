package com.lucas.di.model;

import java.math.BigDecimal;

public class Produto {
    
    private String nome;
    private BigDecimal valorTotal;

    public Produto(String nome, BigDecimal valorTotal){
        this.setNome(nome);
        this.setValorTotal(valorTotal);
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
