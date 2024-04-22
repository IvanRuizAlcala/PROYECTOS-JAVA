package ejercicio_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GestionDatosMeteo implements interfazMeteo {
	ArrayList<datosMeteo> gestionarDatos = new ArrayList<>();
	@Override
	public void anadirDatos() {
		Scanner leer = new Scanner(System.in);
		Random aleatorio = new Random();
		double tempMinimo = aleatorio.nextInt(10);
		double tempMaximo = aleatorio.nextInt(100) + 20;
		double humedadMinimo = aleatorio.nextInt(10);
		double humedadMaximo = aleatorio.nextInt(100) + 20;
		double precipitaciones = aleatorio.nextInt(1000);
		System.out.println(" vamos a crear un dato:");
		datosMeteo dato1 = new datosMeteo(LocalDate.now(), tempMinimo, tempMaximo, humedadMaximo, humedadMinimo,
				precipitaciones);
		System.out.println(" lo estamos introduciendo en el array");
		gestionarDatos.add(dato1);
		System.out.println(" objeto creado y añadido en la lista");
	}

	@Override
	public double mediaTempMax() {
		double mediaTemp = 0;
		double sumTemp = 0;
		for (int i = 0; i < gestionarDatos.size(); i++) {
		sumTemp= sumTemp + gestionarDatos.get(i).getTemperaturaMaxima();
		}
		mediaTemp= sumTemp/gestionarDatos.size();
		return mediaTemp;
	}

	@Override
	public double mediaTempMax(int anno, int mes) {
		int contador = 0;
		double mediaTemp;
		double sumaTemp = 0;
		for (int i = 0; i < gestionarDatos.size(); i++) {
			if(gestionarDatos.get(i).getFecha().getMonthValue() == mes && gestionarDatos.get(i).getFecha().getYear()==anno) {
					sumaTemp= sumaTemp + gestionarDatos.get(i).getTemperaturaMaxima();
			}
			contador++;
		}
		mediaTemp= sumaTemp/contador;
		return mediaTemp;
	
	}

	@Override
	public Object numeroRegistros() {
		
			return gestionarDatos.size();
		}
	public void visualizarArray() {
		for (datosMeteo datosMeteo : gestionarDatos) {
			System.out.println(datosMeteo);
		}		
	}

	}



