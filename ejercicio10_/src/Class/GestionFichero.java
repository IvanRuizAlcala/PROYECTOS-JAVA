package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class GestionFichero {
	String nombreArchivo;
	BufferedReader bufferEntrada;
	ArrayList<Alumno> AlumnosCompletos = new ArrayList<>();

	public GestionFichero(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}

	public void abrirArchivo() throws FileNotFoundException, IOException {
		bufferEntrada = new BufferedReader(new FileReader("DatosAlumnos.txt"));
		System.out.println(" archivo abierto");
	}

	public ArrayList<String> insertarDatos() throws IOException {
		ArrayList<String> archivoCompleto = new ArrayList<>();
		String linea = " ";
		while ((linea = bufferEntrada.readLine()) != null) {
			archivoCompleto.add(linea);
		}
		System.out.println(" datos insertados");
		return archivoCompleto;
	}

	public void CrearAlumnos(ArrayList<String> archivoCompleto) {
		HashMap<String, ArrayList<String>> notas=new HashMap<String, ArrayList<String>>();
		String[] fraseGuardada;
		String id = null;
		String nombre;
		ArrayList<String> auxNotas = new ArrayList<>();
		for (int i = 0; i < archivoCompleto.size(); i++) {
			fraseGuardada = archivoCompleto.get(i).split(";");
			id = fraseGuardada[0];
			nombre =fraseGuardada[1];
		for (int j = 2; j < fraseGuardada.length; j++) {
			auxNotas.add(fraseGuardada[j]);
		}
		Alumno alumno = new Alumno(id, nombre, auxNotas);
			AlumnosCompletos.add(alumno);
			
		}
		/*
		if(notas.containsKey(keyUser)) {
			ArrayList<String> keyUserGuardado=new ArrayList<String>();
			keyUserGuardado = notas.get(keyUser);
			System.out.println(" El id de usuario es :" + keyUser);
			System.out.print("las notas son : ");
		for (String string : keyUserGuardado) {
			System.out.println(string);
		}
		}
		else {
			System.out.println(" el usuario no existe");
		}
		*/
	}

	public void cerrarArchivo() throws FileNotFoundException, IOException {
		bufferEntrada.close();
		System.out.println(" archivo cerrado");
		
	}

}
