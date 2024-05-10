package PROCESO_REPETITIVO_3;

import java.util.Scanner;

public class EJERCICIO25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS 
		int num1=0;
		int num2=0;
		int dividendo=1;
		int dividendo1=1;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		int contadorsuma2=0;
		int contadorsuma=0;
	Scanner leer = new Scanner(System.in);

		//ALGORITMO
	System.out.println(" dime un numero");
	num1=leer.nextInt();
	System.out.println(" dime otro numero");
	num2=leer.nextInt();
	
		while (dividendo!=num1) {
			 num3=num1 % dividendo;
			 num4=dividendo;
			 dividendo++;
			;
			 if (num3==0) {
				 contadorsuma=num4+contadorsuma;
			 }
			  }
		while (dividendo1!=num2) {
			 num5=num2 % dividendo1;
			 num6=dividendo1;
			 dividendo1++;
			;
			 if (num5==0) {
				 contadorsuma2=num6+contadorsuma2;
			 }
			  }
		if (contadorsuma==num2 && contadorsuma2==num1) {
			System.out.println(" los numeros " + num1 +" y " + num2 + " son amigos");
		}
		else {
			System.out.println(" los numeros " + num1 +" y " + num2 + " no son amigos");

		}

	}

}
