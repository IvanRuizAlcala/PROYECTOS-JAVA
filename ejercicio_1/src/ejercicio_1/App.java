package ejercicio_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		GestionDatosMeteo gestion = new GestionDatosMeteo();
		int anno =0;
		int mes = 0;
		int opcion = 0;
		System.out.println(" Bienvenidos a Sr while Systems");
		System.out.println(" vamos a crear un Menu");
		do {
			mostrarMenu();
			opcion = leer.nextInt();
			switch (opcion) {
			case 1:{
				gestion.anadirDatos();
				System.out.println(" se ha añadido un dato meteorologico");
			}
				break;
			case 2:{
				System.out.println(" la temperatura media es : ");
				System.out.println(gestion.mediaTempMax());
			}
			break;
			case 3:{
				System.out.println(" dime un año");
				anno = leer.nextInt();
				System.out.println(" dime un mes");
				mes = leer.nextInt();
				System.out.println(" la temperatura media por año y mes es ");
				
				System.out.println(gestion.mediaTempMax(anno, mes));
			}
			break;
			case 4:{
				System.out.println(gestion.numeroRegistros());
			}
			break;
			case 5:{
				gestion.visualizarArray();
			}
			break;
			case 6:{
				System.out.println(" adios caloh");
			}
			break;
			default:{
				System.out.println(" la opcion elegida no es valida, no intentes piratear granuja!");
			}
				break;
			}
		}
		while(opcion!=6);
	}
	public static void mostrarMenu() {
		System.out.println("1 : añade un dato meteorologico");
		System.out.println("2 : media de las temperaturas maximas");
		System.out.println("3 : media máximas de un mes y año pasados");
		System.out.println("4 : numero de elementos del array");
		System.out.println("5 : visualizar");
		System.out.println("6 : salir");
		System.out.print(" dime una opcion a elegir : ");
	}
}
