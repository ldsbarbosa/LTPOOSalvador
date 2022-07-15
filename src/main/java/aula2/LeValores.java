package aula2;

import java.util.Scanner;

/**
 *b ) Desenvolva um programa em Java que lê quatro valores (A, B, C e D), calcula e mostra a
    diferença entre o produto de A e B e do produto de C e D.
    Resultado = (A*B) – (C*D)
 * @author Lucas da Silva Barbosa
 */
public class LeValores {
    public static void main(String args[]) {
        int valor1, valor2, valor3, valor4, resultado;
        Scanner x;
        x = new Scanner(System.in);

        System.out.printf("Insira 4 valores inteiros!\n");
        valor1 = x.nextInt();
        valor2 = x.nextInt();
        valor3 = x.nextInt();
        valor4 = x.nextInt();
        resultado = (valor1 * valor2) - (valor3 * valor4);
        System.out.printf("O resultado foi de: %d",resultado);
    }
}
