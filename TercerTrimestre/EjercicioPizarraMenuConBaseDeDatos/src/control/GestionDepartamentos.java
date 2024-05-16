package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import model.ConectDB;
import model.Empleado;

public class GestionDepartamentos {
	static Scanner leer = new Scanner(System.in);
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
	public static void agregarEmpleadosAarchivoDat() {
		
	}
}
