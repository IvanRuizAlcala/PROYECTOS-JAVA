package EJERCICIOS_ARRAYS_3;

import java.util.Random;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i=0;
		int valor=0;
		int valorNegativo=0;
		int valorPositivo=0;
		int contadorwhile=0;
		Random aleatorio = new Random();
		//ALGORITMO
		int misnumeros[] = new int [10];
		for(i=0;i<misnumeros.length;i++){
			valorPositivo= aleatorio.nextInt( 101 );
			valorNegativo= aleatorio.nextInt(101)-100;
			if(i%2==0) {
				misnumeros[i]=valorPositivo;
			}
			if(i%2!=0) {
				misnumeros[i]=valorNegativo;
			}
			while(contadorwhile==i) {
				contadorwhile++;
				System.out.print(misnumeros[i] + " ");
			}
		
		}
	}

}
