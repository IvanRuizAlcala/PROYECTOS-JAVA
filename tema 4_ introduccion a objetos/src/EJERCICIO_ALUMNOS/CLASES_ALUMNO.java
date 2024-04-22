package EJERCICIO_ALUMNOS;

import java.time.LocalDate;

public class CLASES_ALUMNO {
		private int Numero_de_expendiente= 0;
		private String Nombre;
		private String Apellidos;
		private LocalDate fechaNac;
		private String curso;
		
	
		
		public CLASES_ALUMNO(int numero_de_expendiente, String nombre, String apellidos, LocalDate fechaNac,
				String curso) {
			super();
			Numero_de_expendiente = numero_de_expendiente;
			Nombre = nombre;
			Apellidos = apellidos;
			this.fechaNac = fechaNac;
			this.curso = curso;
		}

		/**
		 * @return the numero_de_expendiente
		 */
		public int getNumero_de_expendiente() {
			return Numero_de_expendiente;
		}

		/**
		 * @param numero_de_expendiente the numero_de_expendiente to set
		 */
		public void setNumero_de_expendiente(int numero_de_expendiente) {
			Numero_de_expendiente = numero_de_expendiente;
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



		/**
		 * @return the apellidos
		 */
		public String getApellidos() {
			return Apellidos;
		}



		/**
		 * @param apellidos the apellidos to set
		 */
		public void setApellidos(String apellidos) {
			Apellidos = apellidos;
		}



		/**
		 * @return the fechaNac
		 */
		public LocalDate getFechaNac() {
			return fechaNac;
		}



		/**
		 * @param fechaNac the fechaNac to set
		 */
		public void setFechaNac(LocalDate fechaNac) {
			this.fechaNac = fechaNac;
		}



		/**
		 * @return the curso
		 */
		public String getCurso() {
			return curso;
		}



		/**
		 * @param curso the curso to set
		 */
		public void setCurso(String curso) {
			this.curso = curso;
		}



		@Override
		public String toString() {
			return "CLASES_ALUMNO [Numero_de_expendiente=" + Numero_de_expendiente + ", Nombre=" + Nombre
					+ ", Apellidos=" + Apellidos + ", fechaNac=" + fechaNac + ", curso=" + curso + "]";
		}
}
