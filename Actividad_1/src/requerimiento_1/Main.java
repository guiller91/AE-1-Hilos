package requerimiento_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		int numeros[] = new int[4];

		// rellenamos el array con los numeros que queramos comprobar
		for (int i = 0; i < numeros.length; i++) {
			int contador = 4 - i;
			System.out.println("introduzca un numero. Le queda " + contador + " opciones\n");
			numeros[i] = lector.nextInt();
		}
		
		lector.close();

		// creación de hilos
		PrimeChecker hilo1 = new PrimeChecker(numeros[0]);
		PrimeChecker hilo2 = new PrimeChecker(numeros[1]);
		PrimeChecker hilo3 = new PrimeChecker(numeros[2]);
		PrimeChecker hilo4 = new PrimeChecker(numeros[3]);
		// nombramos a los hilos
		hilo1.setName("#1");
		hilo2.setName("#2");
		hilo3.setName("#3");
		hilo4.setName("#4");
		// damos comienzo a los hilos
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();

	}

}