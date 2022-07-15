/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exemplo2 {
	public static void main(String[] args) {
		LocalDate data = LocalDate.now(); // Retorna a data neste instante
		LocalTime hora = LocalTime.now(); // Retorna a hora neste instante
		LocalDateTime dataHora = LocalDateTime.now(); // Retorna a data e hora neste instante
		LocalDate dataDefinida = LocalDate.of(2001,9,11); // Data de ataque às torres g�meas
		LocalDate textoConvertido = LocalDate.parse("2020-02-26"); // Data de início da pandemia no Brasil

		System.out.println(data);
		System.out.println(hora);
		System.out.println(dataHora);
		System.out.println(dataDefinida);
		System.out.println(textoConvertido);
	}
}
