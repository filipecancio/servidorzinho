package dev.servidorzinho;

import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente(12345);
        System.out.println("Cliente concluido!");
    }
}
