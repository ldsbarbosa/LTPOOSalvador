/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class Exemplo4 {
	public static void main(String args[]) {
		// Polimorfismo universal por inclus�o sem redefini��o de m�todos
		ClienteEspecial ce = new ClienteEspecial();
		 
		ce.setNomeCliente("Salvador");
		 
		ce.setTotalCompra(1000);
		 
		double desconto = ce.descontoCompra(ce.getTotalCompra());
		 
		System.out.printf("%s, valor final a pagar com desconto: R$ %.2f\n",
				ce.getNomeCliente(), ce.getTotalCompra() - desconto);
	}
}
