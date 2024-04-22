package Class;

import java.util.ArrayList;

public class Viajes {
	coches coche;
	ArrayList <personas> ocupantes;
	
	public Viajes(coches coche, ArrayList<personas> ocupantes) {
		super();
		this.coche = coche;
		this.ocupantes = ocupantes;
	}

	/**
	 * @return the coche
	 */
	public coches getCoche() {
		return coche;
	}

	/**
	 * @param coche the coche to set
	 */
	public void setCoche(coches coche) {
		this.coche = coche;
	}

	/**
	 * @return the ocupantes
	 */
	public ArrayList<personas> getOcupantes() {
		return ocupantes;
	}

	/**
	 * @param ocupantes the ocupantes to set
	 */
	public void setOcupantes(ArrayList<personas> ocupantes) {
		this.ocupantes = ocupantes;
	}


	@Override
	public String toString() {
		return "Viajes [coche=" + coche + ", ocupantes=" + ocupantes + "]";
	}

	public void remove(Viajes viaje) {
		
		
	}
	
}
