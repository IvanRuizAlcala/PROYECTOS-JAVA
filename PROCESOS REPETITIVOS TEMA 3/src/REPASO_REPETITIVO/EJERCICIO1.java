package REPASO_REPETITIVO;

import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DATOS 
		int num1 = 0;
		int suma=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		for (num1=1;num1<100;num1=num1+2) {
			suma=num1+num1;
			System.out.println(num1 + " + " + num1 + " = " + suma);
		}
	}

}
