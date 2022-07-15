/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class ClienteEspecial extends Cliente {
	private double totalCompra;
	
	public double getTotalCompra() {
		return totalCompra;
	}
	
	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	
	public double descontoCompra(double valor) {
		double desconto = valor * 0.1; //10% de desconto
		return desconto;
	}
}
