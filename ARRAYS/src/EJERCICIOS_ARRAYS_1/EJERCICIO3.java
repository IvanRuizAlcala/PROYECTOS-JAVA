	package EJERCICIOS_ARRAYS_1;

import java.util.Random;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i=0;
		int valormaximo=0;
		Random valor = new Random();
		int cambiarprimernumero=0;
		int cambiarsegundonumero=0;
		
				
		//ALGORITMO
		int[]misnumeros= new int[10];
		for (i=0;i<misnumeros.length;i++) {
		int aleatorio=valor.nextInt( 10) + 1   ;
		misnumeros[i]=aleatorio;
		if ( i==0) {
			cambiarprimernumero=misnumeros[i];
		}
		if (i==9) {
			cambiarsegundonumero=misnumeros[i];
		}
	}
		for(i=0;i<misnumeros.length;i++) {
			System.out.print(misnumeros[i] + " ");
		}
		System.out.println();
		misnumeros[0]=cambiarsegundonumero;
		misnumeros[9]=cambiarprimernumero;
		for (i=0;i<misnumeros.length;i++) {
			System.out.print(misnumeros[i] + " ");
		}
	}
}
