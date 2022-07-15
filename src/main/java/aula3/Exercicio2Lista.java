package aula3;

import java.util.Scanner;

/**
 *2. Desenvolva:
         Uma classe com um método principal que pergunta se o usuário quer: a) calcular a
        parte inteira do quociente entre dois valores; b) Calcular a divisão normal; c) Calcular o
        resto da divisão entre dois valores inteiros. De acordo com a resposta, o método main
        deverá chamar o respectivo método. Cada um desses 3 métodos deve estar em uma
        classe pública distinta.
         Uma classe com um método que lê dois valores e calcula a parte inteira do quociente
        dos valores lidos.
         Uma classe com um método que lê dois valores e calcula o resto da divisão dos valores
        lidos.
         Uma classe com um método que lê dois valores e calcula a divisão normal dos valores
        lidos.
 * @author  Lucas da Silva Barbosa
 */
public class Exercicio2Lista {
    public static void main(String args[]) {
        Classe6 goiaba = new Classe6();
        Scanner leitor = new Scanner(System.in);
        int decisao;
        
        System.out.println("Escolha um metodo desejado: ");
        System.out.println("1- Calcular a parte inteira do quociente entre dois valores");
        System.out.println("2- Calcular a divisão normal");
        System.out.println("3- Calcular o resto da divisão entre dois valores inteiros.");
        decisao = leitor.nextInt();
        
        if(decisao == 1)
            goiaba.quocienteInteiro();
        if(decisao == 2)
            goiaba.divisaoNormal();
        if(decisao == 3)
            goiaba.restoDivisao();
    }
}
