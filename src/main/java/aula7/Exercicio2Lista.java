/*
2) Crie um método que recebe um array de inteiros a e um valor inteiro x e retorna a quantidade de vezes que x aparece no array a.
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exercicio2Lista {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Classe1 objeto1 = new Classe1();
        int indiceDoVetor = 0, numero, numeroDesejado;
        int[] vetor = new int[20];
        boolean vetorInserindo = true;
        
        System.out.println("Insira de 1 número a 20 números!");
        System.out.println("Caso o número inserido seja negativo, o laço 'while' será encerrado.");
        while(vetorInserindo && indiceDoVetor < 20){
            System.out.println("Insira um número para atribuir ao vetor");
            numero = leitor.nextInt();
            if(numero < 0){
                vetorInserindo = false;
                break;
            }else{
                vetor[indiceDoVetor] = numero;
                indiceDoVetor++;
            }
        }
        System.out.println("Agora, insira o número que você deseja ver no vetor!");
        numeroDesejado = leitor.nextInt();
        objeto1.recebeArray(vetor,numeroDesejado);
    }
}
