
public class Furgoneta extends Vehiculo {
	private int capacidadEnLitros;
	private int cargaMaxima;
	public Furgoneta(String matricula, String marca, String modelo, double tarifa, boolean disponible,
			int capacidadEnLitros, int cargaMaxima) {
		super(matricula, marca, modelo, tarifa, disponible);
		this.capacidadEnLitros = capacidadEnLitros;
		this.cargaMaxima = cargaMaxima;
	}
	/**
	 * @return the capacidadEnLitros
	 */
	public int getCapacidadEnLitros() {
		return capacidadEnLitros;
	}
	/**
	 * @param capacidadEnLitros the capacidadEnLitros to set
	 */
	public void setCapacidadEnLitros(int capacidadEnLitros) {
		this.capacidadEnLitros = capacidadEnLitros;
	}
	/**
	 * @return the cargaMaxima
	 */
	public int getCargaMaxima() {
		return cargaMaxima;
	}
	/**
	 * @param cargaMaxima the cargaMaxima to set
	 */
	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	@Override
	public String toString() {
		return "Furgoneta [capacidadEnLitros=" + capacidadEnLitros + ", cargaMaxima=" + cargaMaxima + "]";
	}
	

}
