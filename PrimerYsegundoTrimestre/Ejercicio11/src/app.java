
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionProducto misProductos = new GestionProducto();
		System.out.println(" mostrar diferencia");
		misProductos.mostrarDiferencia();
		System.out.println(" ");
		misProductos.filtrarPorPrecioVenta(075);
		System.out.println(" ");
		System.out.println(" filtrar por tipo");
		misProductos.filtrarPorTipo("Electrodoméstico.");
		System.out.println(" ");
		System.out.println(" mostrar producto introduciendo posicion");
		misProductos.mostrarProductoPosicion(1);
		System.out.println(" ");
		System.out.println(" ver array");
		misProductos.verArray();
		System.out.println(" ver cambiar producto");
		System.out.println(misProductos.cambiarPor("televisor",2));
		System.out.println(" mostrar array cambiada");
		misProductos.verArray();
	}

}
