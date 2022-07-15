package aula5;

/**
 *
 * @author Lucas da Silva Barbosa
 */
class BoasVindas2 {
    private String nomeProfessor;

    public String getNomeProfessor(){
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public void mostraMensagem(){
        System.out.printf("Bem vindo ao curso de Engenharia de Software do %s\n",getNomeProfessor());
    }
}
