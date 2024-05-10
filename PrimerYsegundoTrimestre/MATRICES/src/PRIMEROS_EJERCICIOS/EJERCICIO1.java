package PRIMEROS_EJERCICIOS;

import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int fila=0;
		int columna=0;
		int valor=0;
		int suma=0;
		int par=0;
		int filavisualizada=0;
		int impar=0;
		int comprobarPar=0;
		int filaelegida=0;
		int columnaelegida=0;
		int valorElegido=0;
		int misnumeros[][] = new int [3][2];
		Scanner leer= new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime los numeros que asignaremos a la columna");
		for (columna=0;columna<2;columna++) {
			for ( fila=0;fila<3;fila++) {
				System.out.print(" dime un numero : ");
				valor=leer.nextInt();
				misnumeros[fila][columna]=valor;
			}
		}
			for (columna=0;columna<2;columna++) {
				for ( fila=0;fila<3;fila++) {
					System.out.print(misnumeros[fila][columna] + " ");
				}
				System.out.println(" ");
			}
	System.out.println(" estos son tus numeros elegidos");
	System.out.println(" ahora sumaremos todo");
		for (columna=0;columna<2;columna++) {
			for ( fila=0;fila<3;fila++) {
			suma=suma+ misnumeros[fila][columna];
			}
			
		}
		System.out.println(suma);
		System.out.println(" ahora dime una posicion de la matriz");
		System.out.println(" empecemos por la fila");
		filaelegida=leer.nextInt();
		System.out.println(" ahora dime la columna");
		columnaelegida=leer.nextInt();
		valorElegido=misnumeros[filaelegida][columnaelegida];
		if (valorElegido%2==0) {
			System.out.println(valorElegido + "  es par ");
		}
		else {
			System.out.println(" es impar");
		}
		System.out.println(" ahora veremos cuandos pares y cuandos impares hay");
		for (columna=0;columna<2;columna++) {
			for ( fila=0;fila<3;fila++) {
			comprobarPar=misnumeros[fila][columna];
			if(comprobarPar%2==0) {
				par++;
			}
			else {
				impar++;
			}
			}
		}
		System.out.println(" el array tiene "+par + " pares y "+impar+" impares");
		System.out.println(" veamos las posiciones de la primera fila del array");
		for (columna=0;columna<=0;columna++) {
			for ( fila=0;fila<3;fila++) {
				System.out.print(misnumeros[fila][columna] + " ");
			}
		}
	}


}
