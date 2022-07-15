/**
 *8.1.  Mostre quantos anos, dias, meses, minutos e segundo se passaram desde o seu
        nacismento
 * @author Lucas da Silva Barbosa
 */
package aula13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class Exercicio1 {
	public static void main(String[] args) {
		LocalDateTime nascimento = LocalDateTime.of(1999, 5, 30, 10, 20, 50); // Data de nascimento: 10:20:50 30/05/1999
		LocalDateTime hoje = LocalDateTime.now();
                Duration duracao = Duration.between(nascimento, hoje);
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data que eu nasci: "+nascimento.format(formatoData));
		System.out.println("Data de hoje: "+hoje.format(formatoData));
                
                System.out.println("\nDias que se passaram desde o nascimento: "+duracao.toDays());
		System.out.println("Horas que se passaram desde o nascimento: "+duracao.toHours());
		System.out.println("Minutos que se passaram desde o nascimento: "+duracao.toMinutes());
		System.out.println("Milissegundos que se passaram desde o nascimento: "+duracao.toMillis());
		System.out.println("Nanosegundos que se passaram desde o nascimento: "+duracao.toNanos());
	}
}
