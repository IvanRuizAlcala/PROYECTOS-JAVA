import java.util.Arrays;
import java.util.Random;

public class GestionProducto {
	private producto misproductos[] = new producto[3];
	int contador = 0;

	public GestionProducto() {
		

		for (contador = 0; contador < misproductos.length; contador++) {
			Random random = new Random();
			int aleatorio = random.nextInt(100);
			int aleatorio2 = random.nextInt(100);
			int productoAleatorio = random.nextInt(10);
			int codigo = 0;
			String[] nombre = { "Smartphone","televisor","calzado"};
			String[] tipo = { "Dispositivo electrónico.", "Electrodoméstico.", "Calzado.", "Electrodoméstico.",
					"Dispositivo de audio.", "Electrodoméstico.", "Producto de cuidado personal.", "Accesorio.",
					"Electrodoméstico.", "Dispositivo electrónico." };
			double precioVenta = aleatorio;
			double precioCompra = aleatorio2;
			int unidadesDisponibles = aleatorio;
			codigo=contador;
			producto productos = new producto(codigo, nombre[contador], tipo[productoAleatorio], precioVenta,
					precioCompra, unidadesDisponibles);
			misproductos[contador]=productos;
		
		}
		}
	public void filtrarPorPrecioVenta(int precioVentaElegidoPorUsuario) {
		int contadorFiltrar=0;
		for (contadorFiltrar=0;contadorFiltrar<contador;contadorFiltrar++) {
			if(misproductos[contadorFiltrar].getPrecioVenta()==precioVentaElegidoPorUsuario) {
				System.out.println(misproductos[contadorFiltrar]);
			}
		}
	}
	public void filtrarPorTipo(String tipoElegidoPorUsuario) {
		int contadorFiltrarPorTipo=0;
		for (contadorFiltrarPorTipo=0;contadorFiltrarPorTipo<contador;contadorFiltrarPorTipo++) {
			if(misproductos[contadorFiltrarPorTipo].getTipo().equals(tipoElegidoPorUsuario)) {
				System.out.println(misproductos[contadorFiltrarPorTipo]);
			}
		}
		
	}
	public void mostrarDiferencia() {
		int contadordiferencia=0;
		double diferencia=0;
		for (contadordiferencia=0;contadordiferencia<contador;contadordiferencia++) {
			diferencia = misproductos[contadordiferencia].getPrecioCompra()-misproductos[contadordiferencia].getPrecioVenta();
			System.out.println(misproductos[contadordiferencia].getNombre()+" "+ misproductos[contadordiferencia].getPrecioCompra()+" "+ 
			misproductos[contadordiferencia].getPrecioVenta() + " " + "la diferencia es " +diferencia);
			
			
			}
		}
			
	public void mostrarProductoPosicion(int codigo) {
		System.out.println(misproductos[codigo]);
	}
	
	public boolean cambiarPor(String productoElegidoPorUsuario, int posicionElegidaPorUsuario) {
		int contadorCambiarPor=0;
		producto productoGuardado = null;
		for (contadorCambiarPor=0;contadorCambiarPor<contador;contadorCambiarPor++) {
			
		if(misproductos[contadorCambiarPor].getNombre().equals(productoElegidoPorUsuario)) {
			productoGuardado = misproductos[contadorCambiarPor];
		}
		}
		
		for (contadorCambiarPor=0;contadorCambiarPor<contador;contadorCambiarPor++) {
			
			if(posicionElegidaPorUsuario==contadorCambiarPor) {
				misproductos[contadorCambiarPor]=productoGuardado;
				return true;
			}	
		}
			
		return false;
	}
	public void verArray() {
		int contadorVerArray=0;
		for(contadorVerArray=0; contadorVerArray<contador;contadorVerArray++) {
			System.out.println(misproductos[contadorVerArray]);
	}
}
	}
		
	


