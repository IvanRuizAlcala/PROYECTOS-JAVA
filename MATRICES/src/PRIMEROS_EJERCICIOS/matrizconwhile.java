package PRIMEROS_EJERCICIOS;

import java.util.Random;

public class matrizconwhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int fila=0;
		int columna =0;
		int valor=0;
		Random variable= new Random();
		int misnumeros[][]=new int [3][2];
		//ALGORITMO
		while(columna<misnumeros[0].length) {
			fila=0;
			while (fila<misnumeros.length) {
				valor=variable.nextInt(101)+10;
				misnumeros[fila][columna]=valor;
				System.out.print(misnumeros[fila][columna]+ " ");
				fila++;
			}
			columna++;
			System.out.println(" ");
		}

}
}