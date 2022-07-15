package aula5;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo3 {
    public static void main(String[] args) {
        BoasVindas2 primeiraMensagem = new BoasVindas2( );
        BoasVindas2 segundaMensagem = new BoasVindas2( );

        primeiraMensagem.setNomeProfessor("Fábio");
        primeiraMensagem.mostraMensagem( );

        segundaMensagem.setNomeProfessor("Mendonca");
        segundaMensagem.mostraMensagem( );

        primeiraMensagem.mostraMensagem( );
    }
}
