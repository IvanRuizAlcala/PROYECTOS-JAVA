package EJERCICIOS_MATRICES_1;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DATOS 
		int fila=0;
		int columna=0;
		double valor=0;
		int filaElegida=0;
		Random aleatorio = new Random();
		double misnumeros[][]= new double[4][5];
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		for(fila=0;fila<misnumeros.length;fila++) {
			for (columna=0;columna<misnumeros[0].length;columna++) {
				valor=aleatorio.nextInt(100)+1;
				misnumeros[fila][columna]=valor;
				System.out.print(misnumeros[fila][columna] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" elige una fila");
		filaElegida=leer.nextInt();
		for(columna=0;columna<misnumeros[0].length;columna++) {
			System.out.print(misnumeros[filaElegida][columna]+ " ");
		}
	}

}
