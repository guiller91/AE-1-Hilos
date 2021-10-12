package requerimiento_2_y_3;

public class Main {
	
	public static void main(String[] args) {
		
	//creamos la cola
	Buffer cola = new Buffer();
	
	//creamos los emails
	Email email[] = new Email[10];
	email[0]=new Email("menganito1@gmail.com", "inventado1@hotmail.com", "Lorem", "Lorem ipsum dolor sit amet");
	email[1]=new Email("menganito2@gmail.com", "inventado2@hotmail.com", "ipsum", " consectetur adipiscing elit");
	email[2]=new Email("pikachu@gmail.com", "inventado3@hotmail.com", "Dolor", "Cras nisl magna");
	email[3]=new Email("menganito4@gmail.com", "inventado4@hotmail.com", "Sit", "pretium laoreet turpis nec");
	email[4]=new Email("menganito5@gmail.com", "inventado5@hotmail.com", "amet", "consequat venenatis neque");
	email[5]=new Email("menganito6@gmail.com", "inventado6@hotmail.com", "consectetur", "Donec a sapien fermentum");
	email[6]=new Email("pikachu@gmail.com", "inventado7@hotmail.com", "adipiscing", "erat accumsan commodo in et lorem");
	email[7]=new Email("menganito8@gmail.com", "inventado8@hotmail.com", "elit ", "Mauris sed magna massa");
	email[8]=new Email("menganito9@gmail.com", "inventado9@hotmail.com", "Maecenas", "Duis vel lectus mattis");
	email[9]=new Email("menganito10@gmail.com", "inventado10@hotmail.com", "blandit", "tempus elit non");
	
	Email email2[] = new Email[10];
	email2[0]=new Email("fulanito1@gmail.com", "invent1@yahoo.es", "ligula", "fringilla mauris");
	email2[1]=new Email("fulanito2@gmail.com", "invent2@yahoo.es", "a", "Curabitur elementum dui");
	email2[2]=new Email("fulanito3@gmail.com", "invent3@yahoo.es", "quam", "sed urna fringilla rhoncus");
	email2[3]=new Email("fulanito4@gmail.com", "invent4@yahoo.es", "ornare", "Sed urna tellus");
	email2[4]=new Email("fulanito5@gmail.com", "invent5@yahoo.es", "sit", "fringilla non metus non");
	email2[5]=new Email("fulanito6@gmail.com", "invent6@yahoo.es", "amet", "tincidunt iaculis magna");
	email2[6]=new Email("pikachu@gmail.com", "invent7@yahoo.es", "sodales", "Morbi ut lorem velit");
	email2[7]=new Email("fulanito8@gmail.com", "invent8@yahoo.es", "massa", "Sed imperdiet lacus eros");
	email2[8]=new Email("fulanito9@gmail.com", "invent9@yahoo.es", "consectetur", "non hendrerit sem fermentum non");
	email2[9]=new Email("fulanito10@gmail.com", "invent10@yahoo.es", "sed", "Vivamus rhoncus vitae tortor in rhoncus");
	
	Email email3[] = new Email[10];
	email3[0]=new Email("manolito1@gmail.com", "itt1@gmail.com", "fringilla", "Nunc porta venenatis nulla sit amet efficitur");
	email3[1]=new Email("manolito2@gmail.com", "itt2@gmail.com", "hendrerit", "Vivamus at ullamcorper felis");
	email3[2]=new Email("manolito3@gmail.com", "itt3@gmail.com", "diam", "Suspendisse volutpat porta ultricies");
	email3[3]=new Email("manolito4@gmail.com", "itt4@gmail.com", "sed", "Fusce ut laoreet eros, eu scelerisque ipsum");
	email3[4]=new Email("manolito5@gmail.com", "itt5@gmail.com", "luctus", "Vivamus vel porttitor lorem");
	email3[5]=new Email("manolito6@gmail.com", "itt6@gmail.com", "libero", "Nulla id ex ullamcorper");
	email3[6]=new Email("manolito7@gmail.com", "itt7@gmail.com", "tristique", "volutpat ligula ac");
	email3[7]=new Email("pikachu@gmail.com", "itt8@gmail.com", "in", "varius odio");
	email3[8]=new Email("manolito9@gmail.com", "itt9@gmail.com", "nunc", "Sed et orci gravida");
	email3[9]=new Email("manolito10@gmail.com", "itt10@gmail.com", "at", "gravida est sed");
	
	//creamos hilos
	Productor p1 = new Productor("hilo 1",cola,email);
	Productor p2 = new Productor("hilo 2",cola,email2);
	Productor p3 = new Productor("hilo 3",cola,email3);
	Consumidor c1= new Consumidor("consumidor 1",cola);
	Consumidor c2= new Consumidor("consumidor 2",cola);
	

	//iniciamos hilos
	p1.start();
	p2.start();
	p3.start();
	c1.start();
	c2.start();
	

	
	}
	
}
