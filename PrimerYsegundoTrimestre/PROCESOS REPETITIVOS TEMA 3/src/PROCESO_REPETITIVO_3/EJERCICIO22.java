package PROCESO_REPETITIVO_3;

import java.util.Scanner;

public class EJERCICIO22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int digito1=0;
		
		int operador;
		
		
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println("introduce un numero");
		num1 = leer.nextInt();
		while (num1!=0) {
		digito1 = num1%10;
		num1=num1-digito1;
		num1 = num1/10;
		System.out.print(digito1 + " ");
		
		}
	}

}
