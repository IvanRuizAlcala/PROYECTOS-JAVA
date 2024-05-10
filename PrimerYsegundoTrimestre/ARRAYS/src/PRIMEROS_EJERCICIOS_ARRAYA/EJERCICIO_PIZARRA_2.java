package PRIMEROS_EJERCICIOS_ARRAYA;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO_PIZARRA_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i = 0;
		int opcion = 0;
		Scanner leer = new Scanner(System.in);
		int []misnumeros = new int [20];
		for (i=0;i<misnumeros.length;i++) {
			Random aleatorio = new Random();
			int valor = aleatorio.nextInt( 20) +  1;
			misnumeros[i]=valor;
		}
		int []arrayfinal = new int [3];
		arrayfinal[0]=0;
		arrayfinal[1]=0;
		arrayfinal[2]=0;
		
		//ALGORITMO
		do{
			System.out.println(" elige una opcion ");
			opcion= leer.nextInt();
			switch(opcion) {
			case 1 :
				verArray(misnumeros);
				
				
			break;
			case 2:
				
				System.out.print(sumarArray(misnumeros));
				arrayfinal[0]=sumarArray(misnumeros);
			break;
			case 3: 
				System.out.println(mediaArray(misnumeros));
				arrayfinal[1]=mediaArray(misnumeros);
			break;
			case 4: 
				System.out.println(multiplo(misnumeros));
				arrayfinal[2]=multiplo(misnumeros);
			
			}
			System.out.println();
		}
		
		while (opcion!=5);
		System.out.print(arrayfinal[0]+",");
		System.out.print(arrayfinal[1]+",");
		System.out.print(arrayfinal[2]+",");
			
		
	}
	public static void verArray(int misnumeros[]) {
			int i;
			for(i=0;i<misnumeros.length;i++)
			System.out.print(misnumeros[i] +" ");
			
		}
	public static int sumarArray(int misnumeros[]) {
		int i = 0;
		int valor = 0;
		for ( i =0;i<misnumeros.length;i++) {
			valor=valor+misnumeros[i];
		}
		
		return valor;
		
	}
	public static int mediaArray(int misnumeros[]) {
		int valor=sumarArray(misnumeros);
		valor=valor/misnumeros.length;
		return valor;
	}
	public static int multiplo(int misnumeros[]) {
		int i=0;
		int contador=0;
		int valor=0;
		for (i=0;i<misnumeros.length;i++) {
			valor=misnumeros[i];
			if (valor%5==0) {
				contador++;
			}
	}
		return contador;

	

}
}
