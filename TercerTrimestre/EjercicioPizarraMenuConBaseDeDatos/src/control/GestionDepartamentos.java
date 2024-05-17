package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.ConectDB;
import model.Empleado;
import model.GestionFicheroDat;
import model.GestionFicheroEmpleadosTXT;

public class GestionDepartamentos {
	static GestionFicheroEmpleadosTXT gestionTXT;
	static GestionFicheroDat gestionFichero;
	static Scanner leer = new Scanner(System.in);
	static String sqlSelect;
	public static ArrayList<String> verNombreEmpleadosDepartamentoPersonal() throws SQLException {
		
		ArrayList<String> nombreEmpleados = new ArrayList<>();
		Statement statement = ConectDB.getConexion().createStatement();
		ResultSet rs = statement.executeQuery(
				"select nombre from empleados where departamento = (select numeroDepartamento from departamentos where nombre='personal')");
		while (rs.next()) {
			nombreEmpleados.add(rs.getString(1));

		}
		return nombreEmpleados;
	}

	public static boolean insertarEmpleado(Empleado empleado) throws SQLException {
		int sinResultado = 0;
		boolean results = false;
		String sqlInsert = " ";
		Statement statement = ConectDB.getConexion().createStatement();
		sqlInsert = "insert into empleados(nombre,salario,comision,departamento) " + "values('" + empleado.getNombre()
				+ "','" + empleado.getSalario() + "','" + empleado.getComision() + "','" + empleado.getDepartamento()
				+ "')";
		int executeUpdate = statement.executeUpdate(sqlInsert);
		if (executeUpdate != sinResultado) {
			results = true;
		}
		return results;
	}

	public static boolean eliminarEmpleado(int numero) throws SQLException {
		boolean results = false;
		int confirmUpdate = 0;
		String sqlDrop;
		String confirmEliminar = " ";
		String sqlInsert = " ";
		Statement statement = ConectDB.getConexion().createStatement();
		sqlInsert = "select * from empleados where numeroEmpleado=" + numero + ";";
		ResultSet rs = statement.executeQuery(sqlInsert);
		if (rs.next()) {
			System.out.println(rs.getString(1));
		}
		System.out.println("confirmas eliminar empleado Y/N?");
		confirmEliminar = leer.next();
		if (confirmEliminar.equals("Y")) {
			sqlDrop = "delete from empleados where numeroEmpleado=" + numero + ";";
			int executeUpdate = statement.executeUpdate(sqlDrop);
			if (executeUpdate != confirmUpdate) {
				results = true;
			}
		}
		return results;
	}
	public static boolean modificarSalario(int numeroEmpleado,double salario) throws SQLException {
		boolean resultado=false;
		String respuesta = "";
		String sqlConsult = " ";
		Statement statement = ConectDB.getConexion().createStatement();
		sqlConsult = "select salario from empleados where numeroEmpleado= " +numeroEmpleado+";";
		ResultSet executeQuery = statement.executeQuery(sqlConsult);
		if(executeQuery.next()) {
			System.out.println(executeQuery.getString(1));
		}
		System.out.println("estas seguro de cambiar el salario actual :"+ executeQuery.getString(1) + " a " +salario +" ? Y/n");
		respuesta = leer.next();
		if(respuesta.equalsIgnoreCase("Y")) {
			String sqlUpdate = "update empleados set salario= "+salario +"where numeroEmpleado= " + numeroEmpleado +";";
			int executeUpdate = statement.executeUpdate(sqlUpdate);
			if(executeUpdate!=0) {
				resultado = true;
			}
		}
		return resultado;
	}
	public static boolean agregarEmpleadosAarchivoDat() throws SQLException, FileNotFoundException, IOException {
		Empleado empleado;
		boolean resultado =false;
		int numeroEmpleado = 0;
		String nombreEmpleado =" ";
		double salario = 0;
		double comision=0;
		int departamento=0;
		String email=" ";
		String telefono=" ";
		ArrayList<Empleado> empleados = new ArrayList<>();
		Statement statement = ConectDB.getConexion().createStatement();
		sqlSelect = "select * from empleados";
		ResultSet executeQuery = statement.executeQuery(sqlSelect);
		while(executeQuery.next()) {
			numeroEmpleado=executeQuery.getInt(1);
			nombreEmpleado=executeQuery.getString(2);
			salario=executeQuery.getDouble(3);
			comision=executeQuery.getDouble(4);
			departamento=executeQuery.getInt(5);
			email=executeQuery.getString(6);
			telefono=executeQuery.getString(7);
			empleado = new Empleado(numeroEmpleado,nombreEmpleado,salario,comision,departamento,email,telefono);
			System.out.println(empleado);
			empleados.add(empleado);
		}
		System.out.println(" dime el nombre del archivo(recuerda que debe terminar en .DAT)");
		String fichero = leer.next();
		gestionFichero = new GestionFicheroDat(fichero);
		gestionFichero.abrirArchivo();
		gestionFichero.insertarDatos(empleados);
		gestionFichero.cerrarArchivo();
		if(empleados!=null) {
			resultado = true;
		}
		return resultado;
	}
	public static boolean agregarNombreDepartamentosTXT() throws SQLException, FileNotFoundException, IOException {
		boolean resultado = false;
		ArrayList<String> nombreDepartamentos = new ArrayList<>();
		sqlSelect = "select nombre from departamentos";
		Statement statement = ConectDB.getConexion().createStatement();
		ResultSet executeQuery = statement.executeQuery(sqlSelect);
		while(executeQuery.next()) {
			String nombreDepartamento = executeQuery.getString(1);
			nombreDepartamentos.add(nombreDepartamento);
		}
			System.out.println(" dime el nombre del archivo(recuerda que debe terminar en .TXT)");
			String fichero = leer.next();
			gestionTXT = new GestionFicheroEmpleadosTXT(fichero);
			gestionTXT.abrirArchivo();
			gestionTXT.insertarDatos(nombreDepartamentos);
			gestionTXT.cerrarArchivo();
			if(nombreDepartamentos!=null) {
				resultado=true;
			
		}
		return resultado;
		
	}
}
