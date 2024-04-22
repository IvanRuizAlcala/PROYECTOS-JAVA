package App;

import java.util.HashMap;
import java.util.Scanner;

import Class.GestionEstudiantes;

public class App {

	public static void main(String[] args) {
		//VARIABLES
		HashMap<String,Integer> notasEstudianteElegidoPorUsuario;
		int idElegidaPorUsuario;
		int key;
		GestionEstudiantes gestionEstudiantes = new GestionEstudiantes();
		Scanner leer = new Scanner(System.in);
		//GESTION
		 System.out.println("Bienvenidos a sr while Systems");
		 do {
			 setMenu();
			 key = leer.nextInt();
			 switch (key) {
			case 1: {
				gestionEstudiantes.addEstudiante();
				System.out.println(" estudiante añadido correctamente");
			}
				break;
			case 2:{
				System.out.print(" dime un id: ");
				idElegidaPorUsuario = leer.nextInt();
				System.out.println(" el estudiante es " +gestionEstudiantes.getEstudiante(idElegidaPorUsuario));
			}
				break;
			case 3:{
				System.out.println("dime un id");
				idElegidaPorUsuario = leer.nextInt();
				notasEstudianteElegidoPorUsuario = gestionEstudiantes.getNotasEstudiante(idElegidaPorUsuario);
				System.out.println(notasEstudianteElegidoPorUsuario);
				}
			
				break;
			case 4:{
				System.out.println(" los estudiantes aprobados son :" + gestionEstudiantes.getAprobados());
			}
			
			break;
			case 5:{
				String asignatura;
				System.out.println(" escribe la asignatura a revisar");
				asignatura = leer.next();
				System.out.println(" los estudiantes aprobados son :" + gestionEstudiantes.getAprobadosXAsignatura(asignatura));
			}
			
			break;
			case 6:{
				gestionEstudiantes.visualizarEstudiantes();
			}
				break;
			default: { 
				System.out.println(" opcion erronea");
			}
				break;
			}
			 
		 }
		 while(key != 8);
	}
 public static void setMenu() {
	System.out.println(" Menu :");
	System.out.println("1. Agregar un estudiante :");
	System.out.println("2. buscar estudiante por ID :");
	System.out.println("3. visualizar notas :");
	System.out.println("4. visualizar alumnos con todas las notas aprobadas :");
	System.out.println("5. visualizar alumnos con la asignatura aprobada que elijas :");
	System.out.println("6. visualizar Estudiantes :");
	System.out.print(" elije una opcion: ");
 }
}  
