package PROCESO_REPETITIVO_CON_CONSOLA;

import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		Scanner leer = new Scanner (System.in);
		//ALGORITMO
	
		
		do {
			System.out.println("dime un numero");
			num1 = leer.nextInt();
			if (num1%2==0) {
				System.out.println("el numero es par");
				num1++;
			}
		}
			while (num1!=0);
		
			
		
		
	}

}
