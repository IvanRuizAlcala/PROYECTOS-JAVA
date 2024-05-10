package REPASO_PROCESO_2;

import java.util.Scanner;

public class EJERCICIO12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int numerointroducido=0;
		boolean leernumeroprimo;
		Scanner leer = new Scanner(System.in);
		//algoritmo
		System.out.println(" dime un numero entero");
		numerointroducido=leer.nextInt();
		leernumeroprimo=calcularnumeroprimo(numerointroducido);
		System.out.println(" el numero introducido " + numerointroducido + " es " + leernumeroprimo);
	}
	/**
	 * introduce un numero, y calcularemos si es primo o no es
	 * @numerointroducido, numero que el usuario introduce para saber si es o no es primo
	 * @return en caso de ser primo sera true, en caso contrario sera false
	 */
public static boolean calcularnumeroprimo(int numerointroducido) {
	int contador=0;
	int divisor =0;
	int contadordivisor=0;
	for (contador=1;contador<=numerointroducido;contador++) {
		divisor=numerointroducido%contador;
		if (divisor==0) {
			contadordivisor++;
		}
	}
		if (contadordivisor==2) {
			return true;
		}

		return false;
}
}
