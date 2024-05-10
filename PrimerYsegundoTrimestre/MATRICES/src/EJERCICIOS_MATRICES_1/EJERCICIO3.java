package EJERCICIOS_MATRICES_1;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int fila=0;
		int columna=0;
		int valor=0;
		Random aleatorio = new Random();
		int misnumeros[][]= new int [5][5];
		//ALGORITMO
		for(fila=0;fila<misnumeros.length;fila++) {
			for (columna=0;columna<misnumeros[0].length;columna++) {
				valor=aleatorio.nextInt(10)+1;
				misnumeros[fila][columna]=valor;
				System.out.println(misnumeros[fila][columna]);
				}
			System.out.println(" ");
		}
	}
	public static int comprobarArray(int misnumeros [][]) {
		int fila=0;
		int columna=0;
		int valor=0;
		Scanner leer = new Scanner(System.in);
		for(fila=0;fila<misnumeros.length;fila++) {
			for (columna=0;columna<misnumeros[0].length;columna++) {
		
		
	}
		}
		return valor;
}
}
