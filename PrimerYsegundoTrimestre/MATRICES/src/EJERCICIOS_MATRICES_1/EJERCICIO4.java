package EJERCICIOS_MATRICES_1;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int vertical=0;
		int horizontal=0;
		int valor=0;
		int numeroElegido=0;
		Random aleatorio = new Random();
		int valorAleatorio=0;
		int misnumeros [][]= new int [5][5];
		int numeroBuscado=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		for (vertical=0;vertical<misnumeros.length;vertical++) {
			for ( horizontal=0; horizontal<misnumeros[0].length;horizontal++) {
				valorAleatorio=aleatorio.nextInt(9)+1;
				misnumeros[vertical][horizontal]=valorAleatorio;
				System.out.print(misnumeros[vertical][horizontal]+ " ");
			}
			System.out.println();
		}
		System.out.println(" dime un numero y te dire las veces que se repite");
		numeroElegido=leer.nextInt();
		numeroBuscado=buscarNumero(misnumeros, numeroElegido);
		System.out.println(" tu numero está "+numeroBuscado+" veces");
				
		
		
	}
public static int buscarNumero(int misnumeros[][], int numeroElegido) {
	int valor=0;
	int horizontal=0;
	int vertical=0;
	int contador=0;
	for(vertical=0;vertical<misnumeros[0].length;vertical++) {
		for(horizontal=0;horizontal<misnumeros.length;horizontal++) {
			valor=misnumeros[vertical][horizontal];
		if (valor==numeroElegido) {
				contador++;
			}
		}
	}
	return contador++;
}

}
