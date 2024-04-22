package EJERCICIOS_ARRAYS_3;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int valor =0;
		int i=0;
		int funcionElegida=0;
		int numeroElegido=0;
		int numeroRepetido=0;
		int salir=0;
		Scanner leer = new Scanner(System.in);
		int misnumeros[]=new int[10];
		Random aleatorio = new Random();
		for (i=0;i<misnumeros.length;i++) {
			valor=aleatorio.nextInt(101)+10;
			misnumeros[i]=valor;
			System.out.print(misnumeros[i]+" ");
		}
		do {
		System.out.println();
		System.out.println("elige una de las opciones:");
		System.out.println("Opcion 1 : dime un numero y te dare su posicion");
		System.out.println("Opcion 2 : dime un numero y te dire las veces que se repite");
		funcionElegida = leer.nextInt();
		
		switch(funcionElegida) {
		case 1:
			System.out.println(" dime el numero elegido");
			numeroElegido=leer.nextInt();
			System.out.println("la posicion de tu numero elegido es : ");
			System.out.print(posicion(misnumeros, numeroElegido));
		break;
		case 2:
			System.out.println(" dime el numero elegido");
			numeroRepetido=leer.nextInt();
			System.out.println("tu numero elegido se repite :");
			System.out.print(repeticion(misnumeros, numeroRepetido)+ " veces");
		break;
		}
		System.out.println();
		System.out.println("para salir marque 0, si quieres elegir de nuevo pulsa 1");
		salir=leer.nextInt();
	}
	while (salir!=0);
		System.out.println(" has terminado");
	}
	public static int posicion(int misnumeros[], int numeroElegido) {
	int i=0;
	int valor=0;
	int posicion=0;
	for (i=0;i<misnumeros.length;i++) {
		valor=misnumeros[i];
		if (valor==numeroElegido) {
			posicion=i+1;
		}
	if(posicion==0) {
		posicion=-1;
	}
		
		
	}
	return posicion;
}
	public static int repeticion(int misnumeros[], int numeroRepetido) {
		int i=0;
		int valor=0;
		int contador=0;
		for (i=0;i<misnumeros.length;i++) {
			valor=misnumeros[i];
			if (valor==numeroRepetido) {
				contador++;
	}
}
		return contador;
	}
}