package ejercicio12;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("45559223H", "ivan", "ruiz", "600000000");
		Vehiculo vehiculo1 = new Vehiculo("4538-dnw", "ford", "kuga", 25, true);
		VehiculoAlquilado alquiler1 = new VehiculoAlquilado(vehiculo1, cliente1,LocalDate.now(), 0);
		
		System.out.println(alquiler1.getImporteTotal(25));
	}

}
