package src;

import java.util.Scanner;

public class ExPiso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Código para ver a área total e o custo total do piso.

		Scanner sc = new Scanner(System.in);

		double largura, comprimento, m2, área, total;
		System.out.println("Digite a largura do cômodo: ");
		
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento do cômodo: ");
		
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado do piso: ");
		m2 = sc.nextDouble();
	
		área = largura * comprimento;
		System.out.println("Área do cômodo: "+ área);
		total = área * m2;
		System.out.println("Custo total do piso: "+ total);
		System.out.println(String.format("%.2f", total));
		
		área = sc.nextDouble();
		m2 = sc.nextDouble();
		
		System.out.println("Custo total do piso: "+ total);
		sc.close();

		

	}

}
