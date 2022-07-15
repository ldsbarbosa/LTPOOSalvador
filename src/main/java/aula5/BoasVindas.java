package aula5;

/**
 *
 * @author Lucas da Silva Barbosa
 */
class BoasVindas {
    private String nomeProfessor;
    public void setNomeProfessor(String nome){
        nomeProfessor = nome;
    }

    public String getNomeProfessor(){
        return nomeProfessor;
    }

    public void mostraMensagem(){
        System.out.printf("Bem vindo ao curso de Java do %s\n",getNomeProfessor());
    }
}
