package dev.servidorzinho;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public Cliente(String ip ,int port) throws IOException {
        
        
        
        Socket cliente = new Socket(ip,port);
        System.out.println("Servidor conectado !");

        PrintStream saida = new PrintStream(cliente.getOutputStream());
        Scanner teclado = new Scanner(System.in);

        while (cliente.isConnected()) {
            saida.println(teclado.next().charAt(0));
        }
        saida.close();
        teclado.close();
        cliente.close();
    }
}