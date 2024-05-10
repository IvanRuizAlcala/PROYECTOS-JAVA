package REPASO_REPETITIVO;

import java.util.Scanner;

public class EJERCICIO7_MODIFICADO{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime un numero");
		num1 = leer.nextInt();
		num2 = num1%10;
		num3=num1%100;
		num3=num3/10;
		num4=num1%1000;
		num4=num4/100;
		num5=num1%10000;
		num5=num5/1000;
		for (num6=0;num6<=9;num6++) {
		if (num6<=1) {
			System.out.println(num5);}
		else {
		if (num6==2) {
			System.out.println(num5+""+num4);
		}
		else {
		if (num6==3) {
			System.out.println(num5+""+num4+""+num3);
		}
			else {
		
		if (num6<=4) {
			System.out.println(num5+""+num4+""+num3+""+num2);
		}
		}
		}
		}
		}
	
		
	}

}
