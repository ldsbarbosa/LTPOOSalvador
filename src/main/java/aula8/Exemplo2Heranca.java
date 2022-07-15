package aula8;
import java.util.Scanner;
/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Exemplo2Heranca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Professor objeto2 = new Professor();
        Aluno objeto1 = new Aluno();
        
        System.out.println("Qual o nome do aluno?");
        objeto1.setNome(leitor.nextLine());
        
        System.out.println("Qual o CPF do "+objeto1.getNome()+"?");
        objeto1.setCpf(leitor.nextLine());
        
        System.out.println("Qual a matrícula do CPF: "+objeto1.getCpf()+"?");
        objeto1.setMatricula(leitor.nextLine());
        
        System.out.println("Qual o nome do professor?");
        objeto2.setNome(leitor.nextLine());
        
        System.out.println("Qual a titulação do Professor "+objeto2.getNome()+"?");
        objeto2.setTitulacao(leitor.nextLine());
        
        System.out.println("O "+objeto2.getTitulacao()+" "
        +objeto2.getNome()+" é professor do "+ objeto1.getNome() + " que possui matricula "
        +objeto1.getMatricula());

    }
}
