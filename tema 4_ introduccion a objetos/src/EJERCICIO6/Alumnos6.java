package EJERCICIO6;
public class Alumnos6 {
	
		private String nombre;
		private String apellidos;
		private int nota1;
		private int nota2;
		private int numeroDeExpediente;
	
		
		public Alumnos6(String nombre, String apellidos, int nota1, int nota2, int numeroDeExpediente) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.numeroDeExpediente = numeroDeExpediente;
			
			
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
		public int getNota1() {
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
		public int getNota2() {
			return nota2;
		}

		/**
		 * @param nota2 the nota2 to set
		 */
		public void setNota2(int nota2) {
			this.nota2 = nota2;
		}

		/**
		 * @return the numeroDeExpediente
		 */
		public int getNumeroDeExpediente() {
			return numeroDeExpediente;
		}

		/**
		 * @param numeroDeExpediente the numeroDeExpediente to set
		 */
		public void setNumeroDeExpediente(int numeroDeExpediente) {
			this.numeroDeExpediente = numeroDeExpediente;
		}
		public int notaMedia6() {
			return (nota1+nota2)/2;
			
		}

		
		

		@Override
		public String toString() {
			return "Alumnos6 [nombre=" + nombre + ", apellidos=" + apellidos + ", nota1=" + nota1 + ", nota2=" + nota2
					+ ", numeroDeExpediente=" + numeroDeExpediente + "]";
		}
	
}
	

