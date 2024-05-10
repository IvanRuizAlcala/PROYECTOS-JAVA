package FUNCIONES1;

import java.util.Scanner;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS 
		int caracter;
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println("dime un numero");
		caracter=leer.nextInt();
		System.out.println(ascii(caracter));
		
	}
 public static  char ascii(int num1) {
	  return (char)num1;
	 
	
}
}
