package EJERCICIOS_ARRAYS_2;

import java.util.Scanner;

public class EJERCICIO2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		String contraseña=" ";
		Scanner leer = new Scanner(System.in);
		int longitud= 0;
		int i;
		

		System.out.println("dime una contraseña entre 4 y 20 caracteres y que sean numeros impares");
		contraseña=leer.next();
		System.out.println(comprobarcontraseña(contraseña));
	}
	
	public static Boolean comprobarcontraseña(String contraseña) {
		int longitud=0;
		longitud=contraseña.length();
		if(longitud>=4&&longitud<=20&&longitud%2==1) {
		return true;
		}
		return false;
		
	}
}
