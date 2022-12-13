package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		int numAleatorios;
		int numeros[]=new int [20];
		
		for (int i = 0; i<numeros.length; i++) {
			numAleatorios=(int)(Math.random()*100);
			numeros[i]=numAleatorios;
		}
		
		for (int valores: numeros) {
			System.out.println(valores);
		}
		
		int cuadrados[]=new int [20];
		
		int cubos[]=new int [20];

	}

}
