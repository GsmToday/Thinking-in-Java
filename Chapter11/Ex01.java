package holding;
import java.util.*;

class Gerbil{
	int gerbilNumber;
	Gerbil(int id){
		this.gerbilNumber = id;
	}
	void hop(){
		System.out.println(this.gerbilNumber + " gerbil is hopping");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<Gerbil> g = new ArrayList<Gerbil>();
		for(int i=0;i<3;i++){
			g.add(new Gerbil(i));
		}
		for(int i=0;i<3;i++){
			g.get(i).hop();
		}
	}

}
