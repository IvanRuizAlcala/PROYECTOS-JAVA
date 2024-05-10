import java.util.Scanner;

public class EJERCICIO7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		String nombre1="";
		int edad1=0;
		Scanner entrada=new Scanner(System.in);
		//ALGORITMO
		System.out.println(" introduce tu nombre");
		nombre1=entrada.next();
		System.out.println(" introduce tu edad");
		edad1=entrada.nextInt();
		if (edad1<=200) {
			if (edad1<18) {
				System.out.println( nombre1 + " tienes "+ edad1 + " años, eres menor de edad ");}
			if (edad1>=18&&edad1<65){
				System.out.println( nombre1 + " tienes "+ edad1 + " años, eres adulto ");}
			if (edad1>=65) {
			System.out.println( nombre1 + " tienes "+ edad1 + " años, eres mayor de edad ");}			
		}
	}

}
