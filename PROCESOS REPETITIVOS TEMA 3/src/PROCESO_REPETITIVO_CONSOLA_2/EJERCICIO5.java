package PROCESO_REPETITIVO_CONSOLA_2;

import java.util.Scanner;

public class EJERCICIO5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		int dividendo=1;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=2;
	Scanner leer = new Scanner(System.in);
		//ALGORITMO
		
		System.out.println("dime un numero");
		num1=leer.nextInt();
		
	if (num1==1) {
		System.out.println(" el numero no es primo");
		}
	else {
		while (dividendo!=num1) {
			 num3=num1/dividendo;
			 dividendo++;
			 if (num1==num3||dividendo==num1) {
				 num4++;}
			 else {
			 num5=num6*num3;
			 num6++;
			 if (num5==num1) {
				 num4++;
			 }
			 }
		}
		if(num4<=2) {
			System.out.println("el numero es primo");
		}
			else {
				System.out.println(" el numero no es primo");
			}
				
	}
		
			
		
	}
		
	}
	

