package ejercicio_6;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Congelados congelado = new Congelados (19,"hola",LocalDate.of(2024, 02, 24),21,20);
		congelado.mostrarProducto();
	}

}
