package ejercicio_8;

public interface interfazCola {
	/*
	 * Devuelve true o false, según la estructura esté vacía o no
	 */
	public boolean estaVacia();
	
	/*
	 * Devuelve el primer elemento de la estructura. El que se guardó
en primer lugar.
	 */
	public Persona primero();
	
	/*
	 * Extrae el elemento correspondiente, lo devuelve y deja un
hueco para otro
	 */
	public void extraer();
	
	/*
	 * Inserta un objeto nuevo en la estructura si es posible. Devuelve
verdadero o falso según se pueda o no llevar a cabo.
	 */
	public boolean insertar();
	
	/*
	 *  Muestra el contenido de la cola
	 */
	public void mostrar();
	
	
	
}
