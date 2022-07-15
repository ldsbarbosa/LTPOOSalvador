package aula2;

import java.util.Scanner;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo7 {
    public static void main(String args[]) {
	 String var;
	 Scanner x;
         x = new Scanner(System.in);
	 
	 System.out.println("Entrada de string no Java!\n");
	 System.out.println("Digite um nome");
	 var = x.nextLine();
	 System.out.println("Nome armazenado na variável: "+var);
    }
}
