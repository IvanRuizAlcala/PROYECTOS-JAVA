package vista;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import control.Usuario;
import control.gestionarUsuarios;
import model.data.gestionFicheroTXT;

public class App {

	public static void main(String[] args) {
		ArrayList<Usuario> misUsuarios = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		String userClient = " ";
		String passClient = " ";
		String nombre = "";
		String pass = " ";
		String userType=" ";
		int tipo = 0;
		Usuario usuario;
		gestionarUsuarios gestion = new gestionarUsuarios();
		gestionFicheroTXT ficheroTxt = new gestionFicheroTXT("usuarios.txt");
		try {
				gestion.crearTabla();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("vamos a crear un nuevo usuario");
		System.out.println("dime el nombre");
		nombre = leer.next();
		System.out.println("dime la contraseña");
		pass = leer.next();
		System.out.println("dime el tipo de usuario, 1 si quieres que sea administrador, 2 si quieres que sea usuario");
		tipo = leer.nextInt();
		if(tipo==1) {
			userType ="administrador";
		}
		if(tipo==2) {
			userType = "usuario";
		}
		usuario = new Usuario(nombre,pass,userType);
		misUsuarios.add(usuario);
		System.out.println(" vamos a insertarlo en la base de datos");
		try {
			gestion.insertarUsuarios(usuario);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" dime tu usuario");
		userClient = leer.next();
		System.out.println("contraseña");
		passClient = leer.next();
		System.out.println(" vamos a insertarlo" + userClient + " " + passClient);
		try {
			System.out.println(gestion.buscarUsuario(userClient, passClient));
			if(gestion.buscarUsuario(userClient, passClient)==true) {
				gestion.mostrarTablas();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
