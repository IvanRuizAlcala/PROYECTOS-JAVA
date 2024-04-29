package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestionFicheroDat {
	private String nombreArchivo;
	private FileOutputStream fileOut;
	public GestionFicheroDat(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}
	public void abrirArchivo() throws FileNotFoundException, IOException {
		fileOut = new FileOutputStream(nombreArchivo);
		System.out.println(" archivo abierto");
	}

	public void insertarDatos(ArrayList<Alumno> alumnos) throws IOException {
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		objectOut.writeObject(alumnos);
		objectOut.close();
		System.out.println(" datos insertados");
	}

	public void cerrarArchivo() throws FileNotFoundException, IOException {
		fileOut.close();
		System.out.println(" archivo cerrado");
		
	}

}


