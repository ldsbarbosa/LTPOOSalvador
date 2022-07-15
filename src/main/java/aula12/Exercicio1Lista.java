/*
Crie 4 classes dentro do mesmo pacote segundo os critérios abaixo:
	Classe 1: deve ter o método principal, que use o switch para criar ou validar um CPF.
	Classe 2: deve ter dois métodos com o mesmo nome e parámetros diferentes
		(sobrecarga de método);
		Um método deve receber o número de CPF (String), converter para array int e
		verificar se o mesmo é válido ou não e retornar um valor boolean (true para CPF
		válido e false para CPF inválido).
		O outro método não deve receber parámetro algum, mas deve retornar um
		número de CPF válido como sendo um array int.
	Classe 3: deve ler um número de CPF, chamar o método que valida o CPF e de
		  acordo com a resposta do tipo boolean, informar se o CPF é válido ou não.
	Classe 4: deve chamar o método que cria um CPF e mostrar o número gerado no
		  formato array int.
 */
/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula12;
import java.util.Scanner;

public class Exercicio1Lista {// Classe 1
	public static void main(String[] args) {
		//Criando vari�veis
		boolean cpfValidado;
		int[] CPFGerado;
		int decisao;
		String CPF;
		//Instanciando objetos
		Scanner leitor = new Scanner(System.in);
		Classe2 objeto1 = new Classe2();
		Classe3 objeto2 = new Classe3();
		Classe4 objeto3 = new Classe4();
		System.out.println("Lembrete: O CPF possui 11 caracteres");
		System.out.println("Digite 1 para validar o CPF ou 2 para gerar um CPF");
		decisao = leitor.nextInt();
		switch(decisao) {
			case 1:
				System.out.println("Insira um CPF abaixo(Sem pontos e traço)!");
				CPF = leitor.nextLine();
				CPF = leitor.nextLine();
				objeto2.leitorDeCPF(CPF);
				break;
			case 2:
				System.out.println("Será gerado um CPF para você sem pontos e traço");
				objeto3.demonstradorDeCPF();
				break;
			default:
				System.out.println("Insira 1 ou 2!!!");
				break;
		}
	}
}
