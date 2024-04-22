package App;

import Class.GestionViajes;

public class App {

	public static void main(String[] args) {
		GestionViajes gestionarViajes= new GestionViajes();
		
		gestionarViajes.crearViaje();
		gestionarViajes.visualizar();
	}
	public static void setMenu() {
		System.out.println(" Menu :");
		System.out.println("1. crear un viaje :");
		System.out.println("2. eliminar un viaje :");
		System.out.println("3. visualizar notas :");
		System.out.println("4. visualizar alumnos con todas las notas aprobadas :");
		System.out.println("5. visualizar alumnos con la asignatura aprobada que elijas :");
		System.out.println("6. visualizar Estudiantes :");
		System.out.print(" elije una opcion: ");
	 }
}
