package juegomal;


import java.util.Random;
import java.util.Scanner;

public class NumeroMasAltoError {
	public static void main(String[] args) {
		int minimoValorPosible = 1;
		int maximoValorPosible = 101;
		int secreto = new Random().nextInt(maximoValorPosible) + minimoValorPosible;
		int maximoFallosPermitidos = 5;
		int fallosCometidos = 0;
		int comparacion;
		int fallosMaximosAlcanzados=0;
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println("escribe un numero");
			int valor = leer.nextInt();
			comparacion = valor - secreto;
			if (comparacion==0)

			{
				System.out.println("Enhorabuena");
			} 
			else{
				
			if (comparacion>0) {
					System.out.println("te has pasado");
				} else {
					System.out.println("no es suficiente");
				}	
			}	
			fallosCometidos=fallosCometidos+1;
			fallosMaximosAlcanzados = fallosCometidos - maximoFallosPermitidos;
		} while (comparacion != 0 && fallosMaximosAlcanzados!=0);
		if (fallosMaximosAlcanzados==0) {
			System.out.println("maximo de intentos alcanzados");
		}
		
	}
	}
