package DIBUJO;

import java.util.Scanner;

public class EJERCICIODIBUJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DATOS
		int num1=0;
		int i=1;
		int num2=0;
		int inicializar=0;
		int num3=0;
		int veces=1;
		int posicion=0;
		Scanner leer =new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime un numero");
		num1=leer.nextInt();
		num3=num1;
		while(veces<=num1) {
		for(i=i;veces<=num1;i++) {
			num3--;
			posicion++;
		if (i<=num1) {
			System.out.print(i);
		}
		
		if (num3<0) {
			System.out.print(num1);
		}
			if (posicion==num1) {
				System.out.println(" ");
				inicializar++;
				i=inicializar;
				veces++;
				num3=num1-veces;
				posicion=1;
				
		}
		}
		}
		
		
	
		}
}
