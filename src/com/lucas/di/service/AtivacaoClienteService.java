package com.lucas.di.service;

import com.lucas.di.model.Cliente;
import com.lucas.di.notificacao.Notificador;

public class AtivacaoClienteService {

    /* 
       Essa é a solução genial, essa variável
       é responsável por fazer nossa injeção
       de dependência.
    */
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.ativar();
        this.notificador.notificar(cliente, "você foi ativado com sucesso!");
    }
}