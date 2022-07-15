/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula13;

import java.time.LocalDate;

public class Exemplo5 {
	public static void main(String[] args) {
		LocalDate data1 = LocalDate.now();
		LocalDate data2 = LocalDate.parse("2020-02-26");
		
                System.out.println(data1.isAfter(data2));
		System.out.println(data1.isBefore(data2));
		System.out.println(data1.isEqual(data2));
	}
}
