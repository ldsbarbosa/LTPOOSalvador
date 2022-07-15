/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);// Polimorfismo ad hoc por sobrecarga
		Calculo cc = new Calculo();
		int resposta;
		System.out.println("Qual área pretende calcular (1)quadrado (2)triângulo");
		resposta = leitor.nextInt();
		switch(resposta){
		case 1:{
			System.out.println("Qual o valor do lado do quadrado?");
			int lado = leitor.nextInt();
			cc.calculaArea(lado);
			};
			break;
		case 2:{
			System.out.println("Qual o valor da altura e da base do triângulo?");
			int altura = leitor.nextInt();
			int base = leitor.nextInt();
			cc.calculaArea(base,altura);
		};
		break;
		default:
			System.out.println("Valor inválido");
			break;
		}
	}
}
