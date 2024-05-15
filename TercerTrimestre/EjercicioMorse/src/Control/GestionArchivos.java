package Control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestionArchivos {
	static BufferedReader bufferEntrada;
	
	
public static List<String> leerDesdeArchivoDeTexto(String nombreArchivo) throws IOException,FileNotFoundException {
	
	List<String>ArchivoCompleto = new ArrayList<>();
	Path ruta = Paths.get(System.getProperty("user.home"),"Desktop", "Modulo", "PROYECTOS JAVA","TercerTrimestre", "archivosTXT",nombreArchivo);
	File file = ruta.toFile();
	bufferEntrada = new BufferedReader(new FileReader(file));
	System.out.println(" archivo abierto");
	System.out.println(" archivo cargado");
	while(bufferEntrada!=null) {
	ArchivoCompleto.add(bufferEntrada.readLine());
	}
	bufferEntrada.close();
	return ArchivoCompleto;
}
public static void escribirEnArchivo(List<String>archivoCompleto,String nombreArchivoAguardar) throws IOException {
	BufferedWriter escribirArchivo = new BufferedWriter(new FileWriter(new File(nombreArchivoAguardar)));
	for (int i = 0; i < archivoCompleto.size() ; i++) {
		escribirArchivo.write(archivoCompleto.get(i));
	}
	escribirArchivo.close();
}
}
