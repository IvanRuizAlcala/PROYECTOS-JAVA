/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "EJERCICIO39.java."

import java.io.IOException;
import java.util.Scanner;

public class ejercicio39Error {

	public static void main(String args[]) throws IOException {
		Scanner leer = new Scanner(System.in);
		double contador;
		double numero_uno;
		double temporal;
		// datos
		numero_uno = 0;
		temporal = 0;
		// algoritmo
		do {
			System.out.println("introduce un numero natural");
			numero_uno = leer.nextInt();
		} while (numero_uno<=0);
		// HACE FALTA UNA FUNCION
		temporal = Math.floor(numero_uno/2);
		for (contador=temporal;contador>=2;contador--) {
			if (numero_uno%contador==0) {
				System.out.println("el numero "+contador+" es divisor de "+numero_uno);
			}
		}
		System.out.println("el numero "+contador+" es divisor de "+numero_uno);
	}


}

