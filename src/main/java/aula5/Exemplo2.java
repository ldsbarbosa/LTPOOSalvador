package aula5;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo2 {
    public static void main(String[] args) {
        BoasVindas primeiraMensagem = new BoasVindas( );
        BoasVindas segundaMensagem = new BoasVindas( );

        primeiraMensagem.setNomeProfessor("Salvador");
        primeiraMensagem.mostraMensagem( );

        segundaMensagem.setNomeProfessor("Melo");
        segundaMensagem.mostraMensagem( );

        primeiraMensagem.mostraMensagem( );
    }
}
