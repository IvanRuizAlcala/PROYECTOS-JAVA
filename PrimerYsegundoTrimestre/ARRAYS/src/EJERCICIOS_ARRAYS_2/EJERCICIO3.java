package EJERCICIOS_ARRAYS_2;

import java.util.Random;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		Random aleatorio = new Random(101);
		int[] misnumeros = new int [20];
		int valor=0;
		int i=0;
		int mayorvalor=0;
		//ALGORITMO
		for (i=0;i<misnumeros.length;i++) {
			valor= aleatorio.nextInt(101);
			misnumeros[i]=valor;
			System.out.print(+misnumeros[i] + " ");
		}
		System.out.println();
		mayorvalor=mayorvalor(misnumeros);
		System.out.println(" el valor mas alto es "+mayorvalor);
		
	}
public static int mayorvalor(int misnumeros[]) {
	int valor=0;
	int valoranterior=0;
	int valorfinal=0;
	for(int i=0;i<misnumeros.length;i++) {
		valor=misnumeros[i];
		if(valor>valorfinal) {
			valorfinal=valor;
		}
		valoranterior=valor;
	}	
	return valorfinal;
	
}
}
