package FUNCIONES1;

import java.util.Scanner;

public class EJERCICIO1 {
	public static void main(String[] args) {
		//DATOS
		char letra1=' ';
		char letra2= ' ';
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime una letra");
		letra1= leer.next().charAt(0);
		System.out.println(" dime otra letra");
		letra2= leer.next().charAt(0);
		imprimirletras(letra1,letra2);
		
		
	}

	public static void imprimirletras(char a,char b) {
		 for(char i = a;i<=b;i++) {
			 System.out.println(i);
		 }
	}
	
}
