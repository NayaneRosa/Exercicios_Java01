package LaçosdeRepetiçaao;

import java.util.Scanner;

public class ExercicioFor_01 {

	public static void main(String[] args) {
		
		int num1,num2,x;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\nDigite o 1º numero:");
		num1 = leia.nextInt();
		System.out.println("\nDigite o 2º numero:");
		num2 = leia.nextInt();
		
		if(num1>num2) {
			System.out.println("\nIntervalo inválido.");
		}else {
			for(x=num1;x<num2;x++) {
				if(x%3==0 && x%5==0) {
					System.out.println("No intervalo entre 10 e 100:");
					System.out.println(+x+ " é multiplo de 3 e 5");
					
				}
				
				}
			}
					}
		
		
	}
	

