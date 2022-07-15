/*
Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A cada tentativa dele,
forneça uma dica mostrando se o número é maior ou menor. Quando ele descobrir exiba uma mensagem
de parabéns e mostre em quantas tentativas ele conseguiu.
 */
package aula12;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exercicio2Lista {
    public static void main(String[] args) {
        // Instanciando objetos
        Random aleatorio = new Random();
        Scanner leitor = new Scanner(System.in);
        // Criando variáveis
        int numeroMaquina = aleatorio.nextInt(100),
            numeroHumano,
            tentativas = 1;
        
        System.out.println("-NUMERO SORTEADO-");
        System.out.println("Entre com um número de 1 a 100!");
        numeroHumano = leitor.nextInt();
        
        
        if(numeroHumano == numeroMaquina){
            System.out.printf("Já ganhou na primeira tentativa!\nNumero da máquina:%4d\nSeu número:%4d",numeroMaquina,numeroHumano);
        }else{
            while(numeroHumano != numeroMaquina){
                tentativas++;
                if(numeroHumano > numeroMaquina){
                    System.out.println("Tente um número menor");
                    numeroHumano = leitor.nextInt();
                }else{
                    System.out.println("Tente um número maior");
                    numeroHumano = leitor.nextInt();
                }
            }
            System.out.printf("Você acertou!\nNúmero de tentativas: %4d\nNumero da máquina:%4d\nSeu número:%4d",tentativas,numeroMaquina,numeroHumano);
        }
    }
}
