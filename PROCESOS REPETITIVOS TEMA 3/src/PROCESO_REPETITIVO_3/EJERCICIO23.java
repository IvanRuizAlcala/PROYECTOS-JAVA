package PROCESO_REPETITIVO_3;

import java.util.Scanner;

public class EJERCICIO23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int dividendo=1;
		int num3=0;
		int num4=0;
		int contadorsuma=0;
	Scanner leer = new Scanner(System.in);
		//ALGORITMO
		
		System.out.println("dime un numero");
		num1=leer.nextInt();
		
	
		while (dividendo!=num1) {
			 num3=num1 % dividendo;
			 num4=dividendo;
			 dividendo++;
			;
			 if (num3==0) {
				 contadorsuma=num4+contadorsuma;
			 }
			  }
			 System.out.println(" la suma de los divisores de los numeros que has puesto es " + contadorsuma);
		
	
	}
	}
	


