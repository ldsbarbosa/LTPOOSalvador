package aula6;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo2 {
    public static void main(String[ ] args){
        Sobrecarga var = new Sobrecarga();//instancia um objeto da classe Sobrecarga
        var.calcula(2.5); //chama o método calcula( ) e passa 1 parâmetro
        var.calcula(7,3); //chama o método calcula( ) e passa 2 parâmetros
    }
}
