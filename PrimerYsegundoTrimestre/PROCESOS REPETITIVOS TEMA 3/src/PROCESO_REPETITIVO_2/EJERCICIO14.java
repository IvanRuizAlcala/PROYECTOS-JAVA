package PROCESO_REPETITIVO_2;

import java.util.Scanner;

public class EJERCICIO14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DATOS
		int num1=5;
		int i=0;
		int cubo1=3;
		int cuadrado=2;
		Scanner leer=new Scanner(System.in);
		//algoritmo
		
			for(i=num1;i<=25;i++)
				System.out.println(i +" "+ Math.pow(i,cuadrado)+" "+Math.pow(i, cubo1));
			
		
		
	}

}
