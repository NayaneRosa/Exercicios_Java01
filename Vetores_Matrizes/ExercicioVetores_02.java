package Vetores_Matrizes;

import java.util.Scanner;

public class ExercicioVetores_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, soma = 0;
		float media;
		int vetor[] = new int [10];
		
		for (x=0; x<10; x++) {
			System.out.println("Digite o "+(x+1)+"º número: ");
			vetor[x] = leia.nextInt();
			soma += vetor[x];
		}
		
		System.out.println("\n Elementos nos índices ímpares: ");
		for(x=1; x<vetor.length; x+=2) {
			System.out.println(vetor[x]);
		}
		
		System.out.println("\n Elementos pares: ");
		for(x=0; x<vetor.length; x++) {
			if(vetor[x] %2 ==0)
			System.out.println(vetor[x]);
		}
		
		System.out.println("\n Soma:"+soma);
		media = (float) soma/ 10;
		System.out.println("\nMédia: "+media);
	}
	
}
