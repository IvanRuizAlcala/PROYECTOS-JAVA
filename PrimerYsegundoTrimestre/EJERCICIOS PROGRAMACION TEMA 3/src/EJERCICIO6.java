import java.util.Scanner;

public class EJERCICIO6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		double num1 = 0;
		double num2 = 0;
		double num3 =0;
		double media1;
		Scanner entrada= new Scanner(System.in);
		//ALGORITMO
		System.out.println(" dime un numero");
		num1 = entrada.nextDouble();		
		System.out.println(" dime otro numero");
		num2 = entrada.nextDouble();		
		System.out.println(" dime un tercer numero");
		num3 = entrada.nextDouble();	
		
		media1=(num1+num2+num3)/3;
		
		if ( media1 >= 10) {
			if (media1==10) {
				System.out.println(" la media " + media1 + " es igual que 10");}
			if (media1>10) {
				System.out.println(" la media " + media1 + " es mayor que 10");}
		}
		else {
			System.out.println(" la media " + media1 + " es menor que 10");
			
			
		}
	}

}
