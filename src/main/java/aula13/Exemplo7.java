/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula13;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exemplo7 {
	public static void main(String[] args) {
		LocalDateTime data = LocalDateTime.of(1970, 9, 11, 20, 30, 00);
		LocalDateTime hoje = LocalDateTime.now();
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Duration duracao = Duration.between(data, hoje);
		
		System.out.println("Data de referência: " + data.format(formatoData));
		System.out.println("Data atual: " + hoje.format(formatoData)+"\n\n");
		System.out.println("Dias que se passaram: "+duracao.toDays());
		System.out.println("Horas que se passaram: "+duracao.toHours());
		System.out.println("Minutos que se passaram: "+duracao.toMinutes());
		System.out.println("Milissegundos que se passaram: "+duracao.toMillis());
		System.out.println("Nanosegundos que se passaram: "+duracao.toNanos());
	}
}
