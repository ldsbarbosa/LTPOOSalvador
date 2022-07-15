/*
As moléculas de DNA (moléculas que contêm material genético) podem ser representadas por cadeias de caracteres que usam um alfabeto de apenas 4 letras:
‘A’, ‘C’, ‘T’ e ‘G’. Um exemplo de uma tal cadeia é:
 */
package aula12;

/**
 *
 * @author Lucas da Silva Barbosa
 */
import java.util.Random;

public class ClasseGeraGenoma {

    private String genomaBase = ""; // Max 25 caracteres
    private String genomaOcorrencia = ""; // Max 4 caracteres
    
    public String getGenomaBase() {
        return genomaBase;
    }

    public void setGenomaBase(String genomaBase) {
        this.genomaBase = genomaBase;
    }

    public String getGenomaOcorrencia() {
        return genomaOcorrencia;
    }

    public void setGenomaOcorrencia(String genomaOcorrencia) {
        this.genomaOcorrencia = genomaOcorrencia;
    }
    
    public String geraGenomaBase(){
        int decisao;
        Random aleatorio = new Random();
        for(int i = 0; i < 25; i++){
            decisao = aleatorio.nextInt(4);
            switch(decisao){
                case 0:
                    this.genomaBase += 'A';
                    break;
                case 1:
                    this.genomaBase += 'C';
                    break;
                case 2:
                    this.genomaBase += 'T';
                    break;
                case 3:
                    this.genomaBase += 'G';
                    break;
                default:
                    break;
            }
        }
        return this.genomaBase;
    }
    public String geraGenomaOcorrencia(){
        int decisao;
        Random aleatorio = new Random();
        for(int i = 0; i < 4; i++){
            decisao = aleatorio.nextInt(4);
            switch(decisao){
                case 0:
                    this.genomaOcorrencia += 'A';
                    break;
                case 1:
                    this.genomaOcorrencia += 'C';
                    break;
                case 2:
                    this.genomaOcorrencia += 'T';
                    break;
                case 3:
                    this.genomaOcorrencia += 'G';
                    break;
                default:
                    break;
            }
        }
        return this.genomaOcorrencia;
    }
}
