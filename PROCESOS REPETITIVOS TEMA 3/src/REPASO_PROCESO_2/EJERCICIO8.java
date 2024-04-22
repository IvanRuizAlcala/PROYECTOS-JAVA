package REPASO_PROCESO_2;

public class EJERCICIO8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int numeroa1=0;
		int num1=0;
		int numeroanterior=0;
		//ALGORITMO
		for(num1=1;num1<=10;num1++) {
		numeroa1=EJERCICIO7.numeroaleatorio(1, 50);
		System.out.println(numeroa1);
		if (numeroanterior<numeroa1) {
			numeroanterior=numeroa1;
		}
		}
		System.out.println(" el numero mas alto es " + numeroanterior);
		
	}

}
