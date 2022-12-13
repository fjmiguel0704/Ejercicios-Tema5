package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numeros;
		int tabla[] = new int [8];
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce 8 números enteros: ");
		for (int i =0; i<tabla.length; i++) {
			numeros=read.nextInt();
			tabla[i]=numeros;
		}
		
		for(int valor: tabla) {
			if(valor%2==0) {
				System.out.println(valor + " Par");
			}
			
			else {
				System.out.println(valor + " Impar");
			}
		}
		
		read.close();

	}

}
