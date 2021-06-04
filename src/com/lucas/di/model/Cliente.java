package com.lucas.di.model;

public class Cliente {
    
    private String nome;
    private String email;
    private String telefone;
    private boolean ativo;

    public Cliente(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void ativar() {
        this.ativo = true;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
