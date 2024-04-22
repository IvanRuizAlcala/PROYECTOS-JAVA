public class Cliente {
	// propiedades
	private String dNICliente;
	private String nombre;

	// Getters and Setters
	public String getdNICliente() {
		return dNICliente;
	}

	public void setdNICliente(String dNICliente) {
		this.dNICliente = dNICliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// metodos
	public Cliente(String dniCliente, String nombre) {
		// TODO Auto-generated constructor stub
		setdNICliente(dniCliente);
		setNombre(nombre);
	}

}
