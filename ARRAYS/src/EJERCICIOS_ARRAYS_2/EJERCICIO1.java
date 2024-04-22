package EJERCICIOS_ARRAYS_2;

import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String caracter= " ";
		int longitud = 0;
		Scanner leer = new Scanner(System.in);
		
		//ALGORITMO
		System.out.println(" elige una cadena de caracteres");
		caracter=leer.next();
		longitud=caracter.length();
		System.out.println(caracter+" "+longitud);
	}

}
