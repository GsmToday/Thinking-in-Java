package holding;
import java.util.*;
public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v){
		storage.addFirst(v);
	}
	public T peek(){
		return storage.getFirst();
	}
	public T pop(){
		//System.out.println("pop");
		return storage.removeFirst();
		
	}
	public boolean empty(){
		return storage.isEmpty();
	}
	public static void main(String[] args) {

	}

}
