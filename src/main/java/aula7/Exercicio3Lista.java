/*
Escreva um método que recebe um array de números e devolve a posição onde se encontra o maior valor do array.
Se houver mais de um valor maior, devolver a posição da primeira ocorrência.
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exercicio3Lista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Classe1 objeto2 = new Classe1();
        float[] vetor = {1,3,5,7,9,11,13,11,15,11,17,11,19,21,19,21,3,21,9,21,15,21,17,21}, respostas = new float[2];
        
        respostas = objeto2.recebeArray2(vetor);
        System.out.printf("O maior número do vetor é %.0f\n",respostas[0]);
        System.out.printf("A quantidade de vezes que o número apareceu foi %.0f  vezes\n",respostas[1]);
    }
}
