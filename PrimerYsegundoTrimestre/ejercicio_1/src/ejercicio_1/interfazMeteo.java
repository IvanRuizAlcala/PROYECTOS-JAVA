package ejercicio_1;

public interface interfazMeteo {

		/*
		 * Recibe un objeto de la clase datosMeteo y lo añade al arraylist
		 */
		public void anadirDatos() ;
		
		/*
		 * devuelve un double
		 */
		public double mediaTempMax();
		
		/*
		 * Media de las máximas de un mes y año pasados como parametros(enteros).devuelve double
		 */
		public double mediaTempMax(int anno, int mes);
		
		/*
		 * Devuelve el numero de elementos del arraylist
		 */
		public Object numeroRegistros();
}
