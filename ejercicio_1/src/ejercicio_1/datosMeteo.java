package ejercicio_1;

import java.time.LocalDate;

public class datosMeteo {
	private LocalDate fecha;
	private double temperaturaMinima;
	private double temperaturaMaxima;
	private double humedadMaxima;
	private double humedadMinima;
	private double precipitaciones;
	public datosMeteo(LocalDate fecha, double temperaturaMinima, double temperaturaMaxima, double humedadMaxima,
			double humedadMinima, double precipitaciones) {
		super();
		this.fecha = fecha;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
		this.humedadMaxima = humedadMaxima;
		this.humedadMinima = humedadMinima;
		this.precipitaciones = precipitaciones;
	}
	public datosMeteo(double temperaturaMinima, double temperaturaMaxima, double humedadMaxima, double humedadMinima,
			double precipitaciones) {
		super();
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
		this.humedadMaxima = humedadMaxima;
		this.humedadMinima = humedadMinima;
		this.precipitaciones = precipitaciones;
	}
	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the temperaturaMinima
	 */
	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}
	/**
	 * @param temperaturaMinima the temperaturaMinima to set
	 */
	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	/**
	 * @return the temperaturaMaxima
	 */
	public double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	/**
	 * @param temperaturaMaxima the temperaturaMaxima to set
	 */
	public void setTemperaturaMaxima(double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	/**
	 * @return the humedadMaxima
	 */
	public double getHumedadMaxima() {
		return humedadMaxima;
	}
	/**
	 * @param humedadMaxima the humedadMaxima to set
	 */
	public void setHumedadMaxima(double humedadMaxima) {
		this.humedadMaxima = humedadMaxima;
	}
	/**
	 * @return the humedadMinima
	 */
	public double getHumedadMinima() {
		return humedadMinima;
	}
	/**
	 * @param humedadMinima the humedadMinima to set
	 */
	public void setHumedadMinima(double humedadMinima) {
		this.humedadMinima = humedadMinima;
	}
	/**
	 * @return the precipitaciones
	 */
	public double getPrecipitaciones() {
		return precipitaciones;
	}
	/**
	 * @param precipitaciones the precipitaciones to set
	 */
	public void setPrecipitaciones(double precipitaciones) {
		this.precipitaciones = precipitaciones;
	}
	@Override
	public String toString() {
		return "datosMeteo [fecha=" + fecha + ", temperaturaMinima=" + temperaturaMinima + ", temperaturaMaxima="
				+ temperaturaMaxima + ", humedadMaxima=" + humedadMaxima + ", humedadMinima=" + humedadMinima
				+ ", precipitaciones=" + precipitaciones + "]";
	}
	

}
