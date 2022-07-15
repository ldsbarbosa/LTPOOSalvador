package aula3;

/**
 *c )   Crie uma classe com um método que lê o nome e quatro notas de um aluno durante o semestre,
        calcula a média aritmética dessas notas. Se a nota for maior ou igual a (seis) o aluno será
        aprovado. Se a média for menor que seis, o programa deverá ler a nota do exame final e calcular
        a nova média, da seguinte forma: Média Final = (Média+Exame Final)/2. Nesse caso, para ser
        aprovado a média final deverá ser maior ou igual a cinco. Esse método deve ser chamado pelo
        método main de outra classe do mesmo projeto.
 * @author  Lucas da Silva Barbosa
 */
public class Exercicio3 {
    public static void main(String args[]){
	Classe3 umbu = new Classe3();
	umbu.alunoMedia();
    }
}
