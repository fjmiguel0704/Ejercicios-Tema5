package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double  numero;
		double cantidad [] = new double [5];
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce 5 números decimales: ");
		
		for (int i = 0; i<cantidad.length; i++) {
			numero=read.nextDouble();
			cantidad[i]=numero;
		}
		
		for (double num: cantidad) {
			System.out.println(num);
		}

	}

}
