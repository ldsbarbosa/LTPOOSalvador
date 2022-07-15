/**
 *
 * @author Lucas da Silva Barbosa
 */
package aula13;

import java.time.Instant;

public class Exemplo1 {
	public static void main(String[] args) {
		Instant agora = Instant.now();
		
		System.out.println("Tempo depois do laço: "+agora);
		
		double x;
		for(int i=0;i<99999;i++) { // Esse laço serve para passar o tempo
			x = Math.pow(i,i);}
		
		agora = Instant.now();
		System.out.println("Tempo depois do laço: "+agora);
	}
}
