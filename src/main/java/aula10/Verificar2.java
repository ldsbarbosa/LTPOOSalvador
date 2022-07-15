package aula10;
import java.io.File;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Verificar2 {
    
    public void verificaArquivo(File arq) {
        if(!arq.exists()){
            System.out.println("Arquivo não localizado");
        }
    }
    
}
