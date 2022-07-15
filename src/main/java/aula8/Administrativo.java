package aula8;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Administrativo extends Funcionario{
    private String cargo;
    private float salario;

    
    public String getCargo() {// Getter e setter para cargo
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    public float getSalario() {// Getter e setter para salario
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
