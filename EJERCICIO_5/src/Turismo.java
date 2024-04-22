
public class Turismo extends Vehiculo {
private int puertas;
private boolean automatico;
public Turismo(String matricula, String marca, String modelo, double tarifa, boolean disponible, int puertas,
		boolean automatico) {
	super(matricula, marca, modelo, tarifa, disponible);
	this.puertas = puertas;
	this.automatico = automatico;
}
/**
 * @return the puertas
 */
public int getPuertas() {
	return puertas;
}
/**
 * @param puertas the puertas to set
 */
public void setPuertas(int puertas) {
	this.puertas = puertas;
}
/**
 * @return the automatico
 */
public boolean isAutomatico() {
	return automatico;
}
/**
 * @param automatico the automatico to set
 */
public void setAutomatico(boolean automatico) {
	this.automatico = automatico;
}
@Override
public String toString() {
	return "Turismo [puertas=" + puertas + ", automatico=" + automatico + "]";
}

}
