package aula2;

import java.util.Scanner;

/**
 *d ) Desenvolva um programa em java que lê o nome de um aluno e suas notas das quatro provas. O
    programa deve mostrar o nome do aluno e a média aritmética das referidas notas.
    média = (n1+n2+n3+n4)/4
 * @author Lucas da Silva Barbosa
 */
public class Temperatura {
    public static void main(String args[]) {
	float grausCelsius;
	Scanner x = new Scanner(System.in);
	
	System.out.println("Entre com uma temperatura em Celsius!!");
	grausCelsius = x.nextFloat();
	
	float grausFahrenheit = (9 * grausCelsius + 160)/5;
        System.out.printf("A temperatura inserida em Fahrenheit é de %.2f",grausFahrenheit);
    }
}
