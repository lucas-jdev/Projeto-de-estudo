package com.lucas.di.service;

import com.lucas.di.model.Cliente;
import com.lucas.di.model.Produto;
import com.lucas.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador){
        this.notificador = notificador;
    }
    
    public void emitir(Cliente cliente, Produto produto) {
        // TODO emite nota fiscal aqui...
        
        notificador.notificar(cliente, "Você comprou o produto: "+produto.getNome());
    }
}
