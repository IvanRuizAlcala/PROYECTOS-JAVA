package REPASO_PROCESO_2;

import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int num3=0;
		int i=0;
		//ALGORITMO
		for(num1=1;num1<=10;num1++) {
			num3=num1;
			num2=1;
			System.out.print(num1+"-->");
			for(i=num2;num2<=num1;num2++) {
				System.out.print(num3+" ");
				
			}
			System.out.println();
		}
		

	}

}
