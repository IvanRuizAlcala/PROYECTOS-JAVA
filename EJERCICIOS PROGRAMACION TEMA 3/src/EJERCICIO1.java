import java.util.Scanner;

public class EJERCICIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		Scanner entrada = new Scanner(System.in);
		//DATOS
		System.out.println("introduce el primer numero");
		num1 = entrada.nextInt();
		
		if (num1 % 2 ==0) {
			System.out.println( " el numero " + num1 + " es par");}
		
		else {
			System.out.println( " el numero es impar");
		}
			
		
	}

}
