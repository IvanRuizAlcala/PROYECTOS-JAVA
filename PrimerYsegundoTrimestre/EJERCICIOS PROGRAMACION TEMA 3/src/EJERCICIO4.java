import java.util.Scanner;

public class EJERCICIO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=0;
		Scanner entrada = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" escribe un numero");
		num1=entrada.nextInt();
		System.out.println(" escribe otro numero");
		num2=entrada.nextInt();
		if (num1>=num2) {
			System.out.println("el orden de los numeros es ");
			System.out.println(num1);
			System.out.println(num2);}
			else {
				System.out.println(" el orden de los numeros es ");
				System.out.println(num2);
				System.out.println(num1);
			}
	}

}
