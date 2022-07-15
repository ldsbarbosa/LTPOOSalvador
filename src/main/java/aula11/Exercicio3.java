/*
 */
package aula11;

/**
 *
Desenvolva um código em java que:
Cria uma classe:
    i. Com um método main, que recebe dois números inteiros;
    ii. Instancie um ojeto da segunda classe;
    iii. Passe esse valores para o método da segunda classe;
    iv. Mostra o retorno do método da segunda classe.
    v. Insira o try..catch para verificar a divisão por zero, usando a sua própria classe de excessão.
Crie uma segunda classe:
    i. Com um método que recebe dois valores inteiros e efetua a divisão dos mesmos;
    ii. Retorna o resultado da divisão.
Crie uma classe chamada DividirPorZeroException, que verifica ArithmeticException e mostra uma mensagem comunicando que a operação não pode ser realizada.
 * 
 * @author Lucas da Silva Barbosa
 */
import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Criando variáveis
        int numero1 = 0, numero2 = 0, decisao = 0;
        double resultado;
        
        //Instanciando objetos
        Random aleatorio = new Random();
        Scanner leitor = new Scanner(System.in);
        SegundaClasse2 objeto = new SegundaClasse2();

        //Entrando com numeros
        System.out.println("Deseja entrar manualmente com os numeros(1) ou gerar números aleatórios(2)?");
        decisao = leitor.nextInt();
        while(decisao != 1 && decisao != 2){ // Tratando a decisão
            System.out.println("Insira 1 ou 2.");
            decisao = leitor.nextInt();
        }
        if(decisao == 1){
            System.out.println("Insira um número: ");
            numero1 = leitor.nextInt();
            System.out.println("Insira outro número: ");
            numero2 = leitor.nextInt();
        }
        if(decisao == 2){
            numero1 = aleatorio.nextInt(20);
            System.out.printf("Primeiro número: %d\n", numero1);
            numero2 = aleatorio.nextInt(20);
            System.out.printf("Segundo número: %d\n", numero2);            
        }
        
        //Passando para o metodo do objeto e armazenando em resultado
        try {
            resultado = objeto.dividirNumeros(numero1, numero2);
        }catch(DividirPorZeroException excecao){
            System.out.println(excecao);
            System.out.println(excecao.getMessage());
            System.out.println("O denominador inserido foi 0. Insira um denominador não nulo.");
        }
    }
}

