package PROCESO_REPETITIVO_2;

import java.util.Scanner;

public class EJERCICIO19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int num3=0;
		int contador=0;
		Scanner leer = new Scanner(System.in);
		
		//ALGORITMO
		System.out.println("escribe un numero");
		num1=leer.nextInt();
		System.out.println("escribe otro numero");
		num2=leer.nextInt();
		while (num1!=num2) {
			if (num1>num2) {
				num1--;
				contador++;
					System.out.println(num1);
			}
			if (num1<num2) {
				num2--;
				contador++;
				System.out.println(num2);
			}
		}
		System.out.println(" los numeros mostrados han sido "+contador);
	}

}
