package Class;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class crearArchivo {
	private String archivo;

	public crearArchivo(String archivo) {
		super();
		this.archivo = archivo;
	}

public String crear(GestionVehiculos misVehiculos) throws IOException,FileNotFoundException {
	ObjectOutputStream fsalida=null;

	 fsalida = new ObjectOutputStream(new FileOutputStream(archivo));
	 for (Vehiculos vehi : misVehiculos) {
		 fsalida.writeObject(vehi);
	 	}	
	
	fsalida.close();
	if(fsalida!=null) {
			fsalida.close();
}
return "Fichero creado";
}
}