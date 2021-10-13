package requerimiento_2_y_3;

public class Email {

	private static int acumulador = 1;
	private int id;
	private String destinatario;
	private String remitente;
	private String asunto;
	private String mensaje;

	// Constructor
	// aprovecharemos el acumulador, para dar a cada Email creado, un id único
	public Email(String destinatario, String remitente, String asunto, String mensaje) {
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.asunto = asunto;
		this.mensaje = mensaje;
		this.id = Email.acumulador++;
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

	@Override
	public String toString() {
		return "Email [id = " + id + ", destinatario = " + destinatario + ", remitente = " + remitente + ", asunto = "
				+ asunto + ", mensaje = " + mensaje + "]";
	}

}
