package RETOS;

import java.util.Scanner;

public class RETO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1 = 0 ;
		int num2 = 0;
		int num3=0;
		int num4=0;
		int num5=0;
		int numeromayor=0;
		int numeromenor=0;
		int maximocomundivisor=0;
		int minimocomunmultiplo=0;
		int contadordivision=0;
		Scanner leer = new Scanner(System.in);
		int contador = 0;
		//ALGORITMO
		System.out.println(" dime un numero entero");
		num1 = leer.nextInt();
		System.out.println(" dime otro numero entero");
		num2 = leer.nextInt();
		if (num1>num2) {
			numeromayor=num1;
			numeromenor=num2;
		}
		else {
			numeromayor=num2;
			numeromenor=num1;
		}
		for ( contador = 0; numeromenor>0;contador++) {
			num3=numeromenor;
			numeromenor = numeromayor%numeromenor;
			numeromayor=num3;
		}
		maximocomundivisor=numeromayor;
		num3=0;
		System.out.println(" el MCD de " + num1 + " y " + num2+ " es " + maximocomundivisor);
		System.out.println(" escribe un numero menor de 500");
		num4=leer.nextInt();
		System.out.println(" escribe otro numero menor de 500");
		num5=leer.nextInt();
		if (num4<=500 && num5<=500) {
		if (num4>num5) {
			numeromayor=num4;
			numeromenor=num5;
		}
		else {
			numeromayor=num5;
			numeromenor=num4;
		}
		for ( contador = 0; numeromenor>0;contador++) {
			num3=numeromenor;
			numeromenor = numeromayor%numeromenor;
			numeromayor=num3;
		}
		maximocomundivisor=numeromayor;
		minimocomunmultiplo=num4*num5;
		minimocomunmultiplo=minimocomunmultiplo/maximocomundivisor;
		System.out.println(" el MCM de " + num4 + " y "+ num5 +" es "+ minimocomunmultiplo);
		}
		else
			System.out.println("eleccion de numeros incorrectos");
		
}
}