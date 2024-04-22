package RETOS;

import java.util.Scanner;

public class examenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS;
		char caracterEntrada=' ';
		char salida = '.';
		Scanner leer = new Scanner(System.in);
		int contarPosiciones=0;
		
		//algoritmo
		System.out.println(" escribe numeros al azar entre 0 y 10, cuando quieras terminar pulsa ,");
			contarPosiciones = leerCaracter();
		System.out.println(" hay " + contarPosiciones + " veces un ' 0 ' despues de un 5 o despues de un 6");
		
	}
	public static int leerCaracter() {
		int contador=0;
		char PosicionAnterior=' ';
		char salida = '.';
		char caracterEntrada=' ';
		Scanner leer = new Scanner(System.in);
		do {
		caracterEntrada = leer.next().charAt(0);
		if(caracterEntrada=='5' || caracterEntrada=='6') {
			if (PosicionAnterior=='0') {
				contador++;
			}
		}
		PosicionAnterior=caracterEntrada;
		}
		while(caracterEntrada!=salida);
	
	
		return contador;
	}
}
