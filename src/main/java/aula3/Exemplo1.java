package aula3;

import java.util.Scanner;

/**
 *
 * @author  Lucas da Silva Barbosa
 */
public class Exemplo1 {
    public static void main(String args[]) {
        int opcao;
        Scanner valor = new Scanner(System.in);

        System.out.println("Se preferir praia, digite 1.\n"
            +"Se preferir montanha, digite 2");
        opcao = valor.nextInt();

        while(opcao!=2 && opcao !=1) {
            System.out.println("Escolha ou 1 ou 2!!");
            opcao = valor.nextInt();
        }
        if(opcao==1)
            System.out.println("Você prefere praia");
        if(opcao==2)
            System.out.println("Você prefere montanha");
    }
}
