package vista;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import control.gestionDepartamentos;

public class App {

	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		Scanner leer = new Scanner(System.in);
		int salir=0;
		int key = 0;
		gestionDepartamentos gestion = new gestionDepartamentos();
		System.out.println("Sr.While{System.in)");
		boolean crearTabla = gestion.crearTabla();
		if(crearTabla==true) {
			System.out.println("la tabla ha sido creada");
		}
		else {
			System.out.println("la tabla no ha podido crearse o ya ha sido creada");
		}
		ArrayList<String> convertirDatos = gestion.convertirDatos("paises1.txt");
		boolean insertarDatosEnBBD = gestion.insertarDatosEnBBD(convertirDatos);
		if(insertarDatosEnBBD==true) {
			System.out.println(" los datos han sido insertados");
		}
		else {
			System.out.println("los datos no han podido insertarse");
		}
		do {
			crearMenu();
			key =leer.nextInt();
			switch (key) {
			case 1:{
				ArrayList<String> visualizarPaisesAcabadosEnA = gestion.visualizarPaisesAcabadosEnA();
				for (String string : visualizarPaisesAcabadosEnA) {
					System.out.println(string);
				}
			}
				
				break;
			case 2:{
				ArrayList<String> visualizarPaisesEmpezadosEnL = gestion.visualizarPaisesEmpezadosEnL();
				for (String string : visualizarPaisesEmpezadosEnL) {
					System.out.println(string);
				}
			}
			
			break;
			case 3:{
				
			}
			
			break;
			case 4:{
				
			}
			
			break;
			case 5:{
				
			}
			
			break;

			default:
				salir=6;
				break;
			}
		}
		while(salir!=6);
		}
	public static void crearMenu() {
		System.out.println(" menu :");
		System.out.println("1. ver los paises que acaben con la letra 'a' de la BD");
		System.out.println("2. ver el numero total de paises que empiezan por 'l'");
		System.out.println("3. pdf con los paises que tengan mas de 10 caracteres");
		System.out.println("4. modificar nombre paise");
		System.out.println("5. eliminar pais");
		System.out.println("6. salir");
		System.out.println("elige una opcion : ");
	}
	
	}


