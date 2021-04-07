package servidorzinho.src.dev.servidorzinho;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Servidor servidor = new Servidor(12345);
        System.out.println("Servidor Concluído!");
    }
}
