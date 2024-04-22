package PROCESO_REPETITIVO_2;

import java.util.Scanner;

public class EJERCICIO18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int i=1;
		int num2=0;
		Scanner leer = new Scanner(System.in);
		int contador=1;
		//ALGORITMO
		System.out.println("escribe un numero entero");
		num1=leer.nextInt();
			for (i=num1;contador<=num1;contador++) {
				num2=num1+contador;
					System.out.println(" la suma de " + i + " + " + contador + " es igual a " + num2);
		
		}
		
		
		
		
		
		
		
		
	}

}
