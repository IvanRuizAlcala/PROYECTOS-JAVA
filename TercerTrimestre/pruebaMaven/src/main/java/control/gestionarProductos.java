package control;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import model.data.ConectDB;
import model.data.Producto;

public class gestionarProductos {
ConectDB conectar;
ArrayList<Producto>productosCompletos = new ArrayList<>();
Producto producto;

	
	public ArrayList<String> guardarProductos() throws SQLException {
	String auxiliar =" ";
	String rayasSuperiores =" ---------- -------------------- ---------------------------- -------- --------- ";
	String menu ="; CODIGO   ; NOMBRE             ; CATEGORIA                  ; Pventa ; PCompra ;";
	String rayasInferiores =" ---------- -------------------- ---------------------------- -------- --------- ";
	ArrayList<String>aux = new ArrayList<>();
	String query = "select * from productos order by precioVenta";
	PreparedStatement ps = conectar.getConexion().prepareStatement(query);	
	ResultSet executeQuery = ps.executeQuery(query);
	System.out.println(rayasSuperiores);
	System.out.println(menu);
	System.out.println(rayasInferiores);
	//aux.add(rayasSuperiores);
	aux.add(menu);
	//aux.add(rayasInferiores);
	while(executeQuery.next()) {
	
	System.out.print("| "+executeQuery.getString(1) +" |");
	System.out.print(" "+executeQuery.getString(2) +" |");
	System.out.print(" "+executeQuery.getString(5) +" |");
	System.out.print(" "+executeQuery.getString(9) +" |");
	System.out.println();
	auxiliar ="; "+ executeQuery.getString(1) + " ;" + executeQuery.getString(2) + " ;" + executeQuery.getString(3)+ " ;" + executeQuery.getString(8)+ " ;" + executeQuery.getString(9)+" ;";
	aux.add(auxiliar);
	}
	return aux;
	}
	public ArrayList<Producto> agregarProductos() throws SQLException{
		String query1 = "select * from productos where precioVenta between 1 and 200 order by precioVenta";
		PreparedStatement ps1 = conectar.getConexion().prepareStatement(query1);
		ResultSet executeQuery1 = ps1.executeQuery(query1);
		while(executeQuery1.next()) {
		producto = new Producto(executeQuery1.getString(1),executeQuery1.getString(2),executeQuery1.getString(5),executeQuery1.getString(9));
		productosCompletos.add(producto);
		}
		return productosCompletos;
	}
	public ArrayList<String> agregarMenu(){
		ArrayList<String>menu = new ArrayList<>();
		String Codigo = "CODIGO";
		String nombre =  "NOMBRE";
		String Categoria = "VENDEDOR";
		String pventa = "Pventa";
		menu.add(Codigo);
		menu.add(nombre);
		menu.add(Categoria);
		menu.add(pventa);
		return menu;
	}
	
	}

