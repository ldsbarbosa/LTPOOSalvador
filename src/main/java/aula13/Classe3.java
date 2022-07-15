package aula13;
/*
 *  o Use os m�todos da classe LocalDate para comparar as datas;
	o Se acertar, mostre um pouco de informa��es sobre esse evento hist�rico;
	o Se errar, indique quantos anos antes ou depois o homem pisou na lua, em rela��o ao
	palpite. E redirecione para a leitura do palpite novamente.
 *
 * @author Lucas da Silva Barbosa
 */
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Classe3 {

	public void comparandoPalpite(LocalDate dataHomemPalpite) {
		LocalDate dataHomemLua = LocalDate.parse("1969-07-20");
		Period periodoLua = Period.between(dataHomemLua, dataHomemPalpite);
		
		if(dataHomemLua.isEqual(dataHomemPalpite)) {
			JOptionPane.showMessageDialog(null,"-Você acertou!-");
			JOptionPane.showMessageDialog(null,"Os astronautas Neil Armstrong e Buzz Aldrin alunissaram o\n"
                                + " módulo lunar Eagle em 20 de julho de 1969 às 20h17min UTC.\n"
                                + " Armstrong tornou-se o primeiro humano a pisar na superfície lunar seis horas depois\n"
                                + " já no dia 21, seguido por Aldrin vinte minutos depois.");
		}else {
			if(!dataHomemLua.isBefore(dataHomemPalpite)) {
				System.out.println("-A data está mais a frente!-");
				System.out.println("Data inserida: " + dataHomemPalpite);
				System.out.println("Comparando a data inserida com a data que o homem foi a lua:\n"
				 	+ (periodoLua.getYears()*-1) + " anos á frente\n"
				 	+ (periodoLua.getMonths()*-1) + " meses á frente\n"
				 	+ (periodoLua.getDays()*-1) + " dias á frente.");
			}else {
				System.out.println("-A data est� mais atrás!-");
				System.out.println("Data inserida: " + dataHomemPalpite);
				System.out.println("Comparando a data inserida com a data que o homem foi a lua:\n"
				 	+ periodoLua.getYears() + " anos atrás\n"
				 	+ periodoLua.getMonths() + " meses atrás\n"
				 	+ periodoLua.getDays() + " dias atrás.");
			}
			Classe2 objeto1 = new Classe2();
			objeto1.leitorPalpite();
		}
	}
}
