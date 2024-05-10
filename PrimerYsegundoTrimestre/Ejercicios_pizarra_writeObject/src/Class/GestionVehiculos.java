package Class;

import java.util.ArrayList;

public class GestionVehiculos {
private ArrayList<Vehiculos> gestionVehiculos;

public GestionVehiculos(ArrayList<Vehiculos> gestionVehiculos) {
	super();
	this.gestionVehiculos = gestionVehiculos;
}

/**
 * @return the gestionVehiculos
 */
public ArrayList<Vehiculos> getGestionVehiculos() {
	return gestionVehiculos;
}

/**
 * @param gestionVehiculos the gestionVehiculos to set
 */
public void setGestionVehiculos(ArrayList<Vehiculos> gestionVehiculos) {
	this.gestionVehiculos = gestionVehiculos;
}

@Override
public String toString() {
	return "GestionVehiculos [gestionVehiculos=" + gestionVehiculos + "]";
}
public void add(Vehiculos vehiculo) {
	gestionVehiculos.add(vehiculo);
}

}
