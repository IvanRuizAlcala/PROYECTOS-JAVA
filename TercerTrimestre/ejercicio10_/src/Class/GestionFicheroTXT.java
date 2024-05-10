package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class GestionFicheroTXT {
	String nombreArchivo;
	BufferedReader bufferEntrada;


	public GestionFicheroTXT(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}

	public void abrirArchivo() throws FileNotFoundException, IOException {
		bufferEntrada = new BufferedReader(new FileReader(nombreArchivo));
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

	public void cerrarArchivo() throws FileNotFoundException, IOException {
		bufferEntrada.close();
		System.out.println(" archivo cerrado");
		
	}

}
