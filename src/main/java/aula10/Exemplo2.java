package aula10;
import java.io.File;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo2 {
    public static void main(String[] args) {
        File arqSaida = new File("..\\Aleatorio\\src\\main\\olaMundo.txt");
        
        Verificar vf = new Verificar();// Verifica a existência do arquivo.
        vf.verificaArquivo(arqSaida);
        
        Dados dd = new Dados();// Insere dados no arquivo.
        dd.escreveDados(arqSaida, true, "Lucas Barbosa");

    }
}
