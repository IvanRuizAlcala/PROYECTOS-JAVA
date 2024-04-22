package EJERCICIOS_ARRAYS_5;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int posicion1=0;
		int horizontal=0;
		int posicion2=0;
		int valorAleatorio=0;
		Scanner leer = new Scanner(System.in);
		Random aleatorio = new Random();
		int misnumeros[]=new int [10];
		//ALGORITMOS
		for(horizontal=0;horizontal<misnumeros.length;horizontal++) {
			valorAleatorio=aleatorio.nextInt(101)+10;
			misnumeros[horizontal]=valorAleatorio;
		}
		System.out.print("tus numeros a elegir son :") ;
		for(horizontal=0;horizontal<misnumeros.length;horizontal++) {
			System.out.print(misnumeros[horizontal]+" ");
		}
		System.out.println(" ");
		System.out.print("ahora dime una posicion :");
		posicion1=leer.nextInt();
		System.out.print("ahora dime otra posicion :");
		posicion2=leer.nextInt();
		System.out.print("las posiciones elegidas son " +posicion1+" "+posicion2);
		System.out.print(", el contenido de las posiciones son: " + mostrarNumeros(misnumeros, posicion1)+" y " + mostrarNumeros2(misnumeros, posicion2));
				
	}
public static int mostrarNumeros(int misnumeros [],int posicion1) {
	posicion1--;
	for(int i=0;i<misnumeros.length;i++) {
		if(i==posicion1) {
			posicion1=misnumeros[i];
		}
	}
	return posicion1;
	
}
public static int mostrarNumeros2(int misnumeros [],int posicion2) {
	posicion2--;
	for(int i=0;i<misnumeros.length;i++) {
		if(i==posicion2) {
			posicion2=misnumeros[i];
		}
	}
	return posicion2;
}
}
