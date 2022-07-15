/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class Exemplo2 {
	public static void main(String[] args) {
		float valor1,valor2;// Polimorfismo ad hoc por coer��o
		valor1 = 0.5f;      // Famoso casting
		valor2 = (float)0.5;
		System.out.println("Valor1 = "+valor1);
		System.out.println("Valor2 = "+valor2);
		
		double valor3,valor4;
		valor3 = 5;
		valor4 = valor3/2;
		System.out.println("Valor4 = "+valor4);
		
		int valor5;
		valor3 = 5;
		valor5 = (int)(valor3/2);
		System.out.println("Valor5 = "+valor5);
	}
}
