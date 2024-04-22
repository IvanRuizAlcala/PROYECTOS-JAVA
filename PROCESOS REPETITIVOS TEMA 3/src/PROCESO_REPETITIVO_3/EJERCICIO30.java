package PROCESO_REPETITIVO_3;

import java.util.Scanner;

public class EJERCICIO30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int suma=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO 
		for (num1=0;num1<=10;num1++) {
			suma=num1+num1;
			System.out.println(num1 + " + "+ num1 + " = "+ suma);
		}
		
	}

}
