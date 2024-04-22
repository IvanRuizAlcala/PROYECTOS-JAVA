package REPASO_REPETITIVO;

import java.util.Scanner;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		char caracter1 = ' ';
		int num1=0;
		char caracter2 =' ';
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" escribe caracter");
		caracter1 = leer.next().charAt(0);
		for ( caracter2='a';caracter2<='z';caracter2++) {
			if (caracter2==caracter1) {
				System.out.println(" la carácter es del grupo de las minusculas");
			}
		}
		for ( caracter2='A';caracter2<='Z';caracter2++) {
			if (caracter2==caracter1) {
				System.out.println(" la carácter es del grupo de las mayusculas");
			}
		}
		{
			for ( caracter2='0';caracter2<='9';caracter2++) {
				if (caracter2==caracter1) {
				System.out.println(" la carácter es del grupo de los digitos");
			}
		}
		
	}

}
}