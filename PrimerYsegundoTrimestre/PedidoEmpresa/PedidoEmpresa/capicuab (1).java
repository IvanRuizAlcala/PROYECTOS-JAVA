/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

import java.io.*;
import java.math.*;
import java.util.Scanner;

public class capicuab {

	public static void main(String args[]) throws IOException {
		Scanner leer = new Scanner(System.in);
		double alternativa;
		double cifra;
		double contador;
		int guardado;
		double ncifras;
		double volteado;
		// datos
		guardado = 0;
		ncifras = 10;
		volteado = 0;
		cifra = 0;
		contador = 1;
		alternativa = 0;
		// algoritmo
		// leer numero
		System.out.println("introduce un numero");
		do {
			guardado = leer.nextInt();
		} while (guardado<=9);
		// contar cifras
		while (guardado/ncifras>10) {
			System.out.println(ncifras);
			ncifras = ncifras*10;
		}
		alternativa = guardado;
		System.out.println(ncifras);
		while (guardado/ncifras>=1) {
			// aqui me quedo con el primer digito
			cifra = guardado%10;
			// aqui le quito al numero el primer digito
			guardado = (int) Math.floor(guardado/10);
			// coloco en su posicion el primer digito
			volteado = volteado+ncifras*cifra;
			// reducir el factor de conversion
			ncifras = ncifras/10;
		}
		System.out.println(volteado);
		if (volteado==alternativa) {
			System.out.println("es capicua");
		}
	}


}

