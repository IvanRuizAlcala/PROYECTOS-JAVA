
public class Cliente {
String Dni;
String Nombre;
int Telefono;
public Cliente(String dni, String nombre, int telefono) {
	super();
	Dni = dni;
	Nombre = nombre;
	Telefono = telefono;
}
/**
 * @return the dni
 */
public String getDni() {
	return Dni;
}
/**
 * @param dni the dni to set
 */
public void setDni(String dni) {
	Dni = dni;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return Nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	Nombre = nombre;
}
/**
 * @return the telefono
 */
public int getTelefono() {
	return Telefono;
}
/**
 * @param telefono the telefono to set
 */
public void setTelefono(int telefono) {
	Telefono = telefono;
}
@Override
public String toString() {
	return "Cliente [Dni=" + Dni + ", Nombre=" + Nombre + ", Telefono=" + Telefono + "]";
}
}
