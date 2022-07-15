package aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo6 {
    public static void main(String[] args){
        String saida;
        MinhasJanelas primeiraVariavel = new MinhasJanelas();
        saida = primeiraVariavel.exemploGUI();
        JOptionPane.showMessageDialog(null,saida);
    }
}
