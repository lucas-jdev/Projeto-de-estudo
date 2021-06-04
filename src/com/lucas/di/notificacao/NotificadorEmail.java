package com.lucas.di.notificacao;

import com.lucas.di.model.Cliente;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(Cliente cliente, String menssagem) {
        /* 
           Em uma aplicação real, não se usa sysout em outras classes
           isso é uma má prática, mas aqui é só um exemplo didático 
        */
        System.out.printf("%s, vc está sendo notificado: %s\n",
                    cliente.getNome(), menssagem);
    }
    
}
