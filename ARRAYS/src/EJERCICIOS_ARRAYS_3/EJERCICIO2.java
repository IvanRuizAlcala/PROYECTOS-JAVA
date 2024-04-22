package EJERCICIOS_ARRAYS_3;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		//DATOS
		int valor=0;
		int i=0;
		int numeroAleatorio=0;
		int menu=0;
		int salir=0;
		Scanner leer = new Scanner(System.in);
		Random aleatorio = new Random();
		int misnumeros[]= new int[10];
		while(i<misnumeros.length) {
			numeroAleatorio=aleatorio.nextInt(101)+100;
			misnumeros[i]=numeroAleatorio;
			System.out.print(misnumeros[i]+" ");
			i++;
			
		}
		do {
		System.out.println();
		System.out.println(" elige una opcion :");
		System.out.println(" 1. hayar la media de los numeros");
		System.out.println(" 2. hayar el numero menor de los numeros");
		menu = leer.nextInt();
		switch(menu) {
		case 1 :
			System.out.println(mediaNumeros(misnumeros));
				break;
		case 2 :
			System.out.println(numeroMenor(misnumeros));
				break;		
		}
		System.out.println(" si desea continuar marque 1, sino marque 0");
		salir=leer.nextInt();
	}
		while(salir!=0);
	}
public static int mediaNumeros(int misnumeros []) {
	int i=0;
	int valor=0;
	int valoranterior=0;
	int media=0;
	for(i=0;i<misnumeros.length;i++) {
		valor=valoranterior+misnumeros[i];
		valoranterior=valor;
	}
	media=valor/i;
	return media;
	
}
public static int numeroMenor(int misnumeros []) {
	int i=0;
	int valor=0;
	int numeroMenor=1000;
	for(i=0;i<misnumeros.length;i++) {
		valor=misnumeros[i];
		if(valor<numeroMenor) {
			numeroMenor=valor;
		}
	}
	return numeroMenor;
}
}
