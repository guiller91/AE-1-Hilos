##Requerimiento 1

Realiza un programa en Java que pida 4 n�meros por pantalla y determinar� cu�l de ellos es primo y cual no. El programa lanzar� un hilo de ejecuci�n por cada n�mero, debido a la complejidad de tiempo que puede llevar el calcular si es primo o no, para que pueda ejecutarse en paralelo.

Cada vez que un hilo acabe, mostrar� por pantalla el numero procesado, el nombre del hilo que lo ha procesado, el tiempo que ha tardado en procesar el n�mero y si es primo o no.

Se valorar� si toda la informaci�n que se vaya a mostrar esta encapsulada en un objeto.



##Requerimiento 2

Realiza un programa en Java que gener� una simulaci�n de una cadena de procesamiento de correos electr�nicos o emails. Los emails tendr�n un id, un destinatario, un remitente, un asunto y un cuerpo del mensaje.

Las cartas de correo no se quieren enviar directamente a los destinatarios ya que se quiere registrar cuantos correos se mandan en determinadas franjas horarias. Por lo tanto, las cartas se depositar�n en un buffer que tendr� una capacidad de 5 cartas como m�ximo, por temas de espacio de memoria.

Por otro lado, habr� 3 hilos que producir�n 10 emails cada uno, cada uno de ellos tendr� un destinatario, un remitente, un asunto y un cuerpo de mensaje diferente, e ir�n poniendo los emails en el buffer cada 0,5 segundos, imprimiendo por pantalla cada vez que meta dicho mail en el buffer su nombre y el id del email metido.

Del mismo modo, habr� 2 hilos que consuman los emails del buffer siempre que haya email disponible. Cada vez que un consumidor coja un email, simular� su envio simplemente imprimiendo por pantalla los datos del email, as� como el nombre del hilo consumidor que ha cogido dicho email.



##Requerimiento 3

Queremos ampliar el requerimiento 2. En nuestra empresa queremos evitar que se env�en mails a pikachu@gmail.com, por lo que no se deben meter en el buffer aquellos email lo tengan como destinatario. Se deber� imprimir por pantalla cada vez que hagamos este descarte. Nota: Esta l�gica ir� dentro del buffer de procesamiento de emails, no de los productores o los consumidores.