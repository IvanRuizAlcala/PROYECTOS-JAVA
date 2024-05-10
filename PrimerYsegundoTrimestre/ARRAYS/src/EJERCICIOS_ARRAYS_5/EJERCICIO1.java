package EJERCICIOS_ARRAYS_5;

import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1=0;
		int valor2=0;
		int horizontal1=0;
		int horizontal2=0;
		int i=0;
		int valorSuma=0;
		
		Scanner leer = new Scanner(System.in);
		
		int operador1[]=new int [5];
		int operador2[]=new int [5];
		int suma[]= new int[5];
		//ALGORITMO
		System.out.println(" a continuacion te pedire 5 numeros");
		for(horizontal1=0;horizontal1<operador1.length;horizontal1++) {
			System.out.print("dime el numero " + horizontal1 +" :");
			valor1=leer.nextInt();
			operador1[horizontal1]=valor1;
			
		}
		System.out.print("tus numeros elegidos son ");
		for(horizontal1=0;horizontal1<operador1.length;horizontal1++) {
			System.out.print(operador1[horizontal1] + " ");
		}
		System.out.println(" ");
		System.out.println(" ahora te pedire otros 5 numeros");
		for(horizontal2=0;horizontal2<operador2.length;horizontal2++) {
			System.out.print(" dime el numero " + horizontal2 + " :");
			valor2 = leer.nextInt();
			operador2[horizontal2]=valor2;
		}
		System.out.print(" tus numeros elegidos esta vez son ");
		for(horizontal2=0;horizontal2<operador2.length;horizontal2++) {
			System.out.print(operador2[horizontal2]+" ");
	}
		System.out.println(" ");
		System.out.print(" la suma de tus numeros es ");
		for(i=0;i<suma.length;i++) {
			for(i=0;i<suma.length;i++){
				suma[i]=operador1[i]+operador2[i];	
		}
		for(i=0;i<suma.length;i++) {
			System.out.print(suma[i]+" ");
		}

}
	}
}