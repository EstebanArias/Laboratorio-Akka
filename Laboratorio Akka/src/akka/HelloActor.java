package akka;

import akka.actor.UntypedActor;

public class HelloActor extends UntypedActor {
	@Override
	public void onReceive(Object message) throws Exception {
		if(message instanceof String ) {
			String s=(String)message;
			switch (s){
			case "hello":{
				System.out.println("hello you");
				break;
			}
			case "hola":{
				System.out.println("Hola Esteban");
				break;
			}
			default:
				System.out.println("Adios Esteban");
			}
		}
		else{
			unhandled(message);
		}
	}
}
