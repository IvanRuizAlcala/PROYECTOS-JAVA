package REPASO_REPETITIVO;

import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DATOS 
		char caracter1 = ' ';
		char caracter2 = ' ';
		int num1 = 0;
		int num2 = 0;
		int num3=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		do {
			System.out.println(" escribe un caracter ");
			caracter1=leer.next().charAt(0);
			System.out.println(" escribe otr caracter ");
			caracter1=leer.next().charAt(0);
			num1=(int)caracter1;
			num2=(int)caracter2;
		if (num1>num2) {
			System.out.println(" la letra " + caracter1 + " es mayor ");
		}
		else {
			System.out.println(" la letra " + caracter2 + " es mayor ");
		}
		System.out.println(" si desea repetir pulse 1, sino pulse 0 pasa salir");
		num3=leer.nextInt();
		}
		while(num3==1);
		
		if(num3 == 0) {
			System.out.println(" el sistema ha finalizado");
			
		}

}
}