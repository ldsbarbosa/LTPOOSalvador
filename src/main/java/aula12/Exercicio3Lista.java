/*
    Implementação de aplicação com menu para cálculo de área de figuras trigonométricas.
    Implemente um programa que atenda aos seguintes requisitos:
        O Programa deverá apresentar um menu com a seguinte interface:
        Programa de cálculo de áreas de figuras trigonométricas
            Opções:
            1 – Área de uma circunferência
            2 – Área de um triângulo
            3 – Sair
            Digite sua opção:
        • O programa deverá utilizar a biblioteca JOptionPane para as interfaces
        • O programa somente poderá ser encerrado quando o usuário selecionar a opção 3
        Dicas & Sugestões
        • Permita ao usuário selecionar a opção através da digitação de número inteiro
        • Armazene o menu em variável String
        menu = " Programa de cálculo de áreas de figuras trigonométricas”;
        menu += "\n\nOpções: \n1 – Área de uma circunferência”;
        menu += “\n2 – Área de um triângulo \n3-Sair \n\n Digite sua opção:”;
        • Utilize um laço for infinito para apresentar as opções de menu ao usuário
        • Utilize o método parseInt para transformar o valor digitado de string para número inteiro
 */
package aula12;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exercicio3Lista {
    public static void main(String[] args) {
        String mensagem;
        int decisao = 0;
        
        while(decisao != 3){
            mensagem = "Programa de cálculo de áreas de figuras trigonométricas";
            mensagem += "\n\nOpções: \n1 – Área de uma circunferência";
            mensagem += "\n2 – Área de um triângulo \n3 - Sair \n\n Digite sua opção:";
            decisao = Integer.parseInt( JOptionPane.showInputDialog(mensagem) );
            while(decisao != 1 && decisao != 2 && decisao != 3){
                decisao = Integer.parseInt( JOptionPane.showInputDialog("Digite 1, 2 ou 3") );
            }
            switch(decisao){
                case 1:
                    float raio, areaCircunferencia;
                    raio = Float.parseFloat( JOptionPane.showInputDialog("Entre com o raio.\nO número pode ser decimal.") );
                    areaCircunferencia = (float) (Math.PI * Math.pow(raio,2));
                    mensagem = String.format("A circunferência com o raio %.2f tem a área %.2f",raio,areaCircunferencia);
                    JOptionPane.showMessageDialog(null, mensagem);
                    break;
                case 2:
                    float base, altura, areaTriangulo;
                    base = Float.parseFloat( JOptionPane.showInputDialog("Entre com a base.\nO número pode ser decimal.") );
                    altura = Float.parseFloat( JOptionPane.showInputDialog("Agora, entre com a altura.") );
                    areaTriangulo = (base * altura) / 2;
                    mensagem = String.format("O triangulo com a base %.2f com a altura %.2f tem a área %.2f",base,altura,areaTriangulo);
                    JOptionPane.showMessageDialog(null, mensagem);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Você saiu do sistema.");
                    break;
            }
        }
    }
}
