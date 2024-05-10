package PROCESO_REPETITIVO_CONSOLA_2;

import java.util.Scanner;

public class EJERCICIO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int numerominimo=1000;
		int contador=0;
		int posicion=0;
		
		Scanner leer=new Scanner(System.in);
		//ALGORITMO
	
		System.out.println("introduce cuantos numeros vas a introducir");
		num1=leer.nextInt();
		while (num1!=contador) {
			if (contador<=num1) {
				System.out.print("introduce un numero");
				contador++;
				num2=leer.nextInt();
			}
				if (num2<numerominimo) {
					numerominimo=num2;
					posicion=contador;
			}	
		}
		if (num1==contador) {
			System.out.println(" el numero minimo es " + numerominimo + " y esta en la posicion " + posicion);
		}
			
		}
	
}
		
			