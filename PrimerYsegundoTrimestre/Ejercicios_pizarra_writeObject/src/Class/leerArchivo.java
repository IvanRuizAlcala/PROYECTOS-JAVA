package Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class leerArchivo {
private String archivo;

public leerArchivo(String archivo) {
	super();
	this.archivo = archivo;
	
}
public String leer() throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream fEntrada=null;
	
	fEntrada = new ObjectInputStream(new FileInputStream(archivo));
	Vehiculos vehiculo;
	while((vehiculo=(Vehiculos)fEntrada.readObject())!= null){
		System.out.println("vehiculo: " + vehiculo);
	}
	return "fichero leido";
	
	
}

}
