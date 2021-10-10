package requerimiento_2;

public class Email {
	
	private static int contador=0001;
	private int id;
	private String destinatario;
	private String remitente;
	private String asunto;
	private String mensaje;
	
	//Constructores
	public Email() {
		this.id=this.contador++;
	}	
	public  Email(String destinatario,String remitente,String asunto,String mensaje) {
		this.destinatario=destinatario;
		this.remitente=remitente;
		this.asunto=asunto;
		this.mensaje=mensaje;		
		this.id=this.contador++;
	}
	
	// Getters and setters
	public int getId() {
		return this.id;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public String getRemitente() {
		return remitente;
	}

	public String getAsunto() {
		return asunto;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
