import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		

		Float n1 ,n2 ,n3 ,n4 ,media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a Nota 1:");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a Nota 2:");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a Nota 3:");
		n3 = leia.nextFloat();
		System.out.println("\nEntre com a Nota 4:");
		n4 = leia.nextFloat();
		 
		media = (n1+n2+n3+n4)/4;
		 System.out.println("\nMédia Final: " + media);
		
		
	
	}

}
