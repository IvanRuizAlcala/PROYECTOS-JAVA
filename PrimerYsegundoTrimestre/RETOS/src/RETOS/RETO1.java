package RETOS;

import java.util.Scanner;

public class RETO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int num3=1;
		int num4=0;
		int num5=0;
		int contador=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime un numero");
		num1 = leer.nextInt();
		for (num5=0;contador<num1;num5++) {
			num4=num2+num3;
			num2=num3;
			num3=num4;
			contador++;
		if (num5==0)
			num2=0;
		}
	}

}
