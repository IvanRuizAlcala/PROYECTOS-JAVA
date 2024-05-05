package Class;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

public interface GestionProducto {

	public Producto ConsultarProductoXcódigo(ArrayList<Producto> productos, String codigo);
	/**
	*Productos de los que se han vendido (suma) más de XXX unidades a lo largo de los años.
	*@param todos los produtos
	*@param unidades
	*@return arrayList de productos que coincidan con los parametros indicados
	**/
	public ArrayList<Producto> consultarProductosDependiendoDeLasUnidades(ArrayList<Producto> productos, int Unidades);
	/**
	 * Ventas de un año (de todos los productos). 
	 * @param productos
	 * @param anno
	 * @return Devuelve un arrayList con las unidades vendidas de cada producto en ese año.
	 */
	public ArrayList<Integer> ventaDeProductosXanno(ArrayList<Producto> productos, String anno);
	/**
	 * Generar fichero de texto con las ventas de un año (de todos los productos). Igual que el anterior pero generando un archivo de texto.
	 * @param productos
	 */
	
	public void guardarVentasEnFichero(ArrayList<Integer> unidadesProductos,String nombreArchivo) throws IOException;

	public ArrayList<Producto> crearProductos(ArrayList<String> totalProdutos);
}
