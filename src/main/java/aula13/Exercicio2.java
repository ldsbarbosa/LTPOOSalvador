/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula13;

/*
Desenvolva um projeto completo em java, que verifica se o usu�rio sabe a data
em que o homem pisou na lua. Se ele acertar, apresente mais detalhes sobre
esse evento. Se ele errar, diga quanto anos a mais ou a menos ocorreu o evento
em relação ao palpite:
	Primeira Classe:
	o Instancie um objeto da segunda classe;
	o Chame o método que lê o palpite da data;
	
	Segunda Classe:
	o Pergunte ao usuário a data quando o homem pisou na lua;
	o O string de entrada deve seguir um determinado formato;
	o Envie o palpite da data para o método da segunda classe;
	o Realize o tratamento de exceção quanto à data (por exemplo, DateTimeParseException).

	Terceira Classe:
	o Crie um m�todo que recebe uma data como String;
	o Defina uma data de refer�ncia como "1969-07-20", usando os métodos da classe
	LocalDate;
	o Converta a data do String passado para o formato de data;
	o Use os métodos da classe LocalDate para comparar as datas;
	o Se acertar, mostre um pouco de informações sobre esse evento histórico;
	o Se errar, indique quantos anos antes ou depois o homem pisou na lua, em relação ao
	palpite. E redirecione para a leitura do palpite novamente.
 */
public class Exercicio2 {
	public static void main(String[] args) {
		Classe2 objeto1 = new Classe2();
		objeto1.leitorPalpite();
	}
}
