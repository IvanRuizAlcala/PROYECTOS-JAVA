package FUNCIONES1;

import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS 
		int num1 = 0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime un año ");
		num1=leer.nextInt();
		System.out.println(bisiesto(num1));
	}
	public static boolean bisiesto(int anno1) {
		int num2=anno1 % 4;
		int num3=anno1 % 100;
		int num4=anno1 % 400;
		
		
		if (num2==0 || num3==1 || num4==0) {
			return true;
			}
		else {
			return false;
		}
		
		
	}

}
