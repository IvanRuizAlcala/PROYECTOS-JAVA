package EJERCICIOS_ARRAYS_1;

import java.util.Random;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i=0;
		int valor = 0;
		int contador=0;
		int valorsuma=10;
		//ALGORITMO
		int[]misnumeros= new int[10];
		for (i=0;i<misnumeros.length;i++) {
			valor=5*valorsuma;
			valorsuma=valorsuma+1;
			misnumeros[i]=valor;
			System.out.print(misnumeros[i] + " ");
		}
		System.out.println();
		for(i=0;i<misnumeros.length;i=i+2) {
			System.out.print(misnumeros[i] + " ");
		}
	}
}

