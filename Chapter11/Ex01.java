/**
 * holding object
 * Chapter 11 in Thinking in Java
 * Practice 1/8
 */
package holding;
import java.util.*;

class Gerbil{
	int gerbilNumber;
	Gerbil(int id){
		this.gerbilNumber = id;
	}
}

public class Ex01 {
	static void hop(Iterator<Gerbil> it){
		while(it.hasNext()){
			Gerbil p = it.next();
			System.out.println(p.gerbilNumber + " gerbil is hopping");
				}	
	}
	public static void main(String[] args) {
		ArrayList<Gerbil> g = new ArrayList<Gerbil>();
		
		for(int i=0;i<5;i++){
			g.add(new Gerbil(i));
		}
		hop(g.iterator());
	}
}
