package ejercicio12;

public class Vehiculo {
	
	private String matricula;
	private String marca; 
	private String modelo; 
	private double tarifa;
	private boolean disponible;
	public Vehiculo(String matricula, String marca, String modelo, double tarifa, boolean disponible) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tarifa = tarifa;
		this.disponible = disponible;
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
	/**
	 * @return the tarifa
	 */
	public double getTarifa() {
		return tarifa;
	}
	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	/**
	 * @return the disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}
	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", tarifa=" + tarifa
				+ ", disponible=" + disponible + "]";
	}
	
	}


