package Class;

public class coches {
 String matricula;
 String marca;
 String modelo;
public coches(String matricula, String marca, String modelo) {
	super();
	this.matricula = matricula;
	this.marca = marca;
	this.modelo = modelo;
}
/**
 * @return the matricula
 */
public String getMatricula() {
	return matricula;
}
/**
 * @param matricula the matricula to set
 */
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
/**
 * @return the marca
 */
public String getMarca() {
	return marca;
}
/**
 * @param marca the marca to set
 */
public void setMarca(String marca) {
	this.marca = marca;
}
/**
 * @return the modelo
 */
public String getModelo() {
	return modelo;
}
/**
 * @param modelo the modelo to set
 */
public void setModelo(String modelo) {
	this.modelo = modelo;
}
@Override
public String toString() {
	return "coches [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
}
 
}
