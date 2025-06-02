package src;

import java.util.Scanner;

public class ExQuadro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Código para ver área do quadrado.
		
		Scanner sc = new Scanner(System.in);
		
		double lg_quad, alt_quad, calc3, calc1, calc2;
		
		System.out.print("Me fale a largura do quadrado");
		lg_quad = sc.nextDouble();
		System.out.println(String.format("%.1f", lg_quad));
		
		System.out.print("Me fale a altura do quadrado :");
		alt_quad = sc.nextDouble();
		System.out.println(String.format("%.1f", alt_quad));
		
		calc1 = lg_quad * alt_quad;
		
		System.out.println("A area do quadrado é :");
		System.out.println(String.format("%.4f", calc1));
		
		calc2 = (lg_quad * 2) + (alt_quad * 2);
		
		System.out.println("O perimetro do quadrado é :");
		System.out.println(String.format("%.4f", calc2));
		
		calc3 = Math.sqrt(lg_quad * lg_quad + alt_quad * alt_quad); 
		System.out.println("A diagonal do quadrado é do quadrado é de");
		System.out.println(String.format("%.4f", calc3));
		
		

	}

}
