/*
 * Classe 2: deve ter dois métodos com o mesmo nome e parámetros diferentes
		(sobrecarga de método);
		Um método deve receber o número de CPF (String), converter para um vetor de inteiros e
		verificar se o mesmo é válido ou não e retornar um valor boolean (true para CPF
		válido e false para CPF inválido).
		O outro método não deve receber parámetro algum, mas deve retornar um
		número de CPF válido como sendo um array int.

 * @author Lucas da Silva Barbosa
 */
package aula12;
import java.util.Random;
public class Classe2 {
	private boolean CPFValido;
	
	public boolean metodoDaClasse2(String CPF) {
		int[] CPFTratado = new int[11], CPFTeste = new int[11];
		int index,somatorio,numero, resto1,resto2;
		
		for(index = 0; index < CPFTratado.length; index++) {
			switch(CPF.charAt(index)){
				case '0':
					CPFTratado[index] = 0;
					break;
				case '1':
					CPFTratado[index] = 1;
					break;
				case '2':
					CPFTratado[index] = 2;
					break;
				case '3':
					CPFTratado[index] = 3;
					break;
				case '4':
					CPFTratado[index] = 4;
					break;
				case '5':
					CPFTratado[index] = 5;
					break;
				case '6':
					CPFTratado[index] = 6;
					break;
				case '7':
					CPFTratado[index] = 7;
					break;
				case '8':
					CPFTratado[index] = 8;
					break;
				case '9':
					CPFTratado[index] = 9;
					break;
			}
		}
		index = 0;
		while(index < 10) {
			CPFTeste[index] = CPFTratado[index];
			index++;
		}
		
		// Primeiro digito verificador
		somatorio = 0;
		numero = 10;
		for(index = 0; index < 9; index++) {
			somatorio += (numero*CPFTeste[index]);
			numero--;
		}
		resto1 = (somatorio * 10) % 11;
		//Segundo digito verificador
		somatorio = 0;
		numero = 11;
		for(index = 0; index < 10; index++) {
			somatorio += (numero*CPFTeste[index]);
			numero--;
		}
		resto2 = (somatorio * 10) % 11;
		if(CPFTratado[9] == resto1 && CPFTratado[10] == resto2) {
			this.CPFValido = true;
			return this.CPFValido;
		}else {
			this.CPFValido = false;
			return this.CPFValido;
		}
	}
	
	public int[] metodoDaClasse2() {
		Random aleatorio = new Random();
		int[] CPF = new int[11];
		int index,somatorio,numero, resto1,resto2;
		
		for(index = 0; index < CPF.length - 2; index++) {
			CPF[index] = aleatorio.nextInt(10);
		}
				
		// Primeiro digito verificador
		somatorio = 0;
		numero = 10;
		for(index = 0; index < 9; index++) {
			somatorio += (numero*CPF[index]);
			numero--;
		}
		CPF[9] = (somatorio * 10) % 11;
		//Segundo digito verificador
		somatorio = 0;
		numero = 11;
		for(index = 0; index < 10; index++) {
			somatorio += (numero*CPF[index]);
			numero--;
		}
		CPF[10] = (somatorio * 10) % 11;
		return CPF;
	}
}
