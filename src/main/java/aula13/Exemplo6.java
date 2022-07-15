/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula13;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exemplo6 {
	public static void main(String[] args) {
		LocalDate data = LocalDate.of(1970, 9, 11);
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Period periodo = Period.between(data, hoje);
		
		System.out.println("Data de referência: " + data.format(formatoData));
		System.out.println("Data atual: " + hoje.format(formatoData));
		System.out.println("Já faz " + periodo.getYears() + " anos "
			+ periodo.getMonths() + " meses "
			+ periodo.getDays() + " dias desde "
			+ data.format(formatoData) + "\n\n\n");
	}
}
