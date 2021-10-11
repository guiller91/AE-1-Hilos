package requerimiento_2;



public class Productor extends Thread {
	
	public String nombre;
	public Buffer cola;
	public Email mail;
	
	public Productor(String nombre, Buffer cola,Email mail) {
		super();
		this.nombre = nombre;
		this.cola = cola;
		this.mail = mail;
	}
	
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("El "+ nombre + " ha cargado en el buffer el email con id: "+mail.getId());
			cola.addEmail(mail);
		}
		
	}
	
	

}
