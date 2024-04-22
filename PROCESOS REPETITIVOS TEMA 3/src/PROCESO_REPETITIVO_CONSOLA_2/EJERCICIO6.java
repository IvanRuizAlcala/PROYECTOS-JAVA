package PROCESO_REPETITIVO_CONSOLA_2;

import java.util.Scanner;

public class EJERCICIO6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		do {
			System.out.println(" introduzca un numero");
			num1=leer.nextInt();
			
			if (num1>10) {
				System.out.println(" correcto, el numero " + num1 + " es mayor que 10 ");
			}
			else {
				System.out.println(" el numero " + num1 + " no es mayor que 10, ");
			
			}
		}
		while (num1<=10);
		
	}		

}
