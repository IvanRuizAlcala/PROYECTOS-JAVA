package EMPRESA_TAXIS;

public class taxis {
		private String matricula =" ";
		private String distrito =" ";
		private String motor =" ";
		private double latitud=0;
		private double longitud=0;
		/**
		 * @return the matricula
		 */
		public String getMatricula() {
			return matricula;
		}
		public taxis(String matricula, String distrito, String motor, double latitud, double longitud) {
			super();
			this.matricula = matricula;
			this.distrito = distrito;
			this.motor = motor;
			this.latitud = latitud;
			this.longitud = longitud;
		}
		public taxis(String matricula, String distrito, String motor) {
			super();
			this.matricula = matricula;
			this.distrito = distrito;
			this.motor = motor;
		
		}
		@Override
		public String toString() {
			return "taxis [matricula=" + matricula + ", distrito=" + distrito + ", motor=" + motor + ", latitud="
					+ latitud + ", longitud=" + longitud + "]";
		}
		/**
		 * @param matricula the matricula to set
		 */
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		/**
		 * @return the distrito
		 */
		public String getDistrito() {
			return distrito;
		}
		/**
		 * @param distrito the distrito to set
		 */
		public void setDistrito(String distrito) {
			this.distrito = distrito;
		}
		/**
		 * @return the motor
		 */
		public String getMotor() {
			return motor;
		}
		/**
		 * @param motor the motor to set
		 */
		public void setMotor(String motor) {
			this.motor = motor;
		}
		/**
		 * @return the latitud
		 */
		public double getLatitud() {
			return latitud;
		}
		/**
		 * @param latitud the latitud to set
		 */
		public void setLatitud(double latitud) {
			this.latitud = latitud;
		}
		/**
		 * @return the longitud
		 */
		public double getLongitud() {
			return longitud;
		}
		/**
		 * @param longitud the longitud to set
		 */
		public void setLongitud(double longitud) {
			this.longitud = longitud;
		}
		public boolean setComprobarCoordenadas(taxis taxi1, taxis taxi2) {
			if (taxi1.distrito.equals(taxi2.distrito)) {
				return true;
			}
				else {
					return false;
				}
		}
		public String Coordenadas() {
			str
		}
		
}
