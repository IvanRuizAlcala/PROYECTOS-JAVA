package EJERCICIO5_STATIC;

public class alumnos {
	private String nombre;
	private String apellidos;
	private static int nota1;
	private static int nota2;
	private int numeroDeExpediente;
	
	
	
	public alumnos(String nombre, String apellidos, int nota1, int nota2, int numeroDeExpediente) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.numeroDeExpediente=numeroDeExpediente;
		
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
	 * @return the nota1
	 */
	public static int getNota1() {
		return nota1;
	}
	/**
	 * @param nota1 the nota1 to set
	 */
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	/**
	 * @return the nota2
	 */
	public static int getNota2() {
		return nota2;
	}
	/**
	 * @param nota2 the nota2 to set
	 */
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	@Override
	public String toString() {
		return "alumnos [nombre=" + nombre + ", apellidos=" + apellidos + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}

		
	
	public void verAlumno(alumnos alumnovisualizado) {
		System.out.println(this.nombre +" "+ this.apellidos+" "+ this.nota1 + " " + this.nota2 + " ");
	}
}
