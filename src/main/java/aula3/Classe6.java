package aula3;

import java.util.Scanner;

/**
 *
 * @author  Lucas da Silva Barbosa
 */
public class Classe6 {
    public void quocienteInteiro() {
        int inteiro1,inteiro2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número inteiro para ser o numerador!");
        inteiro1 = leitor.nextInt();
        System.out.println("Insira outro número inteiro para ser o denominador!");
        inteiro2 = leitor.nextInt();
        int quociente = inteiro1/inteiro2;
        System.out.printf("O quociente inteiro da divisão dos dois numeros anteriores resultou em %d",quociente);
    }
    
    public void divisaoNormal() {
        float numero1,numero2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número para ser o numerador!");
        numero1 = leitor.nextFloat();
        System.out.println("Insira outro número para ser o denominador!");
        numero2 = leitor.nextFloat();
        float resultado = numero1/numero2;
        System.out.printf("A divisão normal dos dois numeros anteriores resultou em %f",resultado);
    }
    
    public void restoDivisao() {
        int inteiro1,inteiro2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número inteiro para ser o numerador!");
        inteiro1 = leitor.nextInt();
        System.out.println("Insira outro número inteiro para ser o denominador!");
        inteiro2 = leitor.nextInt();
        int restoDaDivisao = inteiro1%inteiro2;
        System.out.printf("O resto da divisão dos dois numeros anteriores resultou em %d",restoDaDivisao);
    }
}
