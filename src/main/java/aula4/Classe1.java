package aula4;

/**
 *
 * @author Lucas da Silva Barbosa
 */
public class Classe1 {
    
	public int calculaComprimento(float primeiraMedida, float segundaMedida, float terceiraMedida){
		if(primeiraMedida > segundaMedida + terceiraMedida || segundaMedida > primeiraMedida + terceiraMedida || terceiraMedida > segundaMedida + primeiraMedida) {
			System.out.println("Não dá para fazer um triângulo! Lamento...");
			return 1;
		}else{
			System.out.println("É possível fazer um triângulo. :-)");
			verificaTipoDoTriangulo(primeiraMedida, segundaMedida, terceiraMedida);
			return 0;
		}
	}
	
	public void verificaTipoDoTriangulo(float primeiraMedida, float segundaMedida, float terceiraMedida) {
		if(primeiraMedida == segundaMedida && segundaMedida == terceiraMedida) {
			System.out.println("O triângulo é equilatero!");
		}else {
			if(primeiraMedida == segundaMedida || segundaMedida == terceiraMedida || primeiraMedida == terceiraMedida) {
				System.out.println("O triângulo é isósceles!");
			}else {
				System.out.println("O triângulo é escaleno!");
			}
		}
	}  
}
