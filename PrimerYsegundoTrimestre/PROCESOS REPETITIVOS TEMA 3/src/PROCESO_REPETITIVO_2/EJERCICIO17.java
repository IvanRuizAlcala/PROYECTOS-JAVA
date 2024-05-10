package PROCESO_REPETITIVO_2;

import java.util.Scanner;

public class EJERCICIO17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		
		int num1=0;
		int num2=0;
		int num3=0;
		int resto=0;
		Scanner leer = new Scanner(System.in);
		// ALGORITMO
		do {
			System.out.println(" introduce un numero entero");
			num1=leer.nextInt();
			System.out.println("introduce otro numero entero");
			num2 = leer.nextInt();
			resto = num1 % num2;
			if (resto==0) {
				System.out.println(num1 + " es divisor de " +  num2 + " ya que al dividirlos el resto es 0");
			}
			else {
				System.out.println(" no es divisor");
			}
			System.out.println(" si desea continuar escriba 1, si desea finalizar escriba 0");
			num3=leer.nextInt(); 
		}
		while (num3==1); 
			if (num3==0) {
				System.out.println(" has terminado");
			}
		
			
		}
		
		}