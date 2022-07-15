/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class ContaCorrente extends Conta{
	@Override
	public void atualizarSaldo (double taxa) {
		if(this.saldo != 0) {
			this.taxa = taxa;
			this.saldo = this.saldo + (this.saldo*(this.taxa*2));
			System.out.printf("ATUALIZA��O - Seu saldo atual � de: %.2f\n",this.saldo);
		}else{
			System.out.println("ATUALIZA��O - Insira um valor diferente de 0 para saldo");
		}
	}
	@Override
	public void depositar(double saldo) {
		this.saldo += (saldo - 10);
		System.out.printf("DEPOSITO - Seu saldo atual � de: %.2f\n",this.saldo);
	}
}
