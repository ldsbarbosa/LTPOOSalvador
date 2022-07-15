/*
 * Classe 3: deve ler um número de CPF, chamar o método que valida o CPF e de
		acordo com a resposta do tipo boolean, informar se o CPF é válido ou não.
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class Classe3 {
	private boolean CPFValidado;
	public void leitorDeCPF(String CPF) {
		Classe2 objeto1 = new Classe2();
		this.CPFValidado = objeto1.metodoDaClasse2(CPF);
		if (this.CPFValidado) {
			System.out.println("O CPF é válido!!! Classe 3");
		}else {
			System.out.println("O CPF é INVALIDO!!! :( Classe 3");
		}
	}
}
