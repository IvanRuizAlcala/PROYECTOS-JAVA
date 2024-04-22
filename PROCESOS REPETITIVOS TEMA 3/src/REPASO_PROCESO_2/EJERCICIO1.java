package REPASO_PROCESO_2;

import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=1;
		int num2=0;
		char estrella='*';
		int i=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		for (i=num1;num1<=10;num1++) {
			num2=1;
			System.out.print(num1+"-->");
			for (num2=1;num2<=num1;num2++) {
				System.out.print(estrella);
				
			}
			System.out.println();	
		}
	}

}
