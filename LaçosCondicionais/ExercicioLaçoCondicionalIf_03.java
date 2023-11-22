package LaçosCondicionais;

import java.util.Scanner;

public class ExercicioLaçoCondicionalIf_03 {

	public static void main(String[] args) {
		
		   Scanner read = new Scanner(System.in); 
			   
			String nome;
			String doacaoresposta;
			
			int idade;
			
			boolean doacao = false;
			
			System.out.print("\nInforme seu nome:");
			nome = read.nextLine();
			
			System.out.print("\nInforme sua idade:");
			idade = read.nextInt();
			
			System.out.print("\nEssa é sua primeira doação de sangue? (S/N: ");
			doacaoresposta = read.next();
			
			if(doacaoresposta.equals("S")) {
				doacao = true;
			}else if (doacaoresposta.equals("N")) {
				doacao = false;
			}else {
				System.out.print("\nValor inválido.");
				
			}
			
			if(idade >= 18 && idade <= 59) {
				System.out.print(nome+" apto para doar sague!");
				
			}else if (idade >= 60 && idade <= 69 && doacao == false) {
				System.out.print(nome+" apto para doar sague!");
			
				
			}else if (idade >= 60 && idade <= 69 && doacao == true) {
				System.out.print(nome+" não está apto para doar sague!");
				
			}else {
				System.out.print(nome+" não está apto para doar sague!");
			}
		}

	}

