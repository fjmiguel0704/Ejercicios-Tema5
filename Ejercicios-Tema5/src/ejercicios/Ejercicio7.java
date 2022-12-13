package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce 10 números: ");
		
		double tabla[]=new double [10];
		
		for (int i = 9; i>=0; i--) {
			tabla[i]=read.nextDouble();
		}
		
		for (double valor: tabla) {
			System.out.println(valor);
		}
		
		read.close();

	}

}
