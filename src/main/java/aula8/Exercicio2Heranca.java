package aula8;
import javax.swing.JOptionPane;
/**
 *2.2 - Dados dos carros:
     Uma classe MeioDeTransporte com atributos ligado (boolean) e velocidade (inteiro) e
    métodos liga() e desliga (). O método ligado torna o atributo ligado true e o método desliga
    torna o atributo ligado false, além de tornar a velocidade zero. Crie também métodos get e
    set para modificar o atributo velocidade, sendo que a velocidade não pode ser negativa.
     Uma subclasse de MeioDeTransporte chamada Carro. Carro deve ter os atributos marca
    (String), nome (String) e quilometragem (tipo int) e os métodos necessários para ler os
    atributos e alterá-los (get e set). A quilometragem não pode ser negativa, nem ultrapassar o
    valor 999999. A velocidade do Carro não pode ser negativa, nem ultrapassar 200.
    *  Uma classe que contenha o método main que permita ao usuário digitar os dados de 5
    carros. Adicione os objetos em um array de carro. Por fim exiba os dados
    dos 5 carros em uma JOptionPane.showMessageDialog.
 * @author Lucas da Silva Barbosa
 */
public class Exercicio2Heranca {
    public static void main(String[] args) {
        Carro objeto1 = new Carro();
        String[][] listaCarros = new String[5][5];
        int indice1, indice2, decisao;
        
        JOptionPane.showMessageDialog(null,"Insira os dados dos carros à seguir!");
        
        for(indice1 = 0; indice1 < 5; indice1++){ // Primeiro laço for percorre todas as caracteristicas de um único carro. A cada passada, muda o carro.
            indice2 = 0; // Indice 2 é responsável por acessar cada caracteristíica de um único carro. Mudou o indice, mudou a característica acessada do carro em específico
            
            objeto1.setNome(JOptionPane.showInputDialog("Nome do carro: "));// Inserção do nome do carro
            listaCarros[indice1][indice2] = objeto1.getNome();
            indice2++;
            objeto1.setMarca(JOptionPane.showInputDialog("Marca do carro: "));// Inserção da marca do carro
            listaCarros[indice1][indice2] = objeto1.getMarca();
            indice2++;
            objeto1.setVelocidade(Integer.parseInt(JOptionPane.showInputDialog("Velocidade do carro: ")));// Inserção da velocidade do carro
            listaCarros[indice1][indice2] = String.format("%d",objeto1.getVelocidade());
            indice2++;
            objeto1.setQuilometragem(Integer.parseInt(JOptionPane.showInputDialog("Quilometragem do carro: ")));// Inserção da quilometragem do carro
            listaCarros[indice1][indice2] = String.format("%d",objeto1.getQuilometragem());
            indice2++;
            decisao = JOptionPane.showConfirmDialog(null, "O Carro está ligado? ");// Inserção do status do carro
            switch(decisao){
                case 0:
                    objeto1.liga();
                    listaCarros[indice1][indice2] = String.format("%b",objeto1.getLigado());
                    break;
                case 1:
                case 2:
                    objeto1.desliga();
                    listaCarros[indice1][indice2] = String.format("%b",objeto1.getLigado());
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Escolha entre alguma opção.");
                    break;
            }
        }
        String mensagem = "Lista dos carros:\nNome | Marca | Velocidade | Quilometragem | Status\n";
        String mensagem2 = "";
        for(indice1 = 0; indice1 < 5; indice1++){
            for(indice2 = 0; indice2 < 5; indice2++){
                if(indice2 < 4){
                    mensagem2 = listaCarros[indice1][indice2]+" | ";
                    mensagem += mensagem2;
                }else{
                    mensagem2 = listaCarros[indice1][indice2]+"\n";
                    mensagem += mensagem2;
                }
            }
        }
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
