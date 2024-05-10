package PROCESO_REPETITIVO_2;

import java.util.Scanner;

public class EJERCICIO16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int menu;
		int num1=40;
		int num2=99;
		int i=0;
		Scanner leer = new Scanner(System.in);
		// ALGORITMO
		do {
			
			System.out.println("escribe 1 para PAR, escribe 2 para IMPAR, escribe 3 para salir");
			menu=leer.nextInt();
			
			switch(menu) {
			case 1: System.out.println("has elegido la opcion PAR");
			for (i=num1;i<=60;i=i+2) {
			System.out.println(i);
			}
			break;
			case 2: System.out.println(" has elegido la opcion impar");
			for (i=num2;i>=77;i--) {
				if (i%2!=0) {
					System.out.println(i);
				}
			}
			
			break;
			case 3: System.out.println("has terminado");
			break;
			}
		}
		while (menu==1 || menu==2);
	}
}
	