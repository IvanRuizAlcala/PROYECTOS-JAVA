package EJERCICIO_MAS_MATRICES;

import java.util.Random;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int vertical=0;
		
		int sumarFilas=0;
		int i=0;
		int u=0;
		int horizontal=0;
		Random aleatorio = new Random();
		int valorAleatorio=0;
		int misnumeros[][]= new int[5][5];
		int sumarColumnas[]= new int[5];
		int sumarFila[]=new int[5];
		//ALGORITMO
		for(vertical=0;vertical<misnumeros.length;vertical++) {
			for(horizontal=0;horizontal<misnumeros[0].length;horizontal++) {
				valorAleatorio=aleatorio.nextInt(5)+1;
				misnumeros[vertical][horizontal]=valorAleatorio;
			}
		}
		for(i=0;i<5;i++) {
			sumarColumnas = sumarColumnas(misnumeros);
			System.out.println(sumarColumnas[i]);
			
		}
		for(i=0;i<5;i++) {
			sumarColumnas = sumarColumnas(misnumeros);
			System.out.println(sumarColumnas[i]);
			
		}
		
	
	}
	public static int [] sumarColumnas(int misnumeros [][]) {
		int horizontal = 0;
		int suma=0;
		int vertical =0;
		int i=0;
		int[] sumarColumnas = new int [5];
		for(vertical=0;vertical<misnumeros.length;vertical++) {
			for(horizontal=0;horizontal<misnumeros[0].length;horizontal++) {
				suma = suma + misnumeros [vertical][horizontal];
				sumarColumnas[i]=suma;
			}
			i++;
		}
	
	return sumarColumnas;
	}
	public static int [] sumarfilas(int misnumeros [][]) {
		int horizontal = 0;
		int suma=0;
		int vertical =0;
		int i=0;
		int[] sumarFilas = new int [5];
		for(horizontal=0;horizontal<misnumeros[0].length;horizontal++) {
		for(vertical=0;vertical<misnumeros.length;vertical++) {
				suma = suma + misnumeros [vertical][horizontal];
				sumarFilas[i]=suma;
			}
			i++;
		}
	
	return sumarFilas;
	}
	}