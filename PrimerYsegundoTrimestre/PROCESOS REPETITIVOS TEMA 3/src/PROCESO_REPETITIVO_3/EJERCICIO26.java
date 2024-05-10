package PROCESO_REPETITIVO_3;

import java.util.Scanner;

public class EJERCICIO26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1 = 0;
		char caracter =' ';
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" introduce un caracter");
		caracter = leer.next().charAt(0);
		num1 = (int) caracter;
		System.out.println(" el numero ASCII es " + num1);
	}

}
