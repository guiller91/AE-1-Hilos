package requerimiento_2_y_3;

public class Consumidor extends Thread {

	public String nombre;
	public Buffer cola;
	public Email mail;

	public Consumidor(String nombre, Buffer cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;

	}

	public void run() {
		
		do {
			mail = cola.getEmail();
			System.out.println("el " + nombre + " ha consumido el siguiente " + mail.toString());						
		} while (cola.isEmpty() == false);

	}

}
