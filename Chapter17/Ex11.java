package containerindepth;
import generics.Prt;

import java.util.*;
class GenerateInteger implements Comparable<GenerateInteger>{
	private static final Random rand = new Random(47);
	private Integer i = rand.nextInt(101);;
	GenerateInteger(){
		Prt.prt(""+i);
	}
	public int compareTo(GenerateInteger arg){
		if(i<arg.i){
			return -1;
		}
		else if (i > arg.i){
			return 1;
		}
		return 0;
	}
	public String toString(){
		return ""+i;
	}
}
public class Ex11 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<GenerateInteger> queue = new PriorityQueue<GenerateInteger>();
		for(int i= 0;i<10;i++){
			queue.add(new GenerateInteger());
		}
		Iterator it= queue.iterator();
		GenerateInteger gi;
		while((gi = queue.poll()) != null){
			Prt.prt(""+gi);
		}
		
	}

}
