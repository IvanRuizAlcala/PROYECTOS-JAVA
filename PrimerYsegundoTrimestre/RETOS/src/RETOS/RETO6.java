package RETOS;

import java.util.Scanner;

public class RETO6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i=0;
		String primeraPalabra=" ";
		String segundaPalabra=" ";
		char inversor=' ';
		int longitud=0;
		Scanner leer = new Scanner(System.in);
		
		
		//ALGORITMO
		System.out.print("dime la longitud de la matriz: ");
		longitud = leer.nextInt();
		char misletras[]= new char[longitud];
		System.out.println("dime una palabra");
		primeraPalabra=leer.next();
		System.out.println("dime otra palabra");
		segundaPalabra=leer.next();
		for(i=0;i<misletras.length;i++) {
			if(primeraPalabra.length()<=i)
				
			System.out.println(misletras);
		}
		
		
		
		
		
		
		
		
	}

}
