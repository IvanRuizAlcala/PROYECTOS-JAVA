package EJERCICIOS_ARRAYS_5;

import java.util.Random;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int horizontal=0;
		int moverPosicion=1;
		int valor=0;
		int valorAnterior=0;
		int ultimoValor=0;
		int misnumeros [] = new int [10];
		Random aleatorio = new Random();
		int valorAleatorio=0;
		//ALGORITMO
		for(horizontal=0;horizontal<misnumeros.length;horizontal++) {
			valorAleatorio=aleatorio.nextInt(101)+10;
			misnumeros[horizontal]=valorAleatorio;
			System.out.print(misnumeros[horizontal]+" ");
		}
		ultimoValor=misnumeros[9];
		System.out.println(" ");
		for(horizontal=0;horizontal<misnumeros.length;horizontal++) {
			valor=misnumeros[horizontal];
			misnumeros[horizontal]=valorAnterior;
			if (horizontal==0) {
				misnumeros[0]=ultimoValor;
			}
			
			valorAnterior=valor;
			System.out.print(misnumeros[horizontal] +" ");
		}
	}

}
