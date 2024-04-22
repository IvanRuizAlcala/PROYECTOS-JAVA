import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		Scanner leer =new Scanner(System.in);
		int cantidadElegidaPorUsuario = 0;
		CuentaBancaria cuentaElegidaPorUsuario;
		Cliente cliente1 = new Cliente("455559223H", "Ivan", 672283229);
		Cliente cliente2 = new Cliente("400000000S", "Dario", 613454545);
		Cliente cliente3 = new Cliente("300000000S", "Noa", 600303030);
		CuentaBancaria cuenta1 = new CuentaBancaria(cliente1, 500, "0101" );
		CuentaBancaria cuenta2 = new CuentaBancaria(cliente2, 1000, "0102" );
		CuentaBancaria cuenta3 = new CuentaBancaria(cliente3, 0, "0103" );
		//ALGORITMO
		System.out.println(" dime una cantidad a depositar y la cuenta");
		
		cuenta1.depositar(500);
		System.out.println(cuenta1);
		System.out.println(cuenta1.transferencia(150, cuenta2));
		System.out.println(cuenta2);
		
	}

}
