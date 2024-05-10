package EJERCICIO5_STATIC;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datos
		int contador=0;
		String nombre = "";
		String apellidos= " ";
		String nota1= "";
		String nota2="";
		String numeroExpediente="";
		Scanner leer = new Scanner(System.in);
		String crearObjeto[] = {nombre,apellidos,nota1,nota2,numeroExpediente};
		//algoritmo
		System.out.println("dime un nombre");
		for (contador=0;contador<crearObjeto.length;contador++) {
			crearObjeto[contador]=
			
		}
		
		alumnos alumno1 = new alumnos("ivan","ruiz", 1 , 9, 1456987);
		alumnos alumno2 = new alumnos("ivan","ruiz", 4 , 9, 1456999);
		alumnos alumno3 = new alumnos("ivan","ruiz", 5 , 9, 1456333);
		alumnos alumno4 = new alumnos("ivan","ruiz", 6 , 9, 1456444);
		alumnos alumno5 = new alumnos("ivan","ruiz", 8 , 9, 1456555);
		alumnos alumno6 = new alumnos("ivan","ruiz", 9 , 9, 1456666);
		alumnos alumno7 = new alumnos("ivan","ruiz", 6 , 9, 1456777);
		alumnos misalumnos[] = {alumno1, alumno2, alumno3};
		for(contador=0;contador<misalumnos.length;contador++) {
			System.out.println(misalumnos[contador]);
		}
	}

}
