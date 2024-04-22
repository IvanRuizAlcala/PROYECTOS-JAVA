package EJERCICIOS_ARRAYS_1;

import java.util.Random;

public class EJERCICIO2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//DATOS
			int i=0;
			int valormaximo=0;
			Random valor = new Random();
			
			//ALGORITMO
			int[]misnumeros= new int[10];
			for (i=0;i<misnumeros.length;i++) {
			int aleatorio=valor.nextInt( 10 ) + 1;
				misnumeros[i]=aleatorio;
			}
		i=0;
			while(i<misnumeros.length) {
				System.out.print(misnumeros[i] + " ");
				i++;
			}
		

		
		}
}
