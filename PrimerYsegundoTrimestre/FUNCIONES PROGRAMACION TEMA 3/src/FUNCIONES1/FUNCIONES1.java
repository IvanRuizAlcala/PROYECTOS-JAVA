package FUNCIONES1;

import java.util.Scanner;

public class FUNCIONES1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DATOS
		int a=0;
		int b=0;
		int mimayor=0;
		Scanner leer=new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime un numero");
		a=leer.nextInt();
		System.out.println(" dime un numero");
		b=leer.nextInt();
		System.out.println(" mi mayor"+elmayor(a,b));
		System.out.println(elmayor(100,500));
	}
	public static int elmayor(int num1,int num2) {
		if (num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
}
