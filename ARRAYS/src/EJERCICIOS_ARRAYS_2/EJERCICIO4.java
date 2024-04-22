package EJERCICIOS_ARRAYS_2;

import java.util.Scanner;

public class EJERCICIO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int valor=3;
		int i=0;
		int longitudUsuario=0;
		int sumadorImpar=2;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime la longitud deseada del array");
		longitudUsuario = leer.nextInt();
		int misnumeros[]= new int [longitudUsuario];
		for (i=0;i<misnumeros.length;i++) {
		misnumeros[i]=valor;
		valor=valor+sumadorImpar;
		System.out.println(misnumeros[i]);
		}
	}

}
