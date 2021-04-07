package dev.servidorzinho;

import java.io.IOException;
import java.net.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Servidor servidor = new Servidor(12345);
        System.out.println("Olá mundo!");
    }
}

class Servidor{

    public Servidor(int port) throws IOException {
        ServerSocket servidor = new ServerSocket(port);
        System.out.println("Porta 12345 aberta!");
    }

}
