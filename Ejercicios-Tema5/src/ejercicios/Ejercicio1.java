package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		int aleatorios [] = new int [10];
		
		for (int i = 0; i<aleatorios.length; i++) {
			aleatorios[i]= (int) (Math.random()*100+1);
			System.out.println(aleatorios[i]);
		}

	}

}
