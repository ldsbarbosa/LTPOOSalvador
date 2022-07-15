package aula10;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Verificar {
    
    public void verificaArquivo(File arq) {
        if (arq.exists()){
            System.out.println("Arquivo existe");
        }else{
            try{
                arq.createNewFile();
            }catch( IOException e ){
		System.out.println(e);
            }
            if( arq.exists() ){
                System.out.println("Arquivo criado com sucesso");
                System.out.println(arq.getPath());
            }
            arq.listFiles();
        }
    }
    
}
