package Class;

import java.util.ArrayList;

public interface GestionProductosInterface {
	/**
	 * El producto podrá ser congelado, refrigerado o fresco.
 		eliminar producto. Localizar mediante su ID. Devolver true/false según se haya
		podido eliminar o no.
	 * @return true o false
	 */
	public void nuevoProducto();
	
	/**
	 * devolver productos
	 * @param id
	 * @return Devolver todo el ArrayList
	 */
	public boolean eliminarProducto(int id);
	
	/**
	 * 
	 * @param producto
	 * @return todo el arraylist
	 */
	public ArrayList<Productos> devolverArray();
	
	/**
	 * Filtrar según tipo de producto (congelado,
		fresco o refrigerado)
	 * @return Devolver un ArrayList con los productos del tipo
				seleccionado.
	 */
	public ArrayList<Productos> devolverProductosPorTipo(String tipo);
	
	/**
	 * - eliminar todos los productos congelados
	 * @return Retornar el número de productos
		eliminados
	 */
	public int eliminarProductosCongelados();
	
	/**
	 * visualizar arraylist
	 */
	public void visualizarArray();
}
