package aula10;
import java.io.File;
import java.util.Scanner;
/**
 * 
 2)Leia uma frase do teclado e mande para um arquivo apenas as vogais da referida frase.
 * 
 * @author Lucas da Silva Barbosa
 */
public class Exercicio2 {
    public static void main(String[] args) {
        // Instanciando objetos
        Scanner leitor = new Scanner(System.in);
        Classe2 objeto1 = new Classe2();
        File arquivo = new File("d:\\testeJava\\", "exercicio2.txt");
        // Variáveis
        String fraseInput;
        
        System.out.println("Informe uma frase.");
        System.out.println("Frase: ");
        fraseInput = leitor.nextLine();
                
        objeto1.mandaFrase(fraseInput, arquivo);
    }
}
