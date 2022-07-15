package aula11;

/**
 *
 * @author Lucas da Silva Barbosa
 */

public class SegundaClasse {
    private boolean eMaior;

    public boolean verificaIdade(int idade) throws ArithmeticException {
        if (idade >= 18) {
            this.eMaior = true;
            return eMaior;
        }else{
            if(idade >= 0) {
                this.eMaior = false;
                return eMaior;
            }else{
                throw new ArithmeticException("O numero é negativo. Não existe idade negativa."); 
            }
        }
    }
}
