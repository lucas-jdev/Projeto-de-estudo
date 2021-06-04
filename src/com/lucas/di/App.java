package com.lucas.di;

import com.lucas.di.model.Cliente;
import com.lucas.di.notificacao.Notificador;
import com.lucas.di.notificacao.NotificadorEmail;
import com.lucas.di.service.AtivacaoClienteService;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente("Lucas", "lucas@teu.cu.br", "98888888");
        Cliente cliente2 = new Cliente("Maria", "maria@teu.cu.br", "99999999");

        Notificador notificador = new NotificadorEmail();

        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar(cliente);
        ativacaoClienteService.ativar(cliente2);
    }
}
