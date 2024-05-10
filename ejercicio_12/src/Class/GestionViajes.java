package Class;

import java.util.ArrayList;

public class GestionViajes {
ArrayList<String> misViajes = new ArrayList<>();

public GestionViajes(ArrayList<String> misViajes) {
	super();
	this.misViajes = misViajes;
}
public ArrayList<Viaje> cargarViajes(){
	ArrayList<Viaje> retornarViajes = new ArrayList<>();
	 String nombrePais = " ";
	 int id = 0;
	 Viaje viaje;
	 	for (int i = 0; i < misViajes.size(); i++) {
			nombrePais = misViajes.get(i);
			id++;
			viaje = new Viaje(id,nombrePais,nombrePais.length() );
			retornarViajes.add(viaje);
		}
	return retornarViajes;
	
}
}
