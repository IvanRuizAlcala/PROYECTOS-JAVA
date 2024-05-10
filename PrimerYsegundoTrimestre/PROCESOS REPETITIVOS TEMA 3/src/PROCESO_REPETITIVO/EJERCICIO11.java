package PROCESO_REPETITIVO;

import java.util.Scanner;

public class EJERCICIO11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int contador=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" escribe un numero ");
		num1 = leer.nextInt();
		for (num1=num1;num1!=0;num1--) {
			System.out.print(num1+" ");
			contador++;
			if (contador % 3 ==0) {
				System.out.println(" ");
			}
		}
	}

}