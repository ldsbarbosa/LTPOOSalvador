package aula5;

import java.util.Scanner;
// import java.math.*;  Não há necessidade de importar a biblioteca java.math
// a biblioteca Math faz parte do Java.lang

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo5 {
    public static void main(String[] args){
        double valor;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Entre com um número!");
        valor = leitor.nextDouble();
        
        System.out.println("A raiz quadrada do número inserido é de = "+Math.sqrt(valor));
        //Math é a classe onde o método static sqrt() foi declarado
    }
}
