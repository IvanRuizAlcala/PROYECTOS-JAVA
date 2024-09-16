package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cliente;
import model.ConectDB;
import model.Usuario;

public class Gestion {
ConectDB conectar;
String[] datos = {"nombreUsuario","password","tipoUsuario"};
	
	public Boolean crearTabla() throws SQLException {
		String query = "create table if not exists usuarios(id int auto_increment primary key, nombreUsuario varchar(50), password varchar(50),tipoUsuario varchar(50))";
		PreparedStatement statement = conectar.getConexion().prepareStatement(query);
		boolean execute = statement.execute();
		return execute;
	}
	private boolean insertarUsuarios(Usuario usuario ) throws SQLException {
		boolean control=false;
		String query = "insert into usuarios(nombreUsuario,password,tipoUsuario) values(?,?,?)";
		PreparedStatement statement = conectar.getConexion().prepareStatement(query);
		statement.setString(1, usuario.getNombreUsuario());
		statement.setString(2, usuario.getPassword());
		statement.setString(3, usuario.getTipoUsuario());
		int executeUpdate = statement.executeUpdate();
		if(executeUpdate!=0) {
			control = true;
		}
		return control;
	}
	public boolean crearUsuarios(String nombreUsuario,String password,String tipoUsuario) throws SQLException {
		boolean control=false;
		Usuario aux = new Usuario(nombreUsuario,password,tipoUsuario);
		boolean insertarUsuarios = insertarUsuarios(aux);
			if(insertarUsuarios==true) {
				control=true;
			}
			return control;
	}
	public ArrayList<Usuario> filtroPersonalizadoDeBusqueda(int opcion, String condicion) throws SQLException {
		ArrayList<Usuario> usuariosBuscados = new ArrayList<>();
		int opcionId = 0;
		String eleccion= " ";
		Usuario aux;
		if(opcion==opcionId) {
			eleccion = "id";
		}
		else {
		eleccion = datos[opcion-1];
		}
		String query = "select * from usuarios where "+eleccion+" = ?";
		PreparedStatement statement = conectar.getConexion().prepareStatement(query);
		statement.setString(1, condicion);
		ResultSet executeQuery = statement.executeQuery();
		while(executeQuery.next()) {
			executeQuery.getInt(1);
			executeQuery.getString(2);
			executeQuery.getString(3);
			executeQuery.getString(4);
			aux = new Usuario(executeQuery.getInt(1),executeQuery.getString(2),executeQuery.getString(3),executeQuery.getString(4));
		usuariosBuscados.add(aux);
		}
		return usuariosBuscados;
	}
	public ArrayList<String> visualizarTablas(String nombre, String password) throws SQLException {
		ArrayList<String>tablas = new ArrayList<>();
		String query = "select * from usuarios where nombreUsuario = ? and password=?";
		PreparedStatement statement = conectar.getConexion().prepareStatement(query);
		statement.setString(1, nombre);
		statement.setString(2, password);
		ResultSet executeQuery = statement.executeQuery();
		while(executeQuery.next()) {
			if(executeQuery.getString(4).equals("normal")) {
				String queryUsuarioNormal = "show tables";
				PreparedStatement statement2 = conectar.getConexion().prepareStatement(queryUsuarioNormal);
				ResultSet executeQuery2 = statement2.executeQuery();
				while(executeQuery2.next()) {
					tablas.add(executeQuery2.getString(1));
				}	
				}
			else {
				tablas.add("el usuario no tiene permisos para visualizar las tablas");
			}
		}
		return tablas;
	}
	public ArrayList<Usuario> listadoCompletoActualizado() throws SQLException{
		Usuario usuarioAuxiliar;
		ArrayList<Usuario>listadoCompleto = new ArrayList<>();
		String query = "select * from usuarios";
		PreparedStatement statement = conectar.getConexion().prepareStatement(query);
		ResultSet executeQuery = statement.executeQuery();
		while(executeQuery.next()) {
			usuarioAuxiliar = new Usuario(executeQuery.getInt(1),executeQuery.getString(2),executeQuery.getString(3),executeQuery.getString(4));
			listadoCompleto.add(usuarioAuxiliar);
		}
		return listadoCompleto;
	}
	public ArrayList<String> guardarNombreColumnas() throws SQLException{
		ArrayList<String> columnas = new ArrayList<>();
		String query = "select * from usuarios";
		PreparedStatement statement = conectar.getConexion().prepareStatement(query);
		ResultSet executeQuery = statement.executeQuery();
		ResultSetMetaData metaData = executeQuery.getMetaData();
		for (int i = 1; i < metaData.getColumnCount()+1; i++) {
			columnas.add(metaData.getColumnName(i));	
		}
		return columnas;
	}
	public ArrayList<String> guardarNombreColumnasClientes() throws SQLException{
		ArrayList<String> columnas = new ArrayList<>();
		String query = "select nombre,telefono,ciudad,pais from clientes";
		PreparedStatement statement = conectar.getConexion().prepareStatement(query);
		ResultSet executeQuery = statement.executeQuery();
		ResultSetMetaData metaData = executeQuery.getMetaData();
		for (int i = 1; i < metaData.getColumnCount()+1; i++) {
			columnas.add(metaData.getColumnName(i));	
		}
		return columnas;
	}
	
