package FUNCIONES;

import java.util.Random;

public class SumarTresPares {
	public static void main(String[] args) {
		int cantidad = 3;
		int acumulado = 0;
		for (int i = 0; i < cantidad;) {
			int valor = generarNumeroAleatorio();
			int valor2 = generarNumeroAleatorio();
			int valor3 = generarNumeroAleatorio();
			
			boolean respuesta = comprobarPar(valor);
			boolean respuesta2 = comprobarPar(valor2);
			boolean respuesta3 = comprobarPar(valor3);
			
			if (respuesta && respuesta2 && respuesta3) {
				i++;
				acumulado = sumarPar(valor + valor2 + valor3);
			}
		}
		System.out.println(acumulado);
	}

	/**
	 * sumar dos numeros pares
	 * @param acumulado primer numero par
	 * @param par segundo numero par
	 * @return devuelve el resultado de la suma de acumulado mas par
	 */
	public static int sumarPar(int acumulado, int par, int c) {
		// TODO
		return acumulado+par+c;
	}

	/**
	 * comprueba si un valor es o no par
	 * 
	 * @param valor el numero a comprobar
	 * @return true si el valor es par o false en caso contario
	 */
	public static boolean comprobarPar(int valor) {
//		boolean b = valor % 2 == 0;
//		if (b == true)
//			return true;
//		else
//			return false;
		return valor % 2 == 0;
	}

	/**
	 * Genera un valor aleatorio
	 * @return un valor obtenido con aleatoriedad
	 */
	public static int generarNumeroAleatorio() {
		return Math.abs(new Random().nextInt(101));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
