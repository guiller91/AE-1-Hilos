package requerimiento_2_y_3;

public class Productor extends Thread {

	public String nombre;
	public Buffer cola;
	public Email mail[];

	public Productor(String nombre, Buffer cola, Email[] mail) {
		super();
		this.nombre = nombre;
		this.cola = cola;
		this.mail = mail;
	}

	public void run() {			
		// recorrera el array metiendo los mails en el buffer
		for (int i = 0; i < mail.length; i++) {
			System.out.println("El " + nombre + " ha cargado en el buffer el email con id: " + mail[i].getId());
			cola.addEmail(mail[i]);
		}

	}

}
