package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		double numeros, min, max;
		double  tabla[] = new double [10];
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce 10 números reales: ");
		
		for (int i = 0; i<tabla.length; i++) {
			numeros=read.nextInt();
			tabla[i]=numeros;
		}
		
		max=tabla[0];
		min=tabla[0];
		
		for (double num: tabla) {
			if(num>max) {
				max=num;
			}
			
			if(num<min) {
				min=num;
			}
		}
		
		System.out.println("Máximo: " + max + "\n" + "Mínimo: " + min); 
		
		read.close();
	}

}
