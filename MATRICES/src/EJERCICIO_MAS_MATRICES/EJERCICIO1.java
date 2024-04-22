package EJERCICIO_MAS_MATRICES;

import java.util.Random;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int vertical=0;
		int i=0;
		int u=0;
		int horizontal=0;
		Random aleatorio = new Random();
		int valorAleatorio=0;
		int misnumeros[][]= new int[5][5];
		int guardarPrimerafila[]= new int[5];
		int guardarUltimafila[]=new int[5];
		//ALGORITMO
		for(vertical=0;vertical<misnumeros.length;vertical++) {
			for(horizontal=0;horizontal<misnumeros[0].length;horizontal++) {
				valorAleatorio=aleatorio.nextInt(5)+1;
				misnumeros[vertical][horizontal]=valorAleatorio;
				if(horizontal==0) {
					guardarPrimerafila[i]=misnumeros[vertical][horizontal];
					i++;
				}
				
				if(horizontal==4) {
					
					guardarUltimafila[u]=misnumeros[vertical][horizontal];
					u++;
				}
					
			}
		}
		i=0;
		u=0;
		for(vertical=0;vertical<misnumeros.length;vertical++) {
			for(horizontal=0;horizontal<misnumeros[0].length;horizontal++) {
			System.out.print(misnumeros[vertical][horizontal]+" ");
		
			}
			System.out.println();
		}
		System.out.println("realizamos el cambio");
		for(vertical=0;vertical<misnumeros.length;vertical++) {
			for(horizontal=0;horizontal<misnumeros[0].length;horizontal++) {
				if(horizontal==0) {
					misnumeros[vertical][horizontal]=guardarUltimafila[u];
					u++;
				}
				if(horizontal==4) {
					misnumeros[vertical][horizontal]=guardarPrimerafila[i];
					i++;
				}
				
				System.out.print(misnumeros[vertical][horizontal]+" ");
			}
			
		System.out.println();
		}
		
		
	
	}
}
