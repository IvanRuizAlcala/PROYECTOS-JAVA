package EJERCICIOS_ARRAYS_1;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		
		int i=0;
		int suma=0;
		int suma2;
		int valormaximo=0;
		int numeroElegidoPorUsuario=0;
		int salir=0;
	
		Random valor = new Random();
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		int[]misnumeros= new int[10];
		for (i=0;i<misnumeros.length;i++) {
		int aleatorio=valor.nextInt( 100 -  0 + 1) +  0;
			misnumeros[i]=aleatorio;
			System.out.print(misnumeros[i]+" ");
		}
		if (misnumeros[0]>misnumeros[9]) {
			valormaximo=misnumeros[0];
		}
		else
			valormaximo=misnumeros[9];
		System.out.println(" el valor maximo entra el primero y el ultimo es "+valormaximo);
		System.out.println(" dime los numeros que quieres poner, si quieres terminar pulsa 0");
		
			numeroElegidoPorUsuario = leer.nextInt();
	suma = suma(numeroElegidoPorUsuario);

		while (numeroElegidoPorUsuario==0);
		System.out.println(suma);

	
	}
	public static int suma(int...numeros) {
		int suma=0;
		for ( int contador = 0; contador<numeros.length;contador++) {
			suma= suma + numeros[contador];
		}
		 
		return suma ;
		
	}
	}
