package PRIMEROS_EJERCICIOS_ARRAYA;

import java.util.Scanner;

public class EJERCICIO_PIZARRA_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1 = 0;
		int valor2 = 0;
		int horizontal1 = 0;
		int horizontal2 = 0;
		int i = 0;
	
		int verSuma=0;
		int verProducto=0;
		int verSumadortotal=0;

		Scanner leer = new Scanner(System.in);

		int num1[] = new int[5];
		int num2[] = new int[5];
		int[] suma = new int[5];
		int[] producto = new int [5];
		int[] sumaTotal = new int [2];
		// ALGORITMO
		System.out.println(" a continuacion te pedire 5 numeros");
		for (horizontal1 = 0; horizontal1 < num1.length; horizontal1++) {
			System.out.print("dime el numero " + horizontal1 + " :");
			valor1 = leer.nextInt();
			num1[horizontal1] = valor1;

		}
		System.out.print("tus numeros elegidos son ");
		for (horizontal1 = 0; horizontal1 < num1.length; horizontal1++) {
			System.out.print(num1[horizontal1] + " ");
		}
		System.out.println(" ");
		System.out.println(" ahora te pedire otros 5 numeros");
		for (horizontal2 = 0; horizontal2 < num2.length; horizontal2++) {
			System.out.print(" dime el numero " + horizontal2 + " :");
			valor2 = leer.nextInt();
			num2[horizontal2] = valor2;
		}
		System.out.print(" tus numeros elegidos esta vez son ");
		for (horizontal2 = 0; horizontal2 < num2.length; horizontal2++) {
			System.out.print(num2[horizontal2] + " ");
		}
		System.out.println(" ");
		System.out.print(" la suma de tus numeros es ");
		suma=sumarValores(num1,num2);
			for (int valorSuma:suma) {
				System.out.print(valorSuma + " ");
			}
		System.out.println(" ");
		System.out.print(" el producto de tus numeros es ");
			producto=productoValores(num1,num2);
				for (int verValor:producto) {
					System.out.print(verValor + " ");
				}
		System.out.println(" ");
		System.out.print(" el producto de tus numeros es ");
			sumaTotal=sumadorTotal(suma,producto);
				for (int vervalor2:sumaTotal) {
					System.out.print(vervalor2 + " ");
						}
		}
	
	public static int[] sumarValores(int operador1 [], int operador2[]) {
		int i=0;
		int sumarValores[] = new int [5];
		
		for (i = 0; i < sumarValores.length; i++) {
				sumarValores[i] = operador1[i] + operador2[i];
	}
		return  sumarValores;
	
		
	}
	public static int[] productoValores(int num1 [], int num2 []) {
		int i=0;
		int productoValores[] = new int [5];
		
		for (i = 0; i < productoValores.length; i++) {
				productoValores[i] = num1[i] * num2[i];
	}
		return  productoValores;
	}
	public static int[]  sumadorTotal(int array1 [], int array2 []) {
		int i=0;
		int suma=0;
		int producto=0;
		int sumadorTotal[]= new int [2];
		for(i=0;i<array1.length;i++) {
			suma=array1[i]+suma;
		}
		for(i=0;i<array2.length;i++) {
			producto=array2[i]+producto;
	}
		sumadorTotal[0]=suma;
		sumadorTotal[1]=producto;
		return sumadorTotal;
}
}

