import java.sql.Array;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turismo turismo1 = new Turismo("0595HB", "ford", "mondeo", 350, true, 5, false);
		Furgoneta furgoneta1 = new Furgoneta("0869DKH", "renault", "kangoo", 100, false, 1500, 3500);
		Vehiculo [] misvehiculos = new Vehiculo[10];
		misvehiculos[0] = turismo1;
		misvehiculos[1] = furgoneta1;
		int i=0;
		for(Vehiculo num: misvehiculos) {
			System.out.println();
			i++;
		}
		System.out.println(vehiculo.turismo1);
	}

}
