package App;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import Class.Alumno;
import Class.GestionAlumnos;
import Class.GestionFicheroDat;
import Class.GestionFicheroTXT;

public class App {

	public static void main(String[] args) {
		int idElegidoPorUsuario = 0;
		boolean continuar = true;
		Scanner leer = new Scanner(System.in);
		int key = 0;
		String fichero;
		Array[] cargando = new Array[10];
		GestionFicheroTXT gestionFichero;
		GestionAlumnos gestionAlumnos = new GestionAlumnos();
		double visualizarNota = 0;
		ArrayList<Double> visualizarNotaGlobal = new ArrayList<>();
		ArrayList<Double> auxVisualizar = new ArrayList<>();
		ArrayList<String> archivoCompleto = new ArrayList<>();
		ArrayList<Alumno> totalAlumnos = new ArrayList<>();
		HashMap<Integer, ArrayList<Double>> idNotasAlumno = new HashMap<>();
		HashMap<Integer, Double> idNotasAlumnoIndividual = new HashMap<>();
		ArrayList<Alumno> mediaAlumnos = new ArrayList<>();
		System.out.println(" Bienvenido a Sr While Systems");
		System.out.println(" dime el fichero.txt que vamos a leer");
		fichero= leer.next();
		gestionFichero = new GestionFicheroTXT(fichero);
		System.out.println(" vamos a leer el archivo Datos " + fichero);
		try {
			archivoCompleto=leerFichero(gestionFichero);
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
		System.out.println(" Archivo leido y datos guardados");
		System.out.println("cargando Datos de Alumnos: ");
		
		for (int i = 0; i < cargando.length; i++) {
			if(i==0) {
				System.out.print("0% ");
			}
			else {
				System.out.print("--");
			}
		}
		System.out.println(" 100%");
		totalAlumnos.addAll(gestionAlumnos.CrearAlumnos(archivoCompleto));
		System.out.println(" los alumnos han sido cargados");
		System.out.println(" ");
		System.out.println(" indicanos que hacer con este archivo");
		do{
			crearMenu();
			key = leer.nextInt();
			switch (key) {
			case 1: {
				System.out.println(" dime el numero del alumno: ");
				idElegidoPorUsuario = leer.nextInt();
				visualizarNotaGlobal.addAll(gestionAlumnos.sacarNotas(totalAlumnos, idElegidoPorUsuario));
				System.out.println("el id del Alumno es : " + idElegidoPorUsuario);
				System.out.println(" su nota es: " );
				for (Double notaAux : visualizarNotaGlobal) {
					System.out.print(notaAux + " ,");
					System.out.println(" ");
				}
			}
			break;
			case 2: {
				System.out.println(" dime el numero del alumno: ");
				idElegidoPorUsuario = leer.nextInt();
				idNotasAlumnoIndividual.putAll(gestionAlumnos.sacarNotaMedia(totalAlumnos, idElegidoPorUsuario));
				System.out.println("el id del Alumno es : " + idElegidoPorUsuario);
				visualizarNota = idNotasAlumnoIndividual.get(idElegidoPorUsuario);
				System.out.println(" su nota media es: " + visualizarNota);
			}
				
				break;
			case 3: {
				System.out.println(" dime el numero del alumno: ");
				idElegidoPorUsuario = leer.nextInt();
				idNotasAlumnoIndividual.putAll(gestionAlumnos.sacarNotaMasAlta(totalAlumnos, idElegidoPorUsuario));
				System.out.println("el id del Alumno es : " + idElegidoPorUsuario);
				visualizarNota= idNotasAlumnoIndividual.get(idElegidoPorUsuario);
				System.out.println(" su nota mas alta es: " + visualizarNota);
			}
			break;
			case 4: {
				mediaAlumnos.addAll(gestionAlumnos.sacarNotaMediaTotalAlumnos(totalAlumnos));
				
				for (int i = 0; i < mediaAlumnos.size(); i++) {
					System.out.print(" id : " + mediaAlumnos.get(i).getIdAlumno());
					System.out.print(" nombre : " + mediaAlumnos.get(i).getNombre());
					System.out.print(" su nota media es : " + mediaAlumnos.get(i).getNotaMedia());
					System.out.println();
				}
				}
			break;
			case 5: {
			try {
				crearArchivoDat(totalAlumnos);
			} catch (FileNotFoundException e) {
				e.getMessage();
			} catch (IOException e) {
				e.getMessage();
			}
				}
			break;
			default:
				continuar=false;
				break;
			}
		}
		while(continuar);
	}
public static ArrayList<String> leerFichero(GestionFicheroTXT fichero) throws FileNotFoundException, IOException {
	ArrayList<String> archivoCompleto = new ArrayList<>();
	fichero.abrirArchivo();
	archivoCompleto=fichero.insertarDatos();
	fichero.cerrarArchivo();
	return archivoCompleto;
}
public static void crearMenu() {
	Scanner leer = new Scanner(System.in);
	
	System.out.println(" Menu :");
	System.out.println("1.Obtener las notas de un alumno identificado mediante su número");
	System.out.println("2. Obtener la media de las notas de un alumno identificado mediante su número.");
	System.out.println("3. Obtener la mejor nota de un alumno identificado mediante su número.");
	System.out.println("4. Mostrar número de alumno, nombre y media de sus notas (de todos los alumnos).");
	System.out.println("5. Guardar los alumnos en un fichero .dat");
	System.out.println(" elige una opcion: ");
	
}
public static void crearArchivoDat(ArrayList<Alumno> alumnos) throws FileNotFoundException, IOException {
	String ficheroElegido;
	Scanner leer = new Scanner(System.in);
	System.out.println(" dime el nombre para guardar el fichero");
	ficheroElegido = leer.next();
	GestionFicheroDat fichero = new GestionFicheroDat("alumnos.dat"); 
	fichero.abrirArchivo();
	fichero.insertarDatos(alumnos);
	fichero.cerrarArchivo();
	System.out.println(" archivo guardado correctamente");
}
}
