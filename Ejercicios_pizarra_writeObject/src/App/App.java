package App;

import java.io.IOException;
import java.util.ArrayList;

import Class.GestionVehiculos;
import Class.Vehiculos;
import Class.crearArchivo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionVehiculos misVehiculos = null;
		Vehiculos vehiculo1 = new Vehiculos("1111MNM","seat","leon");
		Vehiculos vehiculo2 = new Vehiculos("2222MNM","ford","focus");
		Vehiculos vehiculo3 = new Vehiculos("3333MNM","bmw","530");
		Vehiculos vehiculo4 = new Vehiculos("4444MNM","audi","a6");
		misVehiculos.add(vehiculo1);
		misVehiculos.add(vehiculo2);
		misVehiculos.add(vehiculo3);
		misVehiculos.add(vehiculo1);
	
		crearArchivo crear = new crearArchivo("vehiculo.dat");
		try {
			String retorno = crear.crear(misVehiculos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
