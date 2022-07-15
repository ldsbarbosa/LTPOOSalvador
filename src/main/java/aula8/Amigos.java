package aula8;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Amigos extends Familia {
    @Override//marca que o método da superclasse foi reescrito
    public void mostraNome() {
        System.out.println("Salvador");
    }
    public void teste(){
        System.out.print("Chamando o método da superclasse: ");
        super.mostraNome();// Chama o metodo da superclasse
        System.out.print("Chamando o método da subclasse, atual : ");
        mostraNome();//CHama o  metodo dessa classe
    }

}
