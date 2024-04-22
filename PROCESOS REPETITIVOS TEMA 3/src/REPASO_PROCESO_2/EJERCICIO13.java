package REPASO_PROCESO_2;

import java.util.Scanner;

public class EJERCICIO13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int numerointroducido;
		int sumadigitos = 0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime 1 numero y dare la suma de sus digitos");
		numerointroducido = leer.nextInt();
		sumadigitos=sumadigitosenteros(numerointroducido);
		System.out.println(" la suma de los digitos de "+ numerointroducido + " es igual a " + sumadigitos);
		
	}
	/**
	 * el usuario introduce un numero en el parametro para sumar los digitos de un numero entero
	 * @param numerointroducido numero introducido por el usuario
	 * @return, retorna la suma de los digitos de un numero
	 */
	public static int sumadigitosenteros(int numerointroducido) {
		int contador=0;
		int sumadigitos=0;
		int contadoranterior = 0;
		
		for( contador=0;contador<=numerointroducido;contador++) {
			sumadigitos=contador+contadoranterior;
			contadoranterior=contador;
		}
		return sumadigitos;
	}

}
