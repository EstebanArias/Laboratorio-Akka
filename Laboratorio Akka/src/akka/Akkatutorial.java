package akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Akkatutorial {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		ActorSystem system=ActorSystem.create("Hola");
		ActorRef helloActor = system.actorOf(new Props(HelloActor.class), "hola");
		helloActor.tell("hello",null);
		helloActor.tell("hola",null);
		helloActor.tell("chao",null);
		system.shutdown();
		system.awaitTermination();//JOIN
	}
}
