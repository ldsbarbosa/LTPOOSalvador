package aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Classe2 {
    public int calculaComprimento(float primeiraMedida, float segundaMedida, float terceiraMedida){
        if(primeiraMedida > segundaMedida + terceiraMedida || segundaMedida > primeiraMedida + terceiraMedida || terceiraMedida > segundaMedida + primeiraMedida) {
            JOptionPane.showMessageDialog(null,"Não dá para fazer um triângulo! Lamento...");
            return 1;
        }else{
            JOptionPane.showMessageDialog(null,"É possível fazer um triângulo. :-)");
            verificaTipoDoTriangulo(primeiraMedida, segundaMedida, terceiraMedida);
            return 0;
        }
    }
	
    private void verificaTipoDoTriangulo(float primeiraMedida, float segundaMedida, float terceiraMedida) {
        if(primeiraMedida == segundaMedida && segundaMedida == terceiraMedida) {
            JOptionPane.showMessageDialog(null,"O triângulo é equilatero!");
        }else {
            if(primeiraMedida == segundaMedida || segundaMedida == terceiraMedida || primeiraMedida == terceiraMedida) {
                JOptionPane.showMessageDialog(null,"O triângulo é isósceles!");
            }else {
                JOptionPane.showMessageDialog(null,"O triângulo é escaleno!");
            }
        }
    }
}
