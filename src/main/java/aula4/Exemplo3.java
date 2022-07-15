package aula4;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo3 {
    public static void main(String[] args){
        Calculo2 var = new Calculo2();
        Scanner leitor = new Scanner(System.in);
        float valor1,valor2,opcao;
        
        System.out.println("Entre com dois valores");
        valor1 = leitor.nextFloat();
        valor2 = leitor.nextFloat();
        
        System.out.println("Obter a divisão normal(1) "+"ou o resto da divisão(2)?");
        opcao = leitor.nextFloat();
        
        if(opcao==1)
            System.out.println("Resultado = "+var.divisaoNormal(valor1,valor2));
        else
            System.out.println("Resultado = "+var.restoDivisao(valor1,valor2));
        }
}
