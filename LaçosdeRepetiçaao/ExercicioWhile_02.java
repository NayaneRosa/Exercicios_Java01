package LaçosdeRepetiçaao;

import java.util.Scanner;

public class ExercicioWhile_02 {

	public static void main(String[] args) {
		
		int num, quantPar = 0, quantImpar = 0, x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=10;x++) {
			
			System.out.println("\nDigite o "+x+"º número: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				quantPar++;
			}
			
			else {
				quantImpar++;
			}
		}
		
		
		System.out.println(" Total de números pares: "+ quantPar);
		System.out.println(" Total de números impares: "+ quantImpar);
		
		leia.close();
		
		
		

	}

}
