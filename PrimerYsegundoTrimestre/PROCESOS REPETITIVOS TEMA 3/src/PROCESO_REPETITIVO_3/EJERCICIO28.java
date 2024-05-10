package PROCESO_REPETITIVO_3;

import java.util.Scanner;

public class EJERCICIO28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;		
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		do {
		System.out.println(" dime un año ");
		num1=leer.nextInt();
	
			num2=num1 % 4;
			num3=num1 % 100;
			num4=num1 % 400;
			if (num2==0 || num3==1 || num4==0) {
			System.out.println(" el año es bisiesto");
			}
			else {
				System.out.println("el año no es bisiesto");
			}
		
		System.out.println(" para repetir pulsa 1 ");
		num5=leer.nextInt();
		}
		while(num1!=0);
}
}
