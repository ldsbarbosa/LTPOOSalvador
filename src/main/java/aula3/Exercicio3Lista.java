package aula3;

import java.util.Scanner;

/**
 *3. Desenvolva:
     Uma classe com um método principal que pergunta se o usuário quer: 1) calcular a
    potência; ou 2) verificar se um número é primo. E chama o método correspondente.
     Uma classe com um método que lê o valor da base e do expoente. Despois calcula e
    mostra o valor da potência, sem usar qualquer função ou método de cálculo de potência
    pré-existentes. Dica use aquele algoritmo para acumular produto que vimos em
    Algoritmos.
    Lembre-se: 23
    = 2*2*2 = 6
     Uma classe com um método que lê um número e verifica se o mesmo é primo ou não.
    Lembre-se: um número é primo se for divisível apenas por 1 e por ele mesmo.
 * @author  Lucas da Silva Barbosa
 */
public class Exercicio3Lista {
    public static void main(String args[]) {
        Classe7 banana = new Classe7();
        Scanner leitor = new Scanner(System.in);
        int decisao;
        System.out.println("Escolha um metodo desejado: ");
        System.out.println("1- Calcular a potência");
        System.out.println("2- Verificar se um número é primo");
        System.out.println("3- Verificar se um número é primo(Algoritmo refatorado)");
        decisao = leitor.nextInt();
        if(decisao == 1)
            banana.potencia();
        if(decisao == 2)
            banana.numeroPrimo();
        if(decisao == 3)
            banana.numeroPrimo2();
    }
}
