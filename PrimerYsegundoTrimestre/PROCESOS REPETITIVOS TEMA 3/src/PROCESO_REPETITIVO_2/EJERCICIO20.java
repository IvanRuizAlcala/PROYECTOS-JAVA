package PROCESO_REPETITIVO_2;

import java.util.Scanner;

public class EJERCICIO20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int contador=0;
		double num3=-9999;
		Scanner leer = new Scanner(System.in);
		
		//ALGORITMO
		do {
		System.out.println("escribe el numero 0 para continuar, escribe -9999 para salir");
		num1=leer.nextInt();
		 if (num1==0) {
			 contador++;
			System.out.println(" has tecleado el numero 0 " + contador + " veces ");
		 }
		 }
		while(num1!=num3);
			if(num1==num3) {
				System.out.println("el proceso ha terminado");
			}
		}
	
		}
	

		