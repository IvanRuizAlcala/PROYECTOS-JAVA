
public class Persona {
	private String Nombre= " ";
	private String Apellidos= " ";
	private int edad;
	
public Persona(String nombre, String apellidos, int edad) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		this.edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", edad=" + edad + "]";
	}
	
}	
		