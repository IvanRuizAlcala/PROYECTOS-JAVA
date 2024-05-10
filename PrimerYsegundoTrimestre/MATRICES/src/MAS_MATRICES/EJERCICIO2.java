package MAS_MATRICES;

import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		char letraIntroducida1= ' ';
		char letraIntroducida2= ' ';
		char comprobarPrimerarray= ' ';
		char comprobarSegundoarray=' '; 
		int horizontal = 0;
		int vertical = 0;
		int i=0;
		int j=0;
		char[][] misletras1= new char [4][4];
		char[][] misletras2= new char [4][4];
		char d[]= new char[16];
		char f[]= new char[16];
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" introduce la primera matriz");
		for(vertical=0;vertical<4;vertical++) {
			System.out.println("llenemos la siguiente fila ");
			for(horizontal=0;horizontal<4;horizontal++) {
				letraIntroducida1=leer.next().charAt(0);
				misletras1[vertical][horizontal]=letraIntroducida1;
			}	
		}
		for(vertical=0;vertical<4;vertical++) {
			for(horizontal=0;horizontal<4;horizontal++) {
				System.out.print(misletras1[vertical][horizontal]+ " ");
			}
			System.out.println(" ");
		}	
		System.out.println(" ");
		System.out.println(" introduce la segunda matriz");
		for(vertical=0;vertical<4;vertical++) {
			System.out.println("llenemos la siguiente fila ");
			for(horizontal=0;horizontal<4;horizontal++) {
				letraIntroducida2=leer.next().charAt(0);
				misletras2[vertical][horizontal]=letraIntroducida2;
			}	
		}
		for(vertical=0;vertical<4;vertical++) {
			for(horizontal=0;horizontal<4;horizontal++) {
				System.out.print(misletras2[vertical][horizontal]+ " ");
			}
			System.out.println(" ");
		}
		for(vertical=0;vertical<4;vertical++) {
			for(horizontal=0;horizontal<4;horizontal++) {
				comprobarPrimerarray=misletras1[vertical][horizontal];
				comprobarSegundoarray=misletras2[vertical][horizontal];
				if(comprobarPrimerarray==comprobarSegundoarray) {
					if(comprobarPrimerarray<='m') {
					d[i]=comprobarPrimerarray;
					i++;
					}
					if(comprobarSegundoarray>'m') {
						f[j]=comprobarSegundoarray;
						j++;
					}
				}
			}
			System.out.println(" ");
		}
		for (i=0;i<d.length;i++) {
			System.out.print(d[i]+" ");
		}
		System.out.println(" ");
		for(j=0;j<f.length;j++) {
			System.out.print(f[j]+" ");
		}
	}
}
