import java.util.Scanner;

public class EjercicioSUMA {
public static void main(String[] args) {
	//VARIABLES
	int num1=0;
	int num2=0;
	int suma=0;
	int resta=0;
	int division=0;
	int resto=0;
	
	
	//ALGORITMO
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Dame un número");
		num1= entrada.nextInt();
	System.out.println("dame otro numero " ) ;
		num2= entrada.nextInt();
		
	suma=num1+num2;
	resta=num1-num2;
	division=num1/num2;
	resto=num1%num2;
	
	System.out.println( "la suma de tu numero es" + suma ) ;
	System.out.println( "la resta de tu numero es" + resta ) ;
	System.out.println( "la division de tu numero es" + division ) ;
	System.out.println( "el resto de tu numero es" + resto ) ;
	
	
	
}
}
