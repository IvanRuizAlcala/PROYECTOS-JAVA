package REPASO_PROCESO_2;

import java.util.Scanner;

public class EJERCICIO4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=1;
		int num2=0;
		int numeroasignadousuario=0;
		int numeromaximo=0;
		int numerominimo=0;
		int diferencia=0;
		int diferenciaanterior = 0;
		int acumulador=0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println("dime cuanto numeros quieres escribir");
		numeroasignadousuario=leer.nextInt();
		System.out.println("introduce los numeros");
		while(num1<=numeroasignadousuario) {
			num2=leer.nextInt();
			diferenciaanterior=diferencia;
			diferencia=acumulador-num2;
			if (diferencia<numeromaximo) {
				numeromaximo=diferencia;
			}
			acumulador=num2;
			num1++;
			
		}
			
		System.out.println(" la mayor diferencia entre los numeros es "+numeromaximo);
	
		
}
}
