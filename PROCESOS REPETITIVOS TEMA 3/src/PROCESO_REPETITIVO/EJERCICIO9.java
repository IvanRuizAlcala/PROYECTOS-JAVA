import java.util.Scanner;

public class EJERCICIO9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		String asterisco1 = "**********";
		Scanner leer = new Scanner(System.in);
		//ALGORITMO
		System.out.println(" escribe un numero");
		num1=leer.nextInt();
		for (num1=num1;num1!=0;num1--) {
			System.out.println(asterisco1);
		}
	}

}
