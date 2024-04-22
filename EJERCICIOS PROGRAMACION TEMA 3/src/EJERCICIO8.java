import java.util.Scanner;

public class EJERCICIO8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int dia1= 1;
		Scanner entrada = new Scanner(System.in);
		
		//ALGORITMO
		System.out.println(" pon el dia de la semana en numero ");
		dia1=entrada.nextInt();
		switch (dia1){
		case 1: System.out.println("lunes");
		break;
		case 2: System.out.println("Marter");
		break;
		case 3: System.out.println("Miercoles");
		break;
		case 4: System.out.println("Jueves");
		break;
		case 5: System.out.println("Viernes");
		break;
		case 6: System.out.println("Sabado");
		break;
		case 7: System.out.println("Domingo");
		break;
		}
		
	}

}
