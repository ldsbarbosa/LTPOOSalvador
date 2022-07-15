/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;

public class Calculo {
	public void calculaArea(int lado) {
		System.out.printf("Área = %d\n",lado*lado);
	}
	public void calculaArea(int base, int altura) {
		System.out.printf("Área = %d\n",(base*altura)/2);
	}
}
