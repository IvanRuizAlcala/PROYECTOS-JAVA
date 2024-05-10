package REPASO_PROCESO_2;

import java.util.Scanner;

public class EJERCICIO5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		char caractera ='a';
		char numero7='7';
		char caracteranterior=' ';
		int contador=0;
		char caracterintroducido=' ';
		char salida='.';
		Scanner leer = new Scanner(System.in);
		//ALGORTIMO
		do {
			System.out.println(" escribe un caracter");
			caracterintroducido= leer.next().charAt(0);
				if (caracterintroducido==numero7 && caracteranterior==caractera) {
				contador++;}
			caracteranterior=caracterintroducido;
			
			}
		
		while(caracterintroducido!=salida);
		System.out.println("la secuencia "+ caractera +""+numero7+ " aparece " + contador +" veces ");
		
		
	}

}
