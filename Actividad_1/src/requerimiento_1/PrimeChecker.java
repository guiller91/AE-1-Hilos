package requerimiento_1;

public class PrimeChecker extends Thread {

	private int numero;
	private long inicio;
	private long fin;
	private long tiempo;

	public PrimeChecker(int numero) {
		this.numero = numero;
	}

	@Override
	public void run() {
		System.out.println("Se esta iniciando el hilo: " + Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// iniciamos una variable para saber los nano segundos
		inicio = System.nanoTime();
		//Nos dira el hilo  actual y si es primo o no.
		System.out.println("El hilo : " + Thread.currentThread().getName() + " determina que " + primeNumber(numero));
		// iniciamos otra variable que nos dira en que nano segundo estamos y nos la restara de la variable inicio para saber lo que tarda.
		fin = System.nanoTime();
		tiempo = fin - inicio;
		// tiempo que tarda en hilo en hacer la operación
		System.out.println("El "+ Thread.currentThread().getName() + " ha tardado en procesar la información " + tiempo + " nano segundos");
	}

	public static String primeNumber(int num) {
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