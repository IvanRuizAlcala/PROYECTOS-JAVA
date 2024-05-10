package ejercicio_7;

import java.util.Scanner;

public class Menu {
		private String [] opciones;
		
		public Menu(String[] opciones) {
		this.opciones = opciones;
		}
		
		public String mostrarMenu() {
		Scanner entrada = new Scanner(System.in);
		// mostrar opciones menu
		for (String string : opciones) {
		System.out.println(string);
		}
		System.out.println(" dime una opcion del menu a elegir");
		String opc = entrada.next();
		return opc;
		}

		}
		
	


