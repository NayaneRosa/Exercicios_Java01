package LaçosCondicionais;

import java.util.Scanner;

public class ExercicioLaçoCondicionalIf_01 { 
public static void main(String[] args) {
		
		
		int a, b, c, soma;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("\nVerificar se a soma A+B é maior, menor, ou igual C");
		
		
		System.out.print("\nInforme o valor de A: ");
		a = scan.nextInt();
		
		System.out.print("\nInforme o valor de B: ");
		b = scan.nextInt();
		
		System.out.print("\nInforme o valor de C: ");
		c = scan.nextInt();
		
		soma = a+b;
		
		if(soma > c) {
			System.out.println(a + " + " + b + " = " + soma + " > " + c + "\nA soma de A + B é maior que C" );
		}
		else if (soma < c) {
				System.out.println(a + " + " + b + " = " + soma + " < " + c + "\nA soma de A + B é menor que C" );
		}
			else if (soma == c ) {
					System.out.println(a + " + " + b + " = " + soma + " = " + c + "\nA soma de A+B é igual a C" );
			}
}
	
} 
	

	
			
		
		
	
	
	
	
	
	
	
	
	

