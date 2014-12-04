package holding;
import java.util.*;
class Command{
	String name;
	public void operation(){
		Prt.prt(name);
	}
}
class OfferQueue{
	private Queue<Command> queue = new LinkedList<Command>();
	public Queue addQueue(){
		queue.offer(new Command());
		return queue;
	}
}
public class Ex27 {
	public static void commandEater(Queue<Command> qc){
		while(qc.peek()!= null){
			qc.poll().operation();
		}
	}
	public static void main(String[] args) {
		 OfferQueue c = new  OfferQueue();
		commandEater(c.addQueue());
	}

}
