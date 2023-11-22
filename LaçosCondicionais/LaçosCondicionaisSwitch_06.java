package LaçosCondicionais;

import java.util.Scanner;

public class LaçosCondicionaisSwitch_06 {

	public static void main(String[] args) {
		
		String nome;
		float salario, novoSalario;
		int op;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Seja bem-vindo ao sistema de Cálculo para Reajuste de Sálario");
		
		System.out.println("Informe seu nome:");
		nome = scan.nextLine();
		
		System.out.println("\nOlá "+nome+ "!\nSelecione a opção conrrespondente ao seu cargo: ");
		System.out.println(" 1 - Gerente - Percentual de Reajuste: 10%\n 2 - Vendedor - Percentual de Reajuste: 7%\n 3 - Supervisor - Percentual de Reajuste: 9%\n 4 - Motorista - Percentual de Reajuste 6%\n 5 - Estoquista - Percentual de Reajuste: 5%\n 6 - Técnico de TI - Percentual de Reajuste: 8%");
		System.out.println("Digite a opção desejada: ");
		op = scan.nextInt();
		
		switch(op) {
		case 1:
			System.out.print("\nInforme seu sálario atual:");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100)*10;
			System.out.println("\n Nome do Colaborador" + nome);
			System.out.println("\n Cargo: Gerente");
			System.out.printf("\n Saláro Reajustado: R$%2f", novoSalario);
			break;
			
		case 2:
			System.out.print("\nInforme seu sálario atual:");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100)*7;
			System.out.println("\n Nome do Colaborador" + nome);
			System.out.println("\n Cargo: Vendedor");
			System.out.printf("\n Saláro Reajustado: R$%2f", novoSalario);
			break;
			
		case 3:
			System.out.print("\nInforme seu sálario atual:");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100)*9;
			System.out.println("\n Nome do Colaborador" + nome);
			System.out.println("\n Cargo: Supervisor");
			System.out.printf("\n Saláro Reajustado: R$%2f", novoSalario);
			break;
			
		case 4:
			System.out.print("\nInforme seu sálario atual:");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100)*6;
			System.out.println("\n Nome do Colaborador" + nome);
			System.out.println("\n Cargo: Motorista");
			System.out.printf("\n Saláro Reajustado: R$%2f", novoSalario);
			break;
			
		case 5:
			System.out.print("\nInforme seu sálario atual:");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100)*5;
			System.out.println("\n Nome do Colaborador" + nome);
			System.out.println("\n Cargo: Estoquista");
			System.out.printf("\n Saláro Reajustado: R$%2f", novoSalario);
			break;
			
		case 6:
			System.out.print("\nInforme seu sálario atual:");
			salario = scan.nextFloat();
			novoSalario = salario + (salario/100)*8;
			System.out.println("\n Nome do Colaborador" + nome);
			System.out.println("\n Cargo: Técnico de TI");
			System.out.printf("\n Saláro Reajustado: R$%2f", novoSalario);
			break;
			
		default:
			System.out.println("\nOpção Inválida! Selecione Novamente");
			
			
			
			
			
			
			
		}
		
		
	}

}