	public ArrayList<Cliente> guardarClientePorCiudad(String ciudad) throws SQLException{
		Cliente auxCliente;
		ArrayList<Cliente> clientesPorCiudad = new ArrayList<>();
		String query = "select nombre,telefono,ciudad,pais from clientes where ciudad = ? ";
		PreparedStatement statement = conectar.getConexion().prepareStatement(query);
		statement.setString(1, ciudad);
		ResultSet executeQuery = statement.executeQuery();
		while(executeQuery.next()) {
			auxCliente = new Cliente(executeQuery.getString(1),executeQuery.getString(2),executeQuery.getString(3),executeQuery.getString(4));
			clientesPorCiudad.add(auxCliente);
		}
		return clientesPorCiudad;
	}
	public ArrayList<Cliente> archivoCompletoClienteActualizado() throws SQLException{
		Cliente auxCliente;
		ArrayList <Cliente> misClientesCompletos = new ArrayList<>();
		String query = "select nombre,telefono,ciudad,pais from clientes";
		PreparedStatement statement = conectar.getConexion().prepareStatement(query);
		ResultSet executeQuery = statement.executeQuery();
		while(executeQuery.next()) {
			auxCliente = new Cliente(executeQuery.getString(1),executeQuery.getString(2),executeQuery.getString(3),executeQuery.getString(4));
			misClientesCompletos.add(auxCliente);
		}
		return misClientesCompletos;
	}
	public boolean crearTablaClientesEspañoles() throws SQLException {
	String query = "create table if not exists clientesEspanoles(id int auto_increment primary key, nombre varchar(50), telefono varchar(50),ciudad varchar (50),pais varchar(50))";
	PreparedStatement statement = conectar.getConexion().prepareStatement(query);
	boolean execute = statement.execute();
	
	return execute;
	}
	public boolean insertarClientes(ArrayList<Cliente>clientesEspanoles) throws SQLException {
		boolean control = false;
		for (Cliente cliente : clientesEspanoles) {
			String query = "insert into clientesEspanoles(nombre,telefono,ciudad,pais) values(?,?,?,?)";
			PreparedStatement statement = conectar.getConexion().prepareStatement(query);
			statement.setString(1, cliente.getNombreCliente());
			statement.setString(2, cliente.getTelefono());
			statement.setString(3, cliente.getCiudad());
			statement.setString(4, cliente.getPais());
			int executeUpdate = statement.executeUpdate();
			if(executeUpdate!=0) {
				control=true;
			}
		}
		return control;
		
	}
	public ArrayList<Cliente> extraerNacionalidad(ArrayList<Cliente>totalClientes) {
		ArrayList<Cliente>nacionalidadEspanola = new ArrayList<>();
		String prefijoEspanol = "+34";
		for (Cliente cliente : totalClientes) {
			String[] split = cliente.getTelefono().split(" ");
			for (int i = 0; i < split.length; i++) {
				if(split[i].equals(prefijoEspanol)) {
					nacionalidadEspanola.add(cliente);
				}
			}
		}
		return nacionalidadEspanola;
	}
}
