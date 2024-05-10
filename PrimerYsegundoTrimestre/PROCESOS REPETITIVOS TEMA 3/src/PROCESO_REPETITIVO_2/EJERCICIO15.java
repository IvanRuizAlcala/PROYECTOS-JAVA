package PROCESO_REPETITIVO_2;

import java.util.Scanner;

public class EJERCICIO15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int menu;
		int num1=0;
		int num2=0;
		int sumar=0;
		int resta=0;
		Scanner leer = new Scanner(System.in);
		// ALGORITMO
		do {
			System.out.println("escribe 1 numeros");
			num1=leer.nextInt();
			System.out.println("escribe otro numeros");
			num2=leer.nextInt();
			sumar = num1+num2;
			resta = num1-num2;
			System.out.println("escribe 1 para sumar, escribe 2 para restar, escribe 3 para salir");
			menu=leer.nextInt();
			
			switch(menu) {
			case 1: System.out.println(num1 + " + " + num2 + " = " + sumar);
			break;
			case 2: System.out.println(num1 + " - " + num2 + " = "+ resta);
			break;
			case 3: System.out.println("has terminado");
			break;
			}
		}
		while (menu==1 || menu==2);
	}
}
				
		
