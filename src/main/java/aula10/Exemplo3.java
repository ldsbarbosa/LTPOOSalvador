package aula10;
import java.io.File;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo3 {
    public static void main(String[] args) {
        File arqEntrada = new File("..\\Aleatorio\\src\\main\\olaMundo.txt");
        
        Verificar2 vf = new Verificar2();
        vf.verificaArquivo(arqEntrada);
        
        Dados2 dd = new Dados2();
        dd.leDados(arqEntrada);
    }
}
