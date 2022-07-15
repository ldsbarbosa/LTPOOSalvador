package aula2;

import java.util.Scanner;

/**
 *c ) Desenvolva um programa em Java que lê o nome de um vendedor, o salário base dele e o total
    de vendas efetuadas em um mês. Em seguida o programa deverá mostrar o salário total deste
    vendedor no final do mês. Obs: o vendedor ganha 5% em cima do total das vendas.
 * @author Lucas da Silva Barbosa
 */
public class Vendedor {
    public static void main(String args[]) {
	String vendedor;
	float salarioBase;
	float totalVendasMensal;
	Scanner x = new Scanner(System.in);
	
	System.out.println("Entre com os dados do vendedor!");
        System.out.println("Nome: ");
	vendedor = x.nextLine();
	System.out.println("Salario base: ");
        salarioBase = x.nextFloat();
	System.out.println("Total de vendas no mês: ");
        totalVendasMensal = x.nextFloat();
	float vendedorFinal = (float) salarioBase+(totalVendasMensal/20);
	
	System.out.printf("O salário total do vendedor "+vendedor);
	System.out.printf(" foi de %.3f",vendedorFinal);
    }
}
