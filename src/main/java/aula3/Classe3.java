package aula3;

import java.util.Scanner;

/**
 *
 * @author  Lucas da Silva Barbosa
 */
public class Classe3 {
    public void alunoMedia(){
	float nota1,nota2,nota3,nota4;
	Scanner leitor = new Scanner(System.in);
        
	System.out.println("Informe a primeira nota inteiro");
	nota1 = leitor.nextFloat();
	System.out.println("Informe a segunda nota inteiro");
	nota2 = leitor.nextFloat();
	System.out.println("Informe a terceira nota inteiro");
	nota3 = leitor.nextFloat();
	System.out.println("Informe a quarta nota inteiro");
	nota4 = leitor.nextFloat();
	float media = (nota1+nota2+nota3+nota4)/4;
        
	if(media >= 6)
            System.out.printf("O aluno foi aprovado com a nota %f!",media);
	else {
            float exameFinal,notaFinal;
            System.out.printf("A media foi menor que 6. Informe a nota do exame final.\n");
            
            exameFinal = leitor.nextFloat();
            notaFinal = (media+exameFinal)/2;
            
            if(notaFinal >= 5) {
                System.out.println("O aluno conseguiu se recuperar e passar de ano!!!!\n");
            }
            else
                System.out.printf("Infelizmente, o aluno foi reprovado com a nota %.2f\n",notaFinal);
	}
    }
    
}
