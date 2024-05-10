package Ejercicio_10;

import java.time.LocalDate;

public class Programa {
	String nombre;
	String version;
	String funcion;
	int añoDeLanzamiento;
	String EmpresaQueLoDesarrolla;
	String tipoDeLicencia;
	int precio;
	public Programa(String nombre, String version, String funcion, int añoDeLanzamiento,
			String empresaQueLoDesarrolla, String tipoDeLicencia, int precio) {
		super();
		this.nombre = nombre;
		this.version = version;
		this.funcion = funcion;
		this.añoDeLanzamiento = añoDeLanzamiento;
		EmpresaQueLoDesarrolla = empresaQueLoDesarrolla;
		this.tipoDeLicencia = tipoDeLicencia;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Programa [nombre=" + nombre + ", version=" + version + ", funcion=" + funcion + ", añoDeLanzamiento="
				+ añoDeLanzamiento + ", EmpresaQueLoDesarrolla=" + EmpresaQueLoDesarrolla + ", tipoDeLicencia="
				+ tipoDeLicencia + ", precio=" + precio + "]";
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
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * @return the funcion
	 */
	public String getFuncion() {
		return funcion;
	}
	/**
	 * @param funcion the funcion to set
	 */
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	/**
	 * @return the añoDeLanzamiento
	 */
	public int getAñoDeLanzamiento() {
		return añoDeLanzamiento;
	}
	/**
	 * @param añoDeLanzamiento the añoDeLanzamiento to set
	 */
	public void setAñoDeLanzamiento(int añoDeLanzamiento) {
		this.añoDeLanzamiento = añoDeLanzamiento;
	}
	/**
	 * @return the empresaQueLoDesarrolla
	 */
	public String getEmpresaQueLoDesarrolla() {
		return EmpresaQueLoDesarrolla;
	}
	/**
	 * @param empresaQueLoDesarrolla the empresaQueLoDesarrolla to set
	 */
	public void setEmpresaQueLoDesarrolla(String empresaQueLoDesarrolla) {
		EmpresaQueLoDesarrolla = empresaQueLoDesarrolla;
	}
	/**
	 * @return the tipoDeLicencia
	 */
	public String getTipoDeLicencia() {
		return tipoDeLicencia;
	}
	/**
	 * @param tipoDeLicencia the tipoDeLicencia to set
	 */
	public void setTipoDeLicencia(String tipoDeLicencia) {
		this.tipoDeLicencia = tipoDeLicencia;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
