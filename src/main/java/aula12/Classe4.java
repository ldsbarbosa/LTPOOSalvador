/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
public class Classe4 {
	private int[] CPFGerado;
	public void demonstradorDeCPF() {
		Classe2 objeto1 = new Classe2();
		this.CPFGerado = objeto1.metodoDaClasse2();
		System.out.printf("O CPF Gerado foi: ");
		for(int i = 0; i < 11; i++) {
			System.out.printf("%d",CPFGerado[i]);
		}
		System.out.println("");
	}
}
