package aula8;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Professor2 extends Funcionario{
    private String disciplinaMinistrada;
    private float valorHoraAula;
    
    public String getDisciplinaMinistrada() {// Getter e setter para disciplinaMinistrada
        return disciplinaMinistrada;
    }
    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    
    public float getValorHoraAula() {// Getter e setter para valorHoraAula
        return valorHoraAula;
    }
    public void setValorHoraAula(float valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
    
}
