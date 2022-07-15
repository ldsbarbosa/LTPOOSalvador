/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
import java.util.Random;

public class Exemplo3 {
	public static void main(String args[]) {
		 Random rd = new Random();
		 int[] x = new int[5]; // Polimorfismo universal param�trico
		 int[] x2 = new int[10]; // Polimorfismo universal param�trico
		 int i;
		 
		 for (i = 0; i < 5; i++) {
			 x[i] = rd.nextInt(100);
			 System.out.printf("x[%d] = %d\n", i, x[i]);
		 }
		 for (i = 0; i < 10; i++) {
			 x2[i] = rd.nextInt(100);
			 System.out.printf("x2[%d] = %d\n", i, x2[i]);
		 }
	}
}
