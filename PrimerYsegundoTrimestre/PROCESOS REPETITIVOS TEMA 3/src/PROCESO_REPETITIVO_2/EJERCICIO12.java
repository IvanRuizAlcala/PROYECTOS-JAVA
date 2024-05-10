package PROCESO_REPETITIVO_2;

import java.util.Scanner;

public class EJERCICIO12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		char respuesta;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		
	do {
		System.out.println("escribe un numero");
		num1=leer.nextInt();
		System.out.println("escribe otro numero");
		num2=leer.nextInt();
		if (num1!=0) {
			if (num1%2==0 && num2%2==0) {
			System.out.println("ambos numeros son pares");
			}
				else {
					System.out.println("ambos numeros son impares");
			}
		}
			if (num1%2!=0 && num2%2==0) {
				System.out.println(num1+"es impar y " + num2+ "es par ");
			}
			if (num1%2==0 && num2%2!=0) {
				System.out.println(num1+" es par y " + num2+ "es impar ");
			}
		
		
		
			System.out.println("quieres introducir otros numeros? marca S para continuar o N para terminar");
			respuesta = leer.next().charAt(0);
	}
		
		while (respuesta=='S');
	if (respuesta=='N') {
		System.out.println("has terminado");
	}
	
	}
}
