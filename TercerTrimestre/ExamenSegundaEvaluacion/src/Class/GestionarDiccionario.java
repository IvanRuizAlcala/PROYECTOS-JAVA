package Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Interface.interfazGestionarDicionario;

public class GestionarDiccionario implements interfazGestionarDicionario {
	Scanner leer = new Scanner(System.in);
ArrayList<Diccionario>gestionarDiccionario = new ArrayList<>();
	@Override
	public void addDiccionario() {
		
		String idioma;
		System.out.println(" vamos a añadir un nuevo diccionario");
		System.out.println(" elige un idioma");
		idioma = leer.next();
		Diccionario nuevoDiccionario = new Diccionario(idioma,null);
		gestionarDiccionario.add(nuevoDiccionario);
				
	}

	@Override
	public void addTerminos(String idioma) {
		ArrayList<String> addterm = new ArrayList<>();
		System.out.println(" introduce el idioma del diccionario a buscar");
		String terminos;
		Definicion definicionTerminos = null;
		for (int i = 0; i < gestionarDiccionario.size(); i++) {
		if(gestionarDiccionario.get(i).getIdioma().equals(idioma)) {
			System.out.println(" vamos a añadir los terminos");
			System.out.println("dime el termino");
			terminos = leer.next();
			definicionTerminos.addDefinicion(terminos);
			gestionarDiccionario.get(i).getTermino().put(terminos,definicionTerminos);
			
			}
		}
	}

	@Override
	public void modificarSignificado(String terminos) {
		String definicionElegida;
		Diccionario buscarDiccionario;
		Definicion definicionSignificado = null;
		for (int i = 0; i < gestionarDiccionario.size(); i++){
			buscarDiccionario = gestionarDiccionario.get(i);
		if(buscarDiccionario.getTermino().containsKey(terminos)) {
		System.out.println(" vamos a añadir la definicion");
		System.out.println(" dime la definicion");
		definicionElegida = leer.next();
		definicionSignificado.addDefinicion(definicionElegida);
		buscarDiccionario.getTermino().put(terminos, definicionSignificado);
			}
		}
	}

	@Override
	public HashMap mostrarSignificadosPorTermino(String termino) {
		HashMap<String,Definicion> busqueda = new HashMap();
		Diccionario buscarDiccionario;
		for (int i = 0; i < gestionarDiccionario.size(); i++){
			buscarDiccionario = gestionarDiccionario.get(i);
			if(buscarDiccionario.getTermino().containsKey(termino)) {
				busqueda.putAll(buscarDiccionario.getTermino());
			}
		}
		return busqueda;
		
	}

	@Override
	public void eliminarSignificado(Diccionario diccionario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTerminos(Diccionario diccionario) {
		// TODO Auto-generated method stub
		
	}


		
	

}
