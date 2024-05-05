package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class openBBDD {
	String nombreArchivo;
	BufferedReader bufferEntrada;
	Path ruta;
	public openBBDD(String nombreArchivo) {
		super();
		this.nombreArchivo = nombreArchivo;
	}
	public void abrirArchivo() throws FileNotFoundException, IOException {
		Path ruta = Paths.get(System.getProperty("user.home"),"Desktop", "MODULO", "PROYECTOS JAVA", "archivosTXT",nombreArchivo);
		File file = ruta.toFile();
		bufferEntrada = new BufferedReader(new FileReader(file));
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
