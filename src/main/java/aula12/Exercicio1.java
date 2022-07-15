/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class Exercicio1 {
	public static void main(String[] args) {
		Conta objeto1 = new Conta();
		ContaCorrente objeto2 = new ContaCorrente();
		ContaPoupanca objeto3 = new ContaPoupanca();
		
		objeto1.depositar(1000);
		objeto2.depositar(1000);
		objeto3.depositar(1000);
		
		objeto1.atualizarSaldo(0.01);
		objeto2.atualizarSaldo(0.01);
		objeto3.atualizarSaldo(0.01);
		
		System.out.printf("O saldo contido no objeto um corresponde �: %.2f reais\n",objeto1.getSaldo());
		System.out.printf("O saldo contido no objeto dois corresponde �: %.2f reais\n",objeto2.getSaldo());
		System.out.printf("O saldo contido no objeto tr�s corresponde �: %.2f reais\n",objeto3.getSaldo());
	}
}
