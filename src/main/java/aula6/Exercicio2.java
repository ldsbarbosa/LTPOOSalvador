package aula6;

import java.util.Scanner;

/**
 *6.2 - Exercício b
    Dizemos que um número é perfeito se a soma de seus fatores, incluindo o 1 (mas não o próprio
    número) é igual ao número. Por exemplo, 6 é um número perfeito porque 6=1+2+3. Escreva um
    método chamado perfeito que determina se o parâmetro numero é um número perfeito. Exiba os
    fatores de cada número perfeito para confirmar que o número é de fato perfeito. Teste todos os
    números de 1 a 1000.
 * @author Lucas da Silva Barbosa
 */
public class Exercicio2 {
    public static void main(String arg[]) {
        int numero;
        String mensagem;
        Scanner leitor = new Scanner(System.in);
        Classe1 objeto1 = new Classe1();
        
        System.out.println("--Numeros Perfeitos!--");
        System.out.println("Entre com um número!");
        numero = leitor.nextInt();

        mensagem = objeto1.verificaNumPerfeito(numero);
        System.out.println(mensagem);
    }
}
