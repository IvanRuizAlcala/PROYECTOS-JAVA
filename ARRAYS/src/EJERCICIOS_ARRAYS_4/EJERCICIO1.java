package EJERCICIOS_ARRAYS_4;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i = 0;
		int valor = 0;
		Scanner leer = new Scanner(System.in);
		Random aleatorio = new Random();
		int valorAleatorio=0;
		int valorSuma=0;
		int posicionInicial=0;
		int posicionFinal=0;
		int[] misnumeros= new int [10];
		//ALGORITMO
		do {
		System.out.println(" dime una posicion inicial entre 0 y 9 ");
		posicionInicial = leer.nextInt();
		
		if (posicionInicial>misnumeros.length) {
			System.out.println("el numero no es correcto, dime un numero correcto");
		}
		}
		while(posicionInicial<0&&posicionInicial>10);
		do {
			System.out.println(" dime una posicion final, debe ser mayor a la elegida anterior y menor o igual a 10 ");
			posicionFinal = leer.nextInt();
			if (posicionFinal>misnumeros.length) {
				System.out.println("el numero no es correcto, dime un numero correcto");
			}
		}
		while(posicionFinal<posicionInicial||posicionFinal>10);
		for (i=1;i<misnumeros.length;i++) {
			valorAleatorio=aleatorio.nextInt(101)+100;
			misnumeros[i]=valorAleatorio;
			System.out.println(i+". " + misnumeros[i]);
		}
		valorSuma=sumarPosiciones(misnumeros,posicionInicial,posicionFinal);
		System.out.println("el valor de la suma de las posiciones elegidas es ");
		System.out.println(valorSuma);
		
	}

public static int sumarPosiciones(int misnumeros [],int posicionInicial, int posicionFinal) {
	int i=0;
	int valorFinal=0;
	for(i=0;i<misnumeros.length;i++) {
		if (i>=posicionInicial&&i<=posicionFinal) {
			valorFinal=valorFinal+misnumeros[i];
		}
	}	
	return valorFinal;
	
}
}
