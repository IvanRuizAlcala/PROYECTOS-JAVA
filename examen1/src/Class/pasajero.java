package Class;

public class pasajero extends personas {
int edad;

public pasajero(String nombre, String primerApellido, String segundoApellido, int edad) {
	super(nombre, primerApellido, segundoApellido);
	this.edad = edad;
}

/**
 * @return the edad
 */
public int getEdad() {
	return edad;
}

/**
 * @param edad the edad to set
 */
public void setEdad(int edad) {
	this.edad = edad;
}

@Override
public String toString() {
	return super.toString()+ "pasajero [edad=" + edad + "]";
}

}
