package ejemplosPath;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path ruta = Paths.get(System.getProperty("user.home"),"Desktop", "MODULO", "PROYECTOS JAVA" );
		if (Files.exists(ruta)) {
			System.out.println("contenido de la ruta : " + ruta.toAbsolutePath());
			System.out.println("*************************");
			try {
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(ruta);
				for (Path path : directoryStream) {
					if(Files.isDirectory(path)) {
						System.out.println(" Directorio: " + path); 
					}
						else {
							System.out.println(" Archivo: "+ path);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
	}
}
