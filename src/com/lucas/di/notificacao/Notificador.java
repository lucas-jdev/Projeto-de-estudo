package com.lucas.di.notificacao;

import com.lucas.di.model.Cliente;

public interface Notificador {
    
    public void notificar(Cliente cliente, String menssagem);
}
