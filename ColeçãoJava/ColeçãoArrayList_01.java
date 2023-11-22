package ColeçãoJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ColeçãoArrayList_01 {

	public static void main(String[] args) {
		
		List<String> listaCores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("\n Digite uma cor: "+(i+1)+ " : ");
			String cor = leia.nextLine();
			listaCores.add(cor);
		}
		System.out.println("\nLista todas as cores:");
		for(String cor : listaCores) {
			System.out.println(cor);
		}
		Collections.sort(listaCores);
		
		System.out.println("\nOrdenar as cores na ordem alfabetica:");
		for (String cor: listaCores) {
			System.out.println(cor);
		}

	}

}
