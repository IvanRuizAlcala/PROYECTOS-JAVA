package PROCESO_REPETITIVO_CON_CONSOLA;

import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		char letra1;
		int acumulador=0;
		Scanner leer = new Scanner (System.in);
		//ALGORITMO
	
		
		do {
			System.out.println("introduce un caractér");
			letra1 = leer.next().charAt(0);
			if (letra1=='a' || letra1=='A') {
				
				acumulador++;
			
			}
		}
			while (letra1!='.');
		System.out.println("el codigo tiene " + acumulador + " aA ");
		
	}

}
