package PROCESO_REPETITIVO_2;

import java.util.Scanner;

public class EJERCICIO13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		double peso1=0;
		double altura=0;
		double imc=0;
		char respuesta;
		Scanner leer=new Scanner(System.in);
		//ALGORITMO
do 
{		
		System.out.println(" escribe tu peso");
		peso1=leer.nextDouble();
		System.out.println(" escribe tu altura");
		altura=leer.nextDouble();
		imc=peso1/(altura*altura);
		System.out.println(" su imc es "+imc);
		System.out.println(" si quieres introducir de nuevo marca S, sino marca N");
		respuesta=leer.next().charAt(0);
	}
	while (respuesta=='S');
		if (respuesta=='N') {
			System.out.println("proceso terminado");
		}	

}

}
