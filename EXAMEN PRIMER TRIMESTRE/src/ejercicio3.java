import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		String contadorNombre = " ";
		double[ ] alturas = {2.15, 2.02, 1.98, 1.80, 1.78, 2.02};
		String [ ] nombres = {"Carlos", "Ana", "Eva", "Antonio", "Elena", "Sara"};
		int posicionMayor=0;
		double media=0;
		
		//algoritmo
		posicionMayor = verificarPosicion(alturas)-1;
		System.out.println(alturas[posicionMayor]+"+"+nombres[posicionMayor]);
		media = mediaAltura(alturas);
		System.out.println(media);
		calcularAlturas(alturas, nombres);
		
		
	}

	
	public static int verificarPosicion(double[] altura ) {
		int contadorAltura=0;
		double numero=0;
		double numeroMayor=0;
		int posicion=0;
		int contadorPosicion=0;
		for (contadorAltura=0;contadorAltura<altura.length;contadorAltura++) {
			numero = altura[contadorAltura];
			contadorPosicion++;
			if (numero>numeroMayor) {
				posicion=contadorPosicion;
				numeroMayor=numero;
			}
	
		}
		return posicion;
	}
	public static double mediaAltura( double[] altura) {
		double sumarMedia =0;
		double media=0;
		int contadorAltura=0;
		for(contadorAltura=0;contadorAltura<altura.length;contadorAltura++) {
			sumarMedia=sumarMedia + altura[contadorAltura];
			
		}
		media=sumarMedia/altura.length;
		return media;
	}
	public static void calcularAlturas(double[] altura, String [] nombres) {
		String nombresElegidos=" ";
		int contadorAltura=0;
		int contadorNombre=0;
		double alturaElegida =0;
		Scanner leer = new Scanner(System.in);
		System.out.println("indica una altura y te mostraremos los nombres correspondientes");
		alturaElegida = leer.nextDouble();
		for(contadorAltura=0; contadorAltura<altura.length;contadorAltura++) {
			if(altura[contadorAltura]>=alturaElegida) {
				for(contadorNombre=0;contadorNombre<nombres.length;contadorNombre++) {
					if(contadorAltura==contadorNombre) {
						nombresElegidos=nombres[contadorNombre];
						System.out.println(nombresElegidos + " ---->" + altura[contadorAltura]);
					}
				}
			}
		}
		
	}
}


