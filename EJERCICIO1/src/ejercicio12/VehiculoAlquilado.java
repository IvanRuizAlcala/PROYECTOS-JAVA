package ejercicio12;

import java.time.LocalDate;

public class VehiculoAlquilado {
	private Vehiculo vehiculo;
	private Cliente cliente;
	private LocalDate fechaDeAlquiler;
	private int diasDeAlquiler;
	public VehiculoAlquilado(Vehiculo vehiculo, Cliente cliente, LocalDate fechaDeAlquiler, int diasDeAlquiler) {
		super();
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.fechaDeAlquiler = fechaDeAlquiler;
		this.diasDeAlquiler = diasDeAlquiler;
	}
	/**
	 * @return the vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the fechaDeAlquiler
	 */
	public LocalDate getFechaDeAlquiler() {
		return fechaDeAlquiler;
	}
	/**
	 * @param fechaDeAlquiler the fechaDeAlquiler to set
	 */
	public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
		this.fechaDeAlquiler = fechaDeAlquiler;
	}
	/**
	 * @return the diasDeAlquiler
	 */
	public int getDiasDeAlquiler() {
		return diasDeAlquiler;
	}
	/**
	 * @param diasDeAlquiler the diasDeAlquiler to set
	 */
	public void setDiasDeAlquiler(int diasDeAlquiler) {
		this.diasDeAlquiler = diasDeAlquiler;
	}
	@Override
	public String toString() {
		return "VehiculoAlquilado [vehiculo=" + vehiculo + ", cliente=" + cliente + ", fechaDeAlquiler="
				+ fechaDeAlquiler + ", diasDeAlquiler=" + diasDeAlquiler + "]";
	}
	public double getImporteTotal(int diasAlquilerElegidoUsuario) {
		double importeTotal=0;
			importeTotal=diasAlquilerElegidoUsuario * vehiculo.getTarifa();
			return importeTotal;
		
	}
}
