package Class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


public class GestionProductos implements GestionProductosInterface {
	ArrayList<Productos> gestionarProductos = new ArrayList<>();
	int id = 0;

	@Override
	public void nuevoProducto() {
		int opcion=0;
		String descripcion;
		LocalDate fechaDeCaducidad = LocalDate.of(2025, 01, 21);
		LocalDate fechaDeEnvasado = LocalDate.now();
		Random aleatorio = new Random();
		int numeroDeLote = aleatorio.nextInt(100);
		Scanner leer = new Scanner(System.in);
		System.out.println(" vamos a crear un nuevo producto");
		System.out.println(" dime el tipo de producto");
		System.out.println(" pulsa 1 para un producto Congelado ");
		System.out.println(" pulsa 2 para un producto refrigerado ");
		System.out.println(" pulsa 3 para un producto Frescos ");
		opcion = leer.nextInt();
		switch (opcion) {
		case 1:{
			Congelados congelado;
			gestionarProductos.add(congelado = new Congelados(id, "congelado", fechaDeCaducidad, numeroDeLote, -10));
			id++;
			System.out.println(" su producto se ha creado correctamente");
		}
		break;
		case 2: {
			int codigoOrganismoSupervisionAlimentaria;
			codigoOrganismoSupervisionAlimentaria = aleatorio.nextInt(1000);
			Refrigerados refrigerado;
			gestionarProductos.add(refrigerado = new Refrigerados(id, "refrigerado", fechaDeCaducidad, numeroDeLote, codigoOrganismoSupervisionAlimentaria));
			id++;
			System.out.println(" su producto se ha creado correctamente");
		}
		break;
		case 3:{
			Frescos fresco;
			
			gestionarProductos.add(fresco = new Frescos(id, "fresco", fechaDeCaducidad, numeroDeLote, fechaDeEnvasado, "España"));
			id++;
			System.out.println(" su producto se ha creado correctamente");
		}
		break;
		default:{
			System.out.println(" elije una opcion valida");
		}
		}
	}

	@Override
	public boolean eliminarProducto(int idSeleccionado) {
		for (int i = 0; i < gestionarProductos.size(); i++) {
			if (i == idSeleccionado) {
				gestionarProductos.remove(i);
				System.out.println(" elemento eliminado");
				return true;
			}
			
		}
		return false;
	}

	@Override
	public ArrayList<Productos> devolverArray() {
		
		return gestionarProductos;
	}

	@Override
	public ArrayList<Productos> devolverProductosPorTipo(String tipo) {
		ArrayList<Productos> listaTipo = new ArrayList<>();
		for (int i = 0; i < gestionarProductos.size(); i++) {
			if(gestionarProductos.getClass().getName().equals(tipo)) {
				listaTipo.add(gestionarProductos.get(i));
				if(gestionarProductos.get(i) instanceof Congelados && tipo.equals("Congelados")) {
					listaTipo.add(gestionarProductos.get(i));
				}
			}
			for (Productos productos : listaTipo) {
				System.out.println(productos);
			}
		}
		return listaTipo;
	}

	@Override
	public int eliminarProductosCongelados() {
		int contador =0;
		for (int i = 0; i < gestionarProductos.size(); i++) {
			if(gestionarProductos.get(i) instanceof Congelados){
				gestionarProductos.remove(i);
				contador++;
				}
			}
		return contador;
		}
	
	

	@Override
	public void visualizarArray() {
		for (Productos productos : gestionarProductos) {
			System.out.println(productos);
			
		}

	}

}
