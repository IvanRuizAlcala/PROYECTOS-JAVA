package REPASO_PROCESO_2;

import java.util.Scanner;

public class EJERCICIO10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		double temperatura=0;
		char opcion = ' ';
		double temperaturafinal= 0;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" si quieres pasar grados a kelvin escribe k, para farenheit usa f");
		opcion = leer.next().charAt(0);
		if (opcion=='f') {
			System.out.println(" escribe una temperatura");
			temperatura=leer.nextDouble();
			temperaturafinal=gradosCF(temperatura);
			System.out.println(" la temperatura en farenheit es "+ temperaturafinal);
		}
		if (opcion=='k') {
			System.out.println(" escribe una temperatura");
			temperatura=leer.nextDouble();
			temperaturafinal=gradosCK(temperatura);
			System.out.println(" la temperatura en kelvin es "+ temperaturafinal);
		}

	}
	public static double gradosCK(double temperaturausuario) {
		double k = 0;
		 double constante = 273.15;
		 k=temperaturausuario+constante;
		return k;
				
	}
	/**
	 * cambiamos los grados celsiuis a calvin
	 * @param usuario introduce una temperatura en celsius
	 *@param realizamos operacion para averiguar grados kelvin, sumando los celsius a su constante
	 *@return devolvemos los grados en kelvin
	 */
	public static double gradosCF(double temperatura) {
		double f =0;
		f = (temperatura * 1.8)+32;
		return f;
		
	}
	/**
	 * cambiamos los grados celsiuis a calvin
	 * @param usuario introduce una temperatura en celsius
	 *@param realizamos operacion para averiguar grados farenheit con su operacion 
	 *@return devolvemos los grados en farenheit
	 */
}
