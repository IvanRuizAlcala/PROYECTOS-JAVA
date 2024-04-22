package Class;

public class copiloto extends personas {
	String poblacion;


	public copiloto(String nombre, String primerApellido, String segundoApellido, String poblacion) {
		super(nombre, primerApellido, segundoApellido);
		this.poblacion = poblacion;
	}

	

	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}



	@Override
	public String toString() {
		return super.toString()+"copiloto [poblacion=" + poblacion + "]";
	}
	
}
