/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class ClienteEspecial2 extends Cliente2{
	@Override
	public void descontoCompra() {
		totalCompra = totalCompra * 0.9; //10% de desconto
	}
	public void verificaStatus(boolean especial){
		if(especial) descontoCompra();
		else super.descontoCompra();
	}
}
