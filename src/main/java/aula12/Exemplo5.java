/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
import java.util.Scanner;

public class Exemplo5 {
	public static void main(String[] args) {
		ClienteEspecial2 ce = new ClienteEspecial2();
		Scanner sc = new Scanner(System.in);
		
		double desconto;
		
		ce.setTotalCompra(1000);
		
		System.out.println("Cliente especial? (s ou n)");
		
		char resposta = sc.next().charAt(0);
		if(resposta == 's')
			ce.verificaStatus(true);
		else
			ce.verificaStatus(false);
		System.out.printf("Valor final a pagar com desconto: R$ %.2f\n",
			ce.getTotalCompra());
	}
}
