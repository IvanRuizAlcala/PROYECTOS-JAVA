package REPASO_PROCESO_2;

import java.util.Scanner;

public class EJERCICIO6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DATOS
		int num1=0;
		int num2=0;
		int i=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" introduce un numero entero ");
		num1=leer.nextInt();
		for (i=1;i<=num1;i++) {
			for (num2=1;num2<=i;num2++) {
				System.out.print(num2 +" ");
			}
			System.out.println();
		}
	}

}
