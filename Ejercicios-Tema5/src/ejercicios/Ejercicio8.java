package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		int numAleatorios = 0, alCuadrado, alCubo;
		
		System.out.println("Números aleatorios generados: ");
		
		int numeros[]=new int [20];
		for (int i = 0; i<numeros.length; i++) {
			numAleatorios=(int)(Math.random()*100);
			numeros[i]=numAleatorios;
		}
		
		for (int valores: numeros) {
			System.out.println(valores);
		}
		
		System.out.println();
		System.out.println("Resultados de números aleatorios al cuadrado: ");
		
		int cuadrados[]=new int [20];
		for (int i = 0;i<cuadrados.length; i++) {
			alCuadrado= (int) Math.pow(numeros[i], 2);
			cuadrados[i]=alCuadrado;
		}
		
		for (int valores: cuadrados) {
			System.out.println(valores);
		}
		
		System.out.println();
		System.out.println("Resultados de números aleatorios al cubo: ");
		
		int cubos[]=new int [20];
		for(int i = 0; i<cubos.length; i++) {
			alCubo=(int)Math.pow(numeros[i], 3);
			cubos[i]=alCubo;
		}
		
		for (int valores: cubos) {
			System.out.println(valores);
		}
	}

}
