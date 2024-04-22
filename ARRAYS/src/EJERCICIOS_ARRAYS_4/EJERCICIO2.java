package EJERCICIOS_ARRAYS_4;

import java.util.Scanner;

public class EJERCICIO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mes=" ";
		int dia = 0;
		int salir=0;
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println(" dime un dia de la semana");
			dia=leer.nextInt();
		switch(dia) {
		case 1 : System.out.println("lunes");
		break;
		case 2 : System.out.println("martes");
		break;
		case 3 : System.out.println("miercoles");
		break;
		case 4 : System.out.println("jueves");
		break;
		case 5 : System.out.println("viernes");
		break;
		case 6 : System.out.println("sabado");
		break;
		case 7 : System.out.println("domingo");
		break;
		}
		System.out.println(" si desesa salir pulse 0, para repetir pulse 1");
		salir=leer.nextInt();
	}
		while(salir==1);

}
}