package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		double temperatura[]=new double [12];
		
		System.out.println("Introduce la temperatura media de cada uno de los meses del año: ");
		
		for (int i = 0; i<temperatura.length; i++) {
			temperatura[i]=read.nextDouble();
		}
		
		for (double tabla: temperatura) {
			System.out.println("********"+"\n"+tabla+"º"+"\n");
		}

	}

}