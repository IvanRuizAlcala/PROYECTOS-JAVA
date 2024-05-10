package PROCESO_REPETITIVO_3;

import java.util.Scanner;

public class EJERCICIO21 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int contadorsuma=0;
		int contadorteclado=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		do {
			System.out.println(" dime un numero o pulsa 0 para salir");
			num1 = leer.nextInt();
			contadorsuma=num1+num2;
			num2=contadorsuma;
			contadorteclado++;
			
			
		}
		while (num1!=0); 
			if (num1==0) {
				System.out.println(" la suma de los numeros es " + num2 + " las veces introducidas son " + contadorteclado);
			}
			
		
	
		
}
}