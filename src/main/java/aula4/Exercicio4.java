package aula4;

import javax.swing.JOptionPane;

/**
 *d )   Crie uma classe com um método chamdo maiorValor, que recebe 2 valores e retorna o maior.
        Cria uma classe com o método main que lê dois números pelo teclado, chama o método
        maiorValor e mostra uma frase informando que é o maior valor, a partir do retorno do método
        maiorValor. Use os métodos da classe JOptionPane.
 * @author Lucas da Silva Barbosa
 */
public class Exercicio4 {
    public static void main(String args[]) {
        int valor1,valor2;
        Classe3 mandioca = new Classe3();
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor."));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor."));

        mandioca.maiorValor(valor1,valor2);
    }
}
