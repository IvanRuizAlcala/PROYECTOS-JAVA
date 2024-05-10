package PROCESO_REPETITIVO_CONSOLA_2;

import java.util.Scanner;

public class EJERCICIO8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int contador=0;
		int intervalominimo=0;
		int intervalomaximo=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		
			System.out.println(" introduce un valor inferior ");
			intervalominimo = leer.nextInt();
			System.out.println(" introduce un valor superior ");
			intervalomaximo = leer.nextInt();
			do {
			System.out.println("introduce un numero");
			num1 = leer.nextInt();
			if (num1>=intervalominimo && num1<=intervalomaximo) {
				contador++;
			}
				else {
					System.out.println(" el numero " + num1 + " se sale del intervalo ");
				}
			
			}
			while (num1>=intervalominimo && num1<=intervalomaximo);
		}
		
				
	}


