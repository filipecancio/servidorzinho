package dev.servidorzinho;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

    public Servidor(int port) throws IOException {
        ServerSocket servidor = new ServerSocket(port);
        System.out.println("Porta "+ port +" aberta!");

        Socket cliente = servidor.accept();
        System.out.println("Nova conexão com o cliente " +
                cliente.getInetAddress().getHostAddress()
        );

        Scanner s = new Scanner(cliente.getInputStream());
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }

        s.close();
        servidor.close();
        cliente.close();
    }

}
