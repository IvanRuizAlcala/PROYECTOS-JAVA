package EJERCICIOS_MATRICES_1;

import java.util.Random;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int fila=0;
		int columna=0;
		int valor=0;
		int sumarFila=0;
		Random aleatorio = new Random();
		int misnumeros[][]= new int [5][5];
		for (fila =0 ; fila<misnumeros.length;fila++) {
			for ( columna=0;columna<misnumeros.length;columna++) {
				valor=aleatorio.nextInt(10)+1;
				misnumeros[fila][columna]=valor;
				System.out.print(misnumeros[fila][columna]+ " ");
				
			}
			System.out.println(" ");
			
		}
	
	for (fila =0; fila<misnumeros.length;fila++) {
		for ( columna=0;columna<misnumeros.length;columna++) {
			sumarFila=sumarFila+misnumeros[fila][columna];
		}
		System.out.print(sumarFila + " ");
		sumarFila=0;

}
}
}