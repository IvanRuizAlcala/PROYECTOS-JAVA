package EJERCICIO3_STATICS;


	

	import java.time.LocalDate;

	public class alumnos {
			
			private String Nombre;
			private	static int contador;

			public alumnos(String nombre) {
				super();
				Nombre = nombre;
				contador++;
			}

			@Override
			public String toString() {
				return "alumnos [Nombre=" + Nombre + "]";
			}

			/**
			 * @return the nombre
			 */
			public String getNombre() {
				return Nombre;
			}

			/**
			 * @param nombre the nombre to set
			 */
			public void setNombre(String nombre) {
				Nombre = nombre;
			}

			public static int numeroAlumnosCreados() {
				return contador;
				
			}
	}

