package vista;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import control.GestionDepartamentos;
import model.Empleado;
import model.GestionFicheroDat;
import model.GestionFicheroEmpleadosTXT;

public class App {

	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		int numeroEmpleadoAeliminar;
		int key = 0;
		int salir = 0;
		System.out.println("Bienvenidos a Sr.While{System}");
		GestionFicheroDat gestionDat;
		do {
			crearMenu();
			key = leer.nextInt();
			switch (key) {
			case 1: {
				try {
					ArrayList<String> verNombreEmpleadosDepartamentoPersonal = GestionDepartamentos
							.verNombreEmpleadosDepartamentoPersonal();
					System.out.println("el nombre de los empleados son: ");
					for (String string : verNombreEmpleadosDepartamentoPersonal) {
						System.out.println("nombre: " + string);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
				break;
			case 2: {
				String nombre = " ";
				double sueldo = 0;
				double comision = 0;
				int departamento;
				System.out.println(" vamos a crear un empleado");
				System.out.println(" dime su nombre");
				nombre = leer.next();
				System.out.println(" dime su sueldo");
				sueldo = leer.nextDouble();
				System.out.println(" dime su comision");
				comision = leer.nextDouble();
				System.out.println("dime su departamento");
				departamento = leer.nextInt();
				Empleado empleado = new Empleado(nombre, sueldo, comision, departamento);
				 try { 
					 boolean insertarEmpleado = GestionDepartamentos.insertarEmpleado(empleado);
					 if(insertarEmpleado==true) {
						 System.out.println("Empleado insertado correctamente");
					 }
					 else {
						 System.out.println("El empleado no ha podido ser insertado, intentelo de nuevo");
					 }
				 } catch (SQLException e) { e.getMessage(); }
			}
				break;
			case 3: {
				 try {
					 System.out.println("dime el numero de empleado a eliminar");
					 numeroEmpleadoAeliminar = leer.nextInt();
						boolean eliminarEmpleado = GestionDepartamentos.eliminarEmpleado(numeroEmpleadoAeliminar); 
						if(eliminarEmpleado==true) {
							System.out.println("Empleado eliminado correctamente");
						}
						else {
							System.out.println("el empleado no se ha borrado, intentelo de nuevo");
						}
						} catch (SQLException e) { e.getMessage(); }
			}
				break;
			case 4: {
				int numeroEmpleadoAmodificarSalario=0;
				double salarioAmodificar=0;
				System.out.println(" dime el numero de empleado en el que modificaremos su salario");
				numeroEmpleadoAmodificarSalario = leer.nextInt();
				System.out.println(" dime el numero de empleado en el que modificaremos su salario");
				salarioAmodificar = leer.nextDouble();
				try {
					boolean modificarSalario = GestionDepartamentos.modificarSalario(numeroEmpleadoAmodificarSalario, salarioAmodificar);
					if(modificarSalario==true) {
						System.out.println("salario modificado correctamente");
					}
					else {
						System.out.println(" el salario no ha podido modificarse");
					}
				} catch (SQLException e) {
					e.getMessage();
				}
			}
				break;
			case 5: {
			try {
				boolean agregarEmpleadosAarchivoDat = GestionDepartamentos.agregarEmpleadosAarchivoDat();
				if(agregarEmpleadosAarchivoDat==true) {
					System.out.println("archivo creado correctamente");
				}
				else{
					
					System.out.println("el archivo ha fallado");
				}
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
				break;
			case 6: {
			try {
				boolean agregarNombreDepartamentosTXT = GestionDepartamentos.agregarNombreDepartamentosTXT();
				if(agregarNombreDepartamentosTXT==true) {
					System.out.println("archivo creado correctamente");
				}
				else{
					System.out.println("el archivo ha fallado");
				}
					} catch (SQLException | IOException e) {
						e.getMessage();
					}
			key=0;
			break;
					}
			default:{
				salir=key;
			}
			break;
			}
		}
		while (key!=salir);
		System.out.println("has terminado");
	}
	public static void crearMenu() {
		System.out.println("menu de Opciones sobre la base de datos Departamentos");
		System.out.println("1. ver nombres de empleados del departamento 'personal'");
		System.out.println("2. insertar un empleado en el departamento 1");
		System.out.println("3. Eliminar un empleado ");
		System.out.println("4. modificar el salario de un empleado ");
		System.out.println("5. guardar empleados en .dat ");
		System.out.println("6. guarda el nombre de los departamentos en .txt ");
		System.out.println("7. pulsa cualquier numero para salir ");
		System.out.println(" elije una opcion : ");
	}

}
