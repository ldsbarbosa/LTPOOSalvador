/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exemplo8 {
	public static void main(String[] args) {
		LocalDateTime brasilia = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm VV");

		ZonedDateTime fusoSaoPaulo = ZonedDateTime.of(brasilia,ZoneId.of("America/Sao_Paulo"));
		System.out.println(fusoSaoPaulo.format(formato));

		ZonedDateTime fusoNewYork = fusoSaoPaulo.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(fusoNewYork.format(formato));
	}
}
