package requerimiento_1;

public class PrimeChecker extends Thread {

	private long numero;
	private long inicio;
	private long fin;
	

	public PrimeChecker(long numero) {
		this.numero = numero;
	}

	
	public void run() {
		System.out.println("Se esta iniciando el hilo: " + Thread.currentThread().getName());		
		// iniciamos una variable para saber los mili segundos
		inicio = System.currentTimeMillis();
		//Nos dira el hilo  actual y si es primo o no.
		System.out.println("El hilo : " + Thread.currentThread().getName() + " determina que " + primeNumber(numero));
		// iniciamos otra variable que nos dira en que mili segundo estamos y nos la restara de la variable inicio para saber lo que tarda.
		fin = System.currentTimeMillis();		
		// tiempo que tarda en hilo en hacer la operación
		System.out.println(calculadorTiempo(inicio,fin));;
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
	
	// Nos dira, dependiendo del tiempo tardado, su duración o en mili segundos ( si no llega al minimo de 1 segundo) o en segundos.
	public static String calculadorTiempo(long inicio, long fin) {
		long tiempo = fin - inicio;		
		if(tiempo/1000 == 0) {
			return "El "+ Thread.currentThread().getName() + " ha tardado en procesar la informacion " + tiempo + " mili segundos";
		}
		else {
			return "El "+ Thread.currentThread().getName() + " ha tardado en procesar la informacion " + (tiempo/1000) + " segundos";
		}
	}
}
