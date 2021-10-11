package requerimiento_2;

public class Main {
	
	public static void main(String[] args) {
		
	
	Buffer cola = new Buffer();
	
	
	
	
	Email email[] = new Email[10];
	email[0]=new Email("@gmail.com", "gola", "gola", "gola");
	email[1]=new Email("@gmail.com", "gola", "gola", "gola");
	email[2]=new Email("@gmail.com", "gola", "gola", "gola");
	email[3]=new Email("@gmail.com", "gola", "gola", "gola");
	email[4]=new Email("@gmail.com", "gola", "gola", "gola");
	email[5]=new Email("@gmail.com", "gola", "gola", "gola");
	email[6]=new Email("@gmail.com", "gola", "gola", "gola");
	email[7]=new Email("@gmail.com", "gola", "gola", "gola");
	email[8]=new Email("@gmail.com", "gola", "gola", "gola");
	email[9]=new Email("@gmail.com", "gola", "gola", "gola");
	
	Email email2[] = new Email[10];
	email2[0]=new Email("@gmail.com", "gola", "gola", "gola");
	email2[1]=new Email("@gmail.com", "gola", "gola", "gola");
	email2[2]=new Email("@gmail.com", "gola", "gola", "gola");
	email2[3]=new Email("@gmail.com", "gola", "gola", "gola");
	email2[4]=new Email("@gmail.com", "gola", "gola", "gola");
	email2[5]=new Email("@gmail.com", "gola", "gola", "gola");
	email2[6]=new Email("@gmail.com", "gola", "gola", "gola");
	email2[7]=new Email("@gmail.com", "gola", "gola", "gola");
	email2[8]=new Email("@gmail.com", "gola", "gola", "gola");
	email2[9]=new Email("@gmail.com", "gola", "gola", "gola");
	
	Email email3[] = new Email[10];
	email3[0]=new Email("@gmail.com", "gola", "gola", "gola");
	email3[1]=new Email("@gmail.com", "gola", "gola", "gola");
	email3[2]=new Email("@gmail.com", "gola", "gola", "gola");
	email3[3]=new Email("@gmail.com", "gola", "gola", "gola");
	email3[4]=new Email("@gmail.com", "gola", "gola", "gola");
	email3[5]=new Email("@gmail.com", "gola", "gola", "gola");
	email3[6]=new Email("@gmail.com", "gola", "gola", "gola");
	email3[7]=new Email("@gmail.com", "gola", "gola", "gola");
	email3[8]=new Email("@gmail.com", "gola", "gola", "gola");
	email3[9]=new Email("@gmail.com", "gola", "gola", "gola");
	
	Productor p1 = new Productor("hilo 1",cola,email);
	Productor p2 = new Productor("hilo 2",cola,email2);
	Productor p3 = new Productor("hilo 3",cola,email3);
	Consumidor c1= new Consumidor("consumidor 1",cola);
	Consumidor c2= new Consumidor("consumidor 2",cola);
	


	p1.start();
	p2.start();
	p3.start();
	c1.start();
	c2.start();
	

	
	}
	
}
