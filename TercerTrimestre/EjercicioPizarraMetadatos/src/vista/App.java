package vista;

import java.sql.SQLException;
import java.util.ArrayList;

import control.GestionarDepartamentos;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		GestionarDepartamentos gestion = new GestionarDepartamentos();
		ArrayList<String> visualizartablasDepartamentos = gestion.VisualizartablasDepartamentos();
		for (String string : visualizartablasDepartamentos) {
			System.out.println(string);
		}
	}

}
