package aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo4 {
    public static void main(String args[ ]){
        String texto;
        int gostandoJava,numero1;
        float numero2;
        double numero3;
        
        JOptionPane.showMessageDialog(null,"Bem vindo ao Java!!\n");
        texto = JOptionPane.showInputDialog("Mais uma vez, bem vindo ao Java.");
        gostandoJava = JOptionPane.showConfirmDialog(null, "Tá gostando de Java?");
        System.out.printf("O texto obtido na linha 21 foi: %s\n", texto);
        System.out.printf("O numero retornado do terceiro metodo foi: %d\n", gostandoJava);
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro!"));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com um número float!"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Entre com um número double!"));
        System.out.printf("O numero impresso no quarto metodo foi: %d\n", numero1);
        System.out.printf("O numero impresso no quinto metodo foi: %.3f\n", numero2);
        System.out.printf("O numero impresso no sexto metodo foi: %.3f\n", numero3);
    }
}
