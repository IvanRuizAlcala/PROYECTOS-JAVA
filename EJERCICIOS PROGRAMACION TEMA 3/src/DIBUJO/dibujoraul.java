package DIBUJO;

public class dibujoraul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada = new Scanner(System.in);
    int num1;
    System.out.println("Introduce un numero: ");
    num1 = entrada.nextInt();
    for(int i = 1;i<= num1;i++) {
        for(int j = i; j < num1 + i; j++) {
            if(j > num1) {
                System.out.print(num1 + " ");
            }else {
                System.out.print(j + " ");
            }

        }
        System.out.println();
    }

}
}