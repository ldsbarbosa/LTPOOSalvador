package aula12;

/**
 *
 * @author Lucas da Silva Barbosa
 */
class ClasseComparaGenoma {
    private String genomaBase;
    private String genomaOcorrencia;
    
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
    
    public void comparaGenoma(){
        int indiceDoGenomaBase = 0,
            indiceDasPosicoesDasOcorrencias = 0,
            tamanhoGenOcorrencia = getGenomaOcorrencia().length(),
            ocorrencias = 0,
            contador = 0
            ;
        int[] posicoes = new int[5];
        
        for(indiceDoGenomaBase = 0; indiceDoGenomaBase < getGenomaBase().length();indiceDoGenomaBase++){
            //Primeiro a comparação
            if(getGenomaBase().charAt(indiceDoGenomaBase) == getGenomaOcorrencia().charAt(contador)){
                contador++;
            }else{
                contador = 0;
            }
            //Depois o registro de ocorrências e posições
            if(contador == tamanhoGenOcorrencia - 1){
                posicoes[indiceDasPosicoesDasOcorrencias] = indiceDoGenomaBase - contador + 2;
                indiceDasPosicoesDasOcorrencias++;
                ocorrencias++;
                contador = 0;
            }
        }
        System.out.println("-INFORMAÇÕES!!-");
        System.out.printf("Genoma ocorrencia: %S\nGenoma base: %S\nQuantidade de ocorrências: %d\n",getGenomaOcorrencia(),getGenomaBase(),ocorrencias);
        for(int i = 0; i < posicoes.length; i++){
            if(posicoes[i] != 0){
                System.out.printf("Posição de número %d - %d\n",(i+1),posicoes[i]);
            }
        }
    }
}
