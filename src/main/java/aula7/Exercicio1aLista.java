/*
1) Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que preencha um array com os valores:
a. 10 9 8 7 6 5 4 3 2 1
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exercicio1aLista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int numeroInicial = 10;
        
        System.out.println("Preenchendo um Array! Item a.");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = numeroInicial;
            numeroInicial--;
        }
        System.out.println("Vetor: "); // Solução alternativa
        /*for(int n : vetor){ 
            n = numeroInicial;
            numeroInicial--;
            System.out.printf("%4d",n);
        }*/
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+"\t");
        }
    }
}
