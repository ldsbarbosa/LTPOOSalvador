/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class Conta {
	protected double saldo = 0;
	protected double taxa = 0;
	
	public double getSaldo(){
		return this.saldo;
	}
	public double getTaxa() {
		return this.taxa;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public void depositar(double saldo) {
		this.saldo += saldo;
		System.out.printf("DEPOSITO - Seu saldo atual � de: %.2f\n",this.saldo);
	}
	public void sacar(double saldo) {
		this.saldo -= saldo;
		System.out.printf("SAQUE - Seu saldo atual � de: %.2f\n",this.saldo);
	}
	
	public void atualizarSaldo (double taxa) {
		if(this.saldo != 0) {
			this.taxa = taxa;
			this.saldo = this.saldo + (this.saldo * this.taxa);
			System.out.printf("ATUALIZA��O - Seu saldo atual � de: %.2f\n",this.saldo);
		}else{
			System.out.println("ATUALIZA��O - Insira um valor diferente de 0 para saldo");
		}
	}
}
