package aula3;

import java.util.Scanner;

/**
 *
 * @author  Lucas da Silva Barbosa
 */
public class Classe7 {
    public void potencia() {
            int base,expoente;
            double resultado;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Escolha a base desejado: ");
            base = leitor.nextInt();
            System.out.println("Escolha o expoente desejada: ");
            expoente = leitor.nextInt();
            resultado = Math.pow(base,expoente);
            System.out.printf("O resultado da potenciação é de: %.1f ",resultado);
    }
    
    public void numeroPrimo() {//Com boolean, uso de while
            int indice=2,numeroPrimo;
            boolean ePrimo = true;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Escolha o numero desejado: ");
            numeroPrimo = leitor.nextInt();

            while(indice < numeroPrimo && ePrimo){
                    if(numeroPrimo%indice==0) {
                            ePrimo = false;
                    }
                    indice++;
            }
            if(ePrimo)
                    System.out.println("O numero é primo!");
            else
                    System.out.println("O numero é não primo. :-(");
    }
    
    public void numeroPrimo2() {//Sem boolean, uso de for
            int numeroDeDivisores=1;
            int numeroEscolhido;
            Scanner leitor = new Scanner(System.in);

            System.out.println("Escolha um numero inteiro positivo maior do que 1: ");
            numeroEscolhido = leitor.nextInt();

            for(int indice = 2;indice <= numeroEscolhido;indice++) {
                    if(numeroEscolhido%indice == 0) {
                            numeroDeDivisores++;
                    }
            }

            if(numeroDeDivisores <= 2)
                    System.out.println("O numero é primo!");
            else
                    System.out.println("O numero é não primo. :-(");		
    }
}
