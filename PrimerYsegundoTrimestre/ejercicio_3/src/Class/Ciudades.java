package Class;

import java.util.Objects;

public class Ciudades {
 private String nombre;
 private String pais;
 private int habitantes;
public Ciudades(String nombre, String pais, int habitantes) {
	super();
	this.nombre = nombre;
	this.pais = pais;
	this.habitantes = habitantes;
}
@Override
public String toString() {
	return "Ciudades [nombre=" + nombre + ", pais=" + pais + ", habitantes=" + habitantes + "]";
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the pais
 */
public String getPais() {
	return pais;
}
/**
 * @param pais the pais to set
 */
public void setPais(String pais) {
	this.pais = pais;
}
/**
 * @return the habitantes
 */
public int getHabitantes() {
	return habitantes;
}
/**
 * @param habitantes the habitantes to set
 */
public void setHabitantes(int habitantes) {
	this.habitantes = habitantes;
}
@Override
public int hashCode() {
	return Objects.hash(habitantes, nombre, pais);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ciudades other = (Ciudades) obj;
	return habitantes == other.habitantes && Objects.equals(nombre, other.nombre) && Objects.equals(pais, other.pais);
}
 
}
