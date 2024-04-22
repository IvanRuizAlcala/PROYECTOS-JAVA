package Ejercicio2;

public class empleados {
	private int id;
	private String nombre;
	private String apellidos;
	private double salario;

public empleados(int id, String nombre, String apellidos, double salario) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.salario = salario;
}

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
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
 * @return the apellidos
 */
public String getApellidos() {
	return apellidos;
}

/**
 * @param apellidos the apellidos to set
 */
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

/**
 * @return the salario
 */
public double getSalario() {
	return salario;
}

/**
 * @param salario the salario to set
 */
public void setSalario(double salario) {
	this.salario = salario;
}

public String getNombreCompleto() {
	String NombreCompleto = apellidos + ","+ nombre;
	return NombreCompleto;
}
public double getSalarioAnual ( double salario) {
	double salarioAnual;
	int meses=12;
	salarioAnual= salario* meses;
	return salarioAnual;
}
public void incrementaSalario(int porcentaje) {
	salario = salario + porcentaje;
}

@Override
public String toString() {
	return "empleados [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";
}

}
