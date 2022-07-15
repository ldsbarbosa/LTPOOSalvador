/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class ContaPoupanca extends Conta{
	@Override
	public void atualizarSaldo (double taxa) {
		if(this.saldo != 0) {
			this.taxa = taxa;
			this.saldo = this.saldo + (this.saldo*(this.taxa*3));
			System.out.printf("ATUALIZA��O - Seu saldo atual � de: %.2f\n",this.saldo);
		}else{
			System.out.println("ATUALIZA��O - Insira um valor diferente de 0 para saldo");
		}
	}
}
