package requerimiento_2_y_3;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

	public final static int MAX_ELEMENTOS = 5;

	// Creamos una cola que reciba Email.
	private Queue<Email> cola = new LinkedList<>();

	public synchronized void addEmail(Email mail) {

		// Mientras la cola tenga el maximo de elementos, el hilo esperara.
		while (cola.size() == MAX_ELEMENTOS) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// comprobamos que el destinatario del mail no sea pikachu y si no es pikachu
		// añadiremos el mail al buffer.
		if (mail.getDestinatario() == "pikachu@gmail.com") {
			System.out.println("¡¡AVISO!!--> El correo con ID:" + mail.getId()
					+ " no ha sido admitido debido a que su destinatario es: " + mail.getDestinatario());
		} else {
			try {
				cola.offer(mail);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// despertamos hilos
		notify();
	}

	public synchronized Email getEmail() {
		Email email = null;

		// mientras la cola este vacia, ponemos en pausa los hilos.
		while (cola.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		email = cola.poll();
		notify();

		return email;
	}

	// Devuelve true si la cola esta vacia, en caso contrario False. La usaremos
	// para controlar al hilo consumidor.
	public boolean isEmpty() {
		return cola.isEmpty();
	}

}
