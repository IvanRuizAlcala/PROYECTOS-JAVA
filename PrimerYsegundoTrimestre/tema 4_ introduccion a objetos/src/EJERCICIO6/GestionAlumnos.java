package EJERCICIO6;

import java.util.Random;
import java.util.Scanner;



public class GestionAlumnos{

	
	static Alumnos6 misAlumnos [] = new Alumnos6[elegirNumeroAlumnos()];
	
	public static int elegirNumeroAlumnos() {
		Scanner leer = new Scanner(System.in);
		int numeroObjetosElegidosPorUsuario=0;
		System.out.println("elige el numero de alumnos que quieres crear: ");
		numeroObjetosElegidosPorUsuario = leer.nextInt();
		return numeroObjetosElegidosPorUsuario;

	}
		
	public static void llenarArray() {
		
		Random ramdon = new Random();
		String nombre [] = {"Ethan","Olivia","Liam","Emma","Daniel","Ava","Noah","Sophia","Lucas","Isabella",
"Alexander","Mia","Benjamin","Amelia","Oliver","Harper","Mason","Evelyn","William","Abigail","James","Emily",
"Michael","Scarlett","Elijah",};
		String apellidos [] = {"ruiz","rivera","lomana", "lemus", "cano"};
		int contador=0;
		int aleatorio = 0;
		int nota1=0;
		int nota2=0;
		int numeroExpediente=0;
		int nombreAleatorio=0;
		int apellidosAleatorio=0;
		for(contador=0;contador<misAlumnos.length;contador++) {
			nota1  = ramdon.nextInt(11);
			nota2  = ramdon.nextInt(11);
			nombreAleatorio  = ramdon.nextInt(25);
			apellidosAleatorio  = ramdon.nextInt(5);
			numeroExpediente  = ramdon.nextInt(10000);
		Alumnos6 alumno= new Alumnos6(nombre[nombreAleatorio],apellidos[apellidosAleatorio], nota1 , nota2, numeroExpediente);
		misAlumnos[contador]=alumno;
		}
	}	
	
	public static void mostrarAlumnos() {
		int notaMedia=0;
		int contador=0;
		for(contador=0; contador<misAlumnos.length;contador++) {
			notaMedia=(misAlumnos[contador].getNota1()+misAlumnos[contador].getNota2())/2;
			System.out.println(misAlumnos[contador]+" " + " la nota media es " + notaMedia);
			
			
		}
	}
	public static void mostrarNotas() {
		int notaMedia=0;
		int contador=0;
		for(contador=0; contador<misAlumnos.length;contador++) {
			notaMedia=(misAlumnos[contador].getNota1()+misAlumnos[contador].getNota2())/2;
			System.out.println(misAlumnos[contador].getNumeroDeExpediente()+" " + misAlumnos[contador].getNombre()+ " la nota media es " + notaMedia);
	}
		}
	public static void buscarAlumnoPorNumeroExpediente() {
		int contador1=0;
		int notaMedia=0;
		int numeroElegidoporUsuario=0;
		Scanner leer = new Scanner(System.in);
		int salir;
		int contador=0;
			do {
				System.out.print("dime un numero de expediente :");
				numeroElegidoporUsuario = leer.nextInt();
		for(contador=0; contador<misAlumnos.length;contador++) {
			if(misAlumnos[contador].getNumeroDeExpediente()==numeroElegidoporUsuario) {
				System.out.println(misAlumnos[contador]);
				contador1++;
			}
		}
			if(contador1==0) {
				System.out.println(" el numero elegido es incorrecto");
			}
			System.out.println(" puedes repetir el proceso pulsando 1, si quieres terminar pulsa 0");
			salir=leer.nextInt();
			}
			while(salir!=0);
		}
	}



	

