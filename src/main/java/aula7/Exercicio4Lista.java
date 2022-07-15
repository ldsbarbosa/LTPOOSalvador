/*
Escrever um main Java que lê 5 números reais e armazena esses valores em um array.
O programa deve calcular a média aritmética dos valores do vetor e imprimir todos os valores menores do que a média calculada.
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exercicio4Lista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Classe1 objeto3 = new Classe1();
        float[] vetor = new float[5];
        float media = 0;
        
        System.out.println("Entre com cinco números reais!");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = leitor.nextFloat();
            media += vetor[i];
        }
        media /= vetor.length;
        System.out.println("Valores menores que a média: ");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < media){
                System.out.printf("%4.1f",vetor[i]);
            }
        }
    }
}
