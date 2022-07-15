package aula11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo6 {
    public static InputStream abrirArquivo(String arquivo) throws FileNotFoundException {
        return new FileInputStream(arquivo);
    }
    public static void main(String[] args) {
        try{
            InputStream i = abrirArquivo("arquivo123.txt");
        }catch(FileNotFoundException e){
            System.out.println("Deu erro.");
        }
    }
}
