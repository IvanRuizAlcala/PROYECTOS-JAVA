package EJERCICIOS_ARRAYS_3;

import java.time.Month;

public class EJERCICIO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS
		int i =0;
		String meses=" ";
		String mismeses[] = new String [12];
		int numeroCaracteres=0;
		//ALGORITMO
		for (i=0;i<mismeses.length;i++) {
			mismeses[0]="Enero";
			mismeses[1]="Febrero";
			mismeses[2]="Marzo";
			mismeses[3]="Abril";
			mismeses[4]="Mayo";
			mismeses[5]="Junio";
			mismeses[6]="Julio";
			mismeses[7]="agosto";
			mismeses[8]="Septiembre";
			mismeses[9]="Octubre";
			mismeses[10]="Noviembre";
			mismeses[11]="Diciembre";
			meses=mismeses[i];
			System.out.println(mismeses[i]+ " " +meses.length());
		}
		
		


	}

}
