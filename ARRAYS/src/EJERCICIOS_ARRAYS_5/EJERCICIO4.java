package EJERCICIOS_ARRAYS_5;

import java.util.Random;

public class EJERCICIO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i=0;
		Random aleatorio = new Random();
		int valorAleatorio=0;
		int media=0;
		int suma=0;
		int misnumeros[]=new int [10];
		//ALGORITMO
		for (i=0;i<misnumeros.length;i++) {
			valorAleatorio=aleatorio.nextInt(101)+100;
			misnumeros[i]=valorAleatorio;
		}
		i=0;
		for(i=10;i<misnumeros.length;i--) {
			System.out.print(misnumeros[i]+" ");
		}
		for (i=0;i<misnumeros.length;i++) {
			 suma=suma+misnumeros[i];
			 media=suma/misnumeros.length;
		}
		System.out.println(media);
	}

}
