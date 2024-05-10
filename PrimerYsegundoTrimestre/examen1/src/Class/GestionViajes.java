package Class;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionViajes {
ArrayList<Viajes> misViajes = new ArrayList();

public void crearViaje() {
	ArrayList<personas> ocupantes = new ArrayList();
	personas conductor = new conductor("ivan","ruiz","alcala",4);
	pasajero pasajero = new pasajero("david","r","r",27);
	pasajero pasajero1 = new pasajero("david","i","i",37);
	coches coches = new coches("2489HLZ","seat","cordoba");
	ocupantes.add(conductor);
	ocupantes.add(pasajero);
	ocupantes.add(pasajero1);
	Viajes viaje = new Viajes(coches,ocupantes);
	misViajes.add(viaje);
	System.out.println(" el viaje se ha creado correctamente");
}
public void visualizar() {
	for (Viajes viajes : misViajes) {
		System.out.println(viajes);
		System.out.println(" ");
	}
}
}
