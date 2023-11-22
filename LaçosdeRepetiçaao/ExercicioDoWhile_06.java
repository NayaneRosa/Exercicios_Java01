package LaçosdeRepetiçaao;

import java.util.Scanner;

public class ExercicioDoWhile_06 {

	public static void main(String[] args) {
		
		int num = 0, total= 0, contador=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um numero:");
			num = leia.nextInt();
			if (num %3 == 0 && num != 0) {
				
				total +=num;
				contador ++;
			}
			
		} while (num != 0);
		
		media = (float)total / contador;
		System.out.printf("A média de todos os números multiplos de 3 é: %.2f", media);
		leia.close();
		
			}
		}
