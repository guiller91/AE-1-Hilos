package requerimiento_1;

public class PrimeChecker extends Thread {

	private long numero;
	private long inicio;
	private long fin;
	private long tiempo;

	public PrimeChecker(long numero) {
		this.numero = numero;
	}

	
	public void run() {
		System.out.println("Se esta iniciando el hilo: " + Thread.currentThread().getName());
		
		
		// iniciamos una variable para saber los mili segundos
		// lo coloco aqui para que cuente realmente cuanto tarda el hilo en procesar el problema
		inicio = System.currentTimeMillis();
		//Nos dira el hilo  actual y si es primo o no.
		System.out.println("El hilo : " + Thread.currentThread().getName() + " determina que " + primeNumber(numero));
		// iniciamos otra variable que nos dira en que nano segundo estamos y nos la restara de la variable inicio para saber lo que tarda.

		fin = System.currentTimeMillis();
		tiempo = (fin - inicio)/1000;
		// tiempo que tarda en hilo en hacer la operación

		System.out.println("El "+ Thread.currentThread().getName() + " ha tardado en procesar la informacion " + tiempo + " nano segundos");

	}

	public static String primeNumber(long num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime)
			return "El número " + num + " es primo.";
		else
			return "El número " + num + " no es primo.";
	}
}
