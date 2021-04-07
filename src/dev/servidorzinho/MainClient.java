package servidorzinho.src.dev.servidorzinho;

import servidorzinho.src.dev.servidorzinho.Cliente;
import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {
        
        Cliente cliente = new Cliente("127.0.0.1",12345);
        System.out.println("Cliente concluido!");
        
        
    }
}
