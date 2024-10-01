package invertexto1;

import java.util.Scanner;

public class Ex1 {

	public static void main (String[] args) {
	    
	    int idadeanos, idademeses, idadedias, totaldias;
	    
	    Scanner input = new Scanner (System.in);
	    System.out.println("Insira os anos:");
	    idadeanos = input.nextInt();
	    System.out.println("Insira os meses:");
	    idademeses = input.nextInt();
	    System.out.println("Insira os dias:");
	    idadedias = input.nextInt();
	    
	    totaldias = idadeanos  * 365 + idademeses * 30 + idadedias;
	    
	    System.out.println("O resultado é: " + totaldias);

	}
}