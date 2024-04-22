package RETOS;

import java.util.Scanner;

public class RETO5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i=0;
		char letraElegida=' ';
		int horizontal = 0;
		int vertical =0;
		char palabraElegida[]= new char [6];
		char misletras [][]= new char [6][6];
		int filaElegida=0;
		int posicionFija=4;
		int columnaElegida=0;
		Scanner leer = new Scanner(System.in);
		
		//ALGORITMO
		System.out.println(" dime una palabra con 6 letras: ");
		for(i=0;i<palabraElegida.length;i++) {
			letraElegida= leer.next().charAt(0);
			palabraElegida[i]=letraElegida;
		}
		System.out.println(" elige una fila y una columna en la que quieras que escriba la palabra: ");
		System.out.print(" dime la fila :");
		filaElegida=leer.nextInt();
		filaElegida=filaElegida-1;
		System.out.println(" dime la columna :");
		columnaElegida = leer.nextInt();
		columnaElegida=columnaElegida-1;
		i=0;
		for (vertical=0;vertical<6;vertical++) {
			if(vertical!=filaElegida) {
			for(horizontal=0;horizontal<6;horizontal++) {
				if(horizontal==columnaElegida) {
				misletras[vertical][horizontal]=palabraElegida[i];
				i++;
				}
				else {
				misletras[vertical][horizontal]=' ';
					}
				}
			}
			if(vertical==filaElegida) {
				i=0;
				for(horizontal=0;horizontal<6;horizontal++) {
					misletras[vertical][horizontal]=palabraElegida[i];
					i++;
				}
				i=vertical+1;
			}
			
		}
			for(vertical=0;vertical<6;vertical++) {
				for (horizontal=0;horizontal<6;horizontal++) {
					System.out.print(misletras[vertical][horizontal]+" ");
				}
				System.out.println();
			}
	}
	
	}



