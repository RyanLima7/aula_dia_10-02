package src;

import java.util.Scanner;

public class Alturamedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Código para ver a altura media.
		
		Scanner sc = new Scanner(System.in);

		double alt1,alt2, cont, cont1;
		
		System.out.println("Me diga seu nome senhor(a): ");
		String nm1 = sc.nextLine();
		System.out.println("Me infrome sua altura por favor: ");
		alt1 = sc.nextDouble();
		
		System.out.println("Nome: " + nm1);
		System.out.print("Altura: ");
		System.out.println(String.format("%.2f",alt1));
		
		System.out.println("Me fale seu nome");
		String c = sc.nextLine();
		
		String nm2 = sc.nextLine();
		
		System.out.println("Me informe sua altura");
		alt2 = sc.nextDouble();
		
		System.out.println("Nome: "+ nm2);
		System.out.print("Altura: ");
		System.out.println(String.format("%.2f",alt2));
		
		cont = alt1 + alt2 ; 
		cont1 = cont /2;

		System.out.println("A altura media de " + nm1 +  "e de " + nm2 + " é igual a " + cont1 );
	
		
		
		sc.close();

	}

}
