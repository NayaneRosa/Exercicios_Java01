package LaçosdeRepetiçaao;

import java.util.Scanner;

public class ExercicioWhile_03 {
	
public static void main(String[] args) {
		
	int idade,quantMenor21=0,quantMaior50=0;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite uma idade: ");
	idade = leia.nextInt();
	
	while(idade>=0) {
		if(idade<21) {
			quantMenor21++;
		}
		if(idade>50) {
			quantMaior50++;
		}
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
	}
	
	System.out.println("\nTotal de pessoas menores de 21 anos: "+quantMenor21+"");
	System.out.println("\nTotal de pesssoas maiores de 50 anos: "+quantMaior50+"");

}
}


