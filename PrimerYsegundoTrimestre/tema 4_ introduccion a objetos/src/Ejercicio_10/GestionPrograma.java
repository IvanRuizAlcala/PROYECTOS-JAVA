package Ejercicio_10;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class GestionPrograma {
	int contador=0;
	Programa[] misProgramas = new Programa[25];
	
	public void InsertarNuevoPrograma() {
		
		int contadorPrograma=0;
		String nombre;
		String version;
		String funcion;
		int añoDeLanzamiento;
		String EmpresaQueLoDesarrolla;
		String tipoDeLicencia;
		int precio;
		if(contador<misProgramas.length) {
		Scanner leer = new Scanner(System.in);
		System.out.print(" introduce el nombre del programa: ");
		nombre = leer.next();
		System.out.print(" introduce la version del programa: ");
		version = leer.next();
		System.out.print(" introduce el funcion del programa: ");
		funcion = leer.next();
		System.out.print(" introduce el año de lanzamiento: ");
		añoDeLanzamiento = leer.nextInt();
		System.out.print(" introduce la empresa que lo desarrolla: ");
		EmpresaQueLoDesarrolla = leer.next();
		System.out.print(" introduce el tipo de licencia: ");
		tipoDeLicencia = leer.next();
		System.out.print(" introduce el precio: ");
		precio= leer.nextInt();
		Programa nuevo = new Programa(nombre, version, funcion, añoDeLanzamiento, EmpresaQueLoDesarrolla, tipoDeLicencia, precio);
		misProgramas [contador] = nuevo;
		contador++;
		
		}
	}

	@Override
	public String toString() {
		return "GestionPrograma [misProgramas=" + Arrays.toString(misProgramas) + "]";
	}
	public void mostrarLista(){
		int contadorLista =0;
		for(contadorLista=0;contadorLista<contador;contadorLista++) {
			System.out.println(misProgramas[contadorLista]);
		}
	}
	public void filtrarLicencia(String licenciaElegidaPorUsuario) {
		int contadorLicencia;
	
		for(contadorLicencia=0;contadorLicencia<contador;contadorLicencia++) {
			if(misProgramas[contadorLicencia].tipoDeLicencia.equals(licenciaElegidaPorUsuario)) {
				System.out.println(misProgramas[contadorLicencia]);
			}
	
	}
}
	public void filtrarPorFuncion(String funcionElegidaPorUsuario) {
		int contadorFiltrar=0;
		for(contadorFiltrar=0;contadorFiltrar<contador;contadorFiltrar++) {
			if(misProgramas[contadorFiltrar].funcion.equals(funcionElegidaPorUsuario)) {
				System.out.println(misProgramas[contadorFiltrar]);
			}
	
	}
	}
	public void eliminarUltimoElemento(){
		int contadorEliminar =0;
	int ultimoElemento=0;
	ultimoElemento=contador;
	Programa vacio = null;
		for(contadorEliminar=0;contadorEliminar<contador;contadorEliminar++) {
			if(contadorEliminar==ultimoElemento) {
				misProgramas[contadorEliminar]=vacio;
			}	
	}
		contador--;
}

	public Programa buscarProgramaPorNombre() {
		Scanner leer = new Scanner(System.in);
		String ProgramaElegidoPorUsuario;
		System.out.println("dime un programa para buscar");
		ProgramaElegidoPorUsuario = leer.next();
		int contadorBuscarPrograma=0;
		Programa retornarPrograma = null;
			for(contadorBuscarPrograma=0;contadorBuscarPrograma<contador;contadorBuscarPrograma++) {
	if(misProgramas[contadorBuscarPrograma].nombre.equals(ProgramaElegidoPorUsuario)) {
		retornarPrograma=misProgramas[contadorBuscarPrograma];
	}
	}
			return retornarPrograma;
	}
}