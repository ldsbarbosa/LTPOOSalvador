package aula4;

import javax.swing.JOptionPane;

/**
 *b ) Refaça o exercício acima(Exercicio1.java) usando os métodos da classe JOptionPane.
 * @author Lucas da Silva Barbosa
 */
public class Exercicio2 {
    public static void main(String args[]) {
        float primeiraMedida, segundaMedida, terceiraMedida;
        Classe2 aracaBoi = new Classe2();

        JOptionPane.showMessageDialog(null,"Informe três comprimentos de um pedaço de madeira!\n");

        primeiraMedida = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira medida\n"));
        segundaMedida = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda medida\n"));
        terceiraMedida = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira medida\n"));

        aracaBoi.calculaComprimento(primeiraMedida,segundaMedida,terceiraMedida);
    }
}
