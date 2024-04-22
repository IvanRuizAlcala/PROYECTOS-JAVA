import java.util.Scanner;

public class EJERCICIO7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int num1=0;
		int num2=1;
	
		Scanner entrada= new Scanner(System.in);
		//ALGORITMO
		
		while (num1<=100) {
			System.out.println("escribe un numero");
			num1=entrada.nextInt();
			if (num1>=0 && num1<=100){
				for (num2=1;num2<=10;num2++){
					int num3=num1*num2;
					System.out.println(num1+"X"+num2+"="+num3);
					
				}
			}
				
		}
	}

}
