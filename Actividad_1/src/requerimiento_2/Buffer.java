package requerimiento_2;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	
	public final static int MAX_ELEMENTOS = 5;
	
	// Creamos una cola que reciba Email.
	private Queue<Email> cola = new LinkedList<>();
	
	public synchronized void addEmail(Email mail) {
		
		// Mientras la cola tenga el maximo de elementos, el hilo esperara.
		while(cola.size()== MAX_ELEMENTOS) {
			
			try {
				wait();				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		try {
			cola.offer(mail);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		notify();
	}
	
	public synchronized Email getEmail() {
		Email email = null;
		
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
	public boolean isEmpty() {
		return cola.isEmpty();
	}
	

}
