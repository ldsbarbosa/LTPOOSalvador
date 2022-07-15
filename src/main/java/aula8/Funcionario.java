package aula8;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Funcionario {
    private String nome;
    private String endereco;
    private String telefone;

   
    public String getNome() {// Getter e setter de nome
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEndereco() {// Getter e setter de endereço
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {// Getter e setter de telefone
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
