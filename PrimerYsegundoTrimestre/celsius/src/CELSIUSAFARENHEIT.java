/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "FAHRENHEIT.java."

import java.io.*;

public class CELSIUSAFARENHEIT {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String celsius;
		String conversion;
		double conversor;
		String farenheit;
		double grados;
		double maximocelsius;
		double maximo_celsius;
		double maximo_farenheit;
		double minimo_celsius;
		double minimo_farenheit;
		// datos
		conversion = "";
		celsius = "C";
		farenheit = "F";
		conversor = 0;
		grados = 0;
		minimo_celsius = -273;
		maximo_celsius = 1000;
		minimo_farenheit = -459.4;
		maximo_farenheit = 1832;
		// algoritmo
		System.out.println("pulse C para convertir a celsius o F para farenheit");
		conversion = bufEntrada.readLine();
		if (conversion.length()==1 && (conversion.equals(celsius)) || (conversion.equals(farenheit))) {
			if ((conversion.equals(celsius))) {
				System.out.println("Introduzca grados Celsius: como mimimo -273 y como m�ximo 1000");
				grados = Double.parseDouble(bufEntrada.readLine());
				if ((grados>=minimo_celsius && grados<=maximo_celsius)) {
					conversor = (grados*9/5)+32;
					System.out.println(grados+" Celsius equivalen a "+conversor+" grados Fahrenheit");
				} else {
					System.out.println("error");
				}
			}
			if ((conversion.equals(farenheit))) {
				System.out.println("introduzca los grados farenheit como mimimo -459.4 y como m�ximo 1832 ");
				grados = Double.parseDouble(bufEntrada.readLine());
				if ((grados>=minimo_farenheit && grados<=maximo_farenheit)) {
					conversor = (grados-32)*5/9;
					System.out.println(grados+" farenheit equivalesn a "+conversor+" grados celsius");
				} else {
					System.out.println("error");
				}
			}
		} else {
			System.out.println("ERROR");
		}
	}


}

