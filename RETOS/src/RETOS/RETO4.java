package RETOS;

public class RETO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int contadorfila= 0;
		int contadorcolumna1=0;
		int restador=16;
		int contadortotal=16;
		int num3=0;
		int num4=0;
		int contadorcolumna2 = 0;
		int contadortotal2=1;
		char estrella = '*';
		//ALGORITMO
		for (contadorfila=1;contadorfila<=5;contadorfila++) {
			for (contadorcolumna1=restador;num3<=contadortotal;num3++) {
				contadorcolumna1--;
				if(contadorcolumna1>=0) {
				System.out.print(" ");
				}
				if (contadorcolumna1<0) {
					System.out.print(estrella);
					}
			}
			for (contadorcolumna2=1;contadorcolumna2<=contadortotal2;contadorcolumna2++) {
				System.out.print(estrella);
			}
			contadortotal2=contadortotal2+contadortotal2;
			restador=restador-(-contadorcolumna1);
			contadorcolumna1=restador;
			num3=0;
				
			System.out.println();
			
		}
	}
}

