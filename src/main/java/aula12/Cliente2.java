/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class Cliente2 {
	protected double totalCompra;
	
	public double getTotalCompra() {
		return totalCompra;
	}
	 
	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	 
	public void descontoCompra() {
		totalCompra = totalCompra * 0.95; //5% de desconto
	}
}
