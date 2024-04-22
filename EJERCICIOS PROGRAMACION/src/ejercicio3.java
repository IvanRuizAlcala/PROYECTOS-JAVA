import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DATOS
		int num1=0;
		int num2=0;
		int num3=0;
		int suma=0;
		Scanner entrada = new Scanner (System.in);
//ALGORITMO
			System.out.println("introduce el primer numero");
			num1 = entrada.nextInt();
			System.out.println("introduce el segundo numero");
			num2 = entrada.nextInt();
			System.out.println("introduce el tercer numero");
			num3 = entrada.nextInt();
			
			suma=num1+num2+num3;
			System.out.println("la suma de sus numeros es "+ suma);
					
		
	}

}
