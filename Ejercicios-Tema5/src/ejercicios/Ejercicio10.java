package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		int aleatorios, numero, posicion;
		int numAleatorios[]=new int [100];
		
		for (int i = 0; i<numAleatorios.length; i++) {
			aleatorios= (int)(1+Math.random()*10);
			numAleatorios[i]=aleatorios;
			System.out.println(aleatorios + " -> posición [" + i + "]");
		}
		
		System.out.println();
		System.out.println("Introduce un número: ");
		numero=read.nextInt();
		System.out.println();
		System.out.println("El número " + numero + " se encuentra en las siguientes posiciones: ");
		
		for (int i = 0; i<numAleatorios.length; i++) {
			if (numero==numAleatorios[i]) {
				posicion=i; 
				System.out.println(posicion);
			}
		}
		

	}

}