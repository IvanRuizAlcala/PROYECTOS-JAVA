package Class;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class GestionProductos implements GestionProducto {
ArrayList<Producto> productos;
Producto producto;
String prueba;

	@Override
	public ArrayList<Producto> crearProductos(ArrayList<String> totalProductos) {
    ArrayList<Producto> productos = new ArrayList<>();
    for (int i = 0; i < totalProductos.size(); i++) {
        String[] separarProductos = totalProductos.get(i).split(";");
        Producto producto = new Producto(separarProductos);
        productos.add(producto);
    }
    return productos;
}
	@Override
	public Producto ConsultarProductoXcódigo(ArrayList<Producto> productos, String codigo) {
		Producto aux = null;
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getCodigo().equals(codigo)) {
				aux = productos.get(i);
			}
		}
		return aux;
	}
	
	@Override
	public ArrayList<Producto> ventaDeProductosXanno(ArrayList<Producto> productos, String anno) {
		ArrayList<Producto>aux = new ArrayList<>();
		
			for (int i = 0; i < productos.size(); i++) {
				if(productos.get(i).getUnidadesByAnio(anno)!=null) {
					aux.add(productos.get(i));
				}
			}
		return aux;
	}

	@Override
	public ArrayList<Producto> consultarProductosDependiendoDeLasUnidades(ArrayList<Producto> productos, int Unidades) {
		ArrayList<Producto>aux = new ArrayList<>();
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getSumaUnidadesVendidas()>=Unidades) {
				aux.add(productos.get(i));
			}
		}
		return aux;
	}

	@Override
	public void guardarVentasEnFichero(ArrayList<Producto> productos) {

	}
}
