package holding;
import java.util.*;
public class SimpleCollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c = new HashSet<Integer>();
		for(int i = 0;i<4;i++){
			c.add(1);
		}
		for (Integer i:c){
			System.out.println(""+i);
		}
		System.out.println(""+c.size());
	}
}
