package aula10;
import java.io.File;
import java.util.Scanner;
/**
 *
a)Leia o nome de um arquivo pelo teclado e tente abrir o mesmo usando a classe File. Obtenha os dados do referido arquivo: 
•	Tamanho do arquivo
•	Caminho completo até o arquivo
•	A data da última modificação (formatado)
 * 
 * @author Lucas da Silva Barbosa
 */
public class Exercicio1 {
    public static void main(String[] args) {
        // Instanciando classe Scanner
        Scanner leitor = new Scanner(System.in);
        Classe1 objeto1 = new Classe1();
        
        // Variáveis
        String arquivoLido, caminho;
        
        System.out.println("Informe, primeiramente, o nome do arquivo contendo sua respectiva extensão."
                + " Após, informe o caminho até sua pasta.");
        System.out.println("Arquivo: ");
        arquivoLido = leitor.nextLine();
        System.out.println("Caminho: ");
        caminho = leitor.nextLine();
        
        File arquivo = new File(caminho, arquivoLido);
        objeto1.analisaArquivo(arquivo);
    }
}
