package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		int aleatorios [] = new int [10];
		
		for (int i = 0; i<aleatorios.length; i++) {
			aleatorios[i]= (int) (Math.random()*100+1);
			System.out.println(aleatorios[i]);
		}
		
		int  sumaAleatorios = 0;
		for (int  suma: aleatorios) {
			sumaAleatorios+=suma;
		}
		
		System.out.println();
		System.out.println("La suma de los números aleatorios generados es de: " + sumaAleatorios);

	}

}
