package PROCESO_REPETITIVO_CON_CONSOLA;

import java.util.Scanner;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int acumulador=0;
		int filaimpar=0;
		Scanner leer = new Scanner (System.in);
		//ALGORITMO
	
		
		do {
			System.out.print("introduce un numero: ");
			num1=leer.nextInt();
			if (num1!=0) {
				acumulador++;
				if (acumulador%2==0&& num1%2!=0) {
					filaimpar++;
				}
			
			}
		}
			while (num1!=0);
		System.out.println("hay "+ filaimpar + " impares en posicion par");
		
	}

}

