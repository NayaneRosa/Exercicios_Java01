package LaçosCondicionais;

import java.util.Scanner;

public class ExercicioLaçoCondicionalSwitch_05 {

	public static void main(String[] args) {
		
		int op, quantidade; float total;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("\nOlá! Escolha uma opção:");
		
		System.out.println("\n*****************************");
		System.out.println("\n 1 - Cacchorro Quente - R$ 10,00\n 2 - X-Salada - R$ 15,00\n 3 - X-Bacon - R$ 18,00\n 4 - Bauru - R$ 12,00\n 5 - Refrigerante - R$ 8,00\n 6 - Suco de Laranja - R$ 13,00");
		System.out.println("\n*****************************");
		System.out.println("Digite a opção escolhida:");
		op = scan.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Opção escolhida: Cachorro-Quente\n Informe a quantidade?");
			quantidade = scan.nextInt();
			total = 10 * quantidade;
			System.out.println("O produto selecionado foi: Cachorro-Quente");
			System.out.printf("O valor total é: %.2f", total);
			break;
			
		case 2:
			System.out.println("Opção escolhida: X-Salada\n Informe a quantidade?");
			quantidade = scan.nextInt();
			total = 15 * quantidade;
			System.out.println("O produto selecionado foi: X-Salada");
			System.out.printf("O valor total é: %.2f", total);
			break;
			
		case 3:
			System.out.println("Opção escolhida: X-Bacon\n Informe a quantidade?");
			quantidade = scan.nextInt();
			total = 18 * quantidade;
			System.out.println("O produto selecionado foi: X-Bacon");
			System.out.printf("O valor total é: %.2f", total);
			break;
			
		case 4:
			System.out.println("Opção escolhida: Bauru\n Informe a quantidade?");
			quantidade = scan.nextInt();
			total = 12 * quantidade;
			System.out.println("O produto selecionado foi: Bauru");
			System.out.printf("O valor total é: %.2f", total);
			break;
			
		case 5:
			System.out.println("Opção escolhida: Refrigerante\n Informe a quantidade?");
			quantidade = scan.nextInt();
			total = 8 * quantidade;
			System.out.println("O produto selecionado foi: Refrigerante");
			System.out.printf("O valor total é: %.2f", total);
			break;
			
		case 6:
			System.out.println("Opção escolhida: Suco de Laranja\n Informe a quantidade?");
			quantidade = scan.nextInt();
			total = 13 * quantidade;
			System.out.println("O produto selecionado foi: Suco de Laranja");
			System.out.printf("O valor total é: %.2f", total);
			break;
			
		default: 
			System.out.println("Opção Inválida! Selecione Novamente.");
			
		}
			
		
	}

}
