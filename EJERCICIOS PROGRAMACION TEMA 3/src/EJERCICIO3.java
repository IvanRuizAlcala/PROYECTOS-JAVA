import java.util.Scanner;

public class EJERCICIO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		Scanner entrada = new Scanner(System.in);
		//DATOS
		System.out.println("introduce el primer numero");
		num1 = entrada.nextInt();
		System.out.println("introduce el segundo numero");
		num2 = entrada.nextInt();
		
		if (num1>=num2) {
			System.out.println(num1 + " es mayor a " + num2 + " o son iguales " );}
	
		else {
			System.out.println(num2 + " es mayor que " + num1);}
			
		}
	}
						
	

