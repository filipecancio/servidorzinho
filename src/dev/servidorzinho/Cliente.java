package dev.servidorzinho;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public Cliente(int port) throws IOException {
        Socket cliente = new Socket("127.0.0.1",port);
        System.out.println("O cliente se conectou ao servidor!");
    }
}
