package PRIMEROS_EJERCICIOS;

import java.util.Scanner;

public class EJERCICIOPIZARRA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int sumadorantiguo=0;
		int i = 0;
		int vertical = 0;
		int horizontal =0;
		int valor=0;
		int misnumeros [][] = new int [4][3];
		int suma[] = new int [3];
		int sumador=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.print(" tienes que decirme varios numeros ");
		for (vertical=0;vertical<misnumeros.length;vertical++) {
			sumador=0;
			for(horizontal=0;horizontal<misnumeros[0].length;horizontal++) {
				System.out.print(" ");
				valor=leer.nextInt();
				misnumeros[vertical][horizontal]=valor;
			}
		}
		for (vertical=0;vertical<misnumeros.length;vertical++) {
			for(horizontal=0;horizontal<misnumeros[0].length;horizontal++) {
				System.out.print(misnumeros[vertical][horizontal] +" ");
			}
			System.out.println();
		}
		for (horizontal=0;horizontal<misnumeros[0].length;horizontal++) {
			sumador=0;
			sumadorantiguo=0;
		for(vertical=0;vertical<misnumeros.length;vertical++) {
				sumador=misnumeros[vertical][horizontal];
				sumador=sumador+sumadorantiguo;
				sumadorantiguo=sumador;
				suma[i]=sumador;
		}
		i++;
		}
	System.out.println(" veamos la suma de los numeros");
		for(i=0;i<suma.length;i++) {
			System.out.println(suma[i]);
		}
		}
	}

