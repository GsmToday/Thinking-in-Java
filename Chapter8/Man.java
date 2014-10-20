package polymorphism;
/**
 * upcasting for polymorphism 
 * Chapter 8 in Thinking in Java
 * Practice 1
 * @author GSM
 */
class Cycle{
	void ride(){
		Prt.prt("Cycle.ride");
	}
}

class Unicycle extends Cycle{
	void ride(){
		Prt.prt("Unicycle.ride");
	}
}

class Bicycle extends Cycle{
	void ride(){
		Prt.prt("Bicycle.ride");
	}
}

class Tricycle extends Cycle{
	void ride(){
		Prt.prt("Tricycle.ride");
	}
}


public class Man {
	public void f(Cycle c){
		c.ride();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle u1 = new Unicycle();
		Cycle b1 = new Bicycle();
		Cycle t1 = new Tricycle();
		Man m = new Man();
		m.f(u1);
		m.f(b1);
		m.f(t1);
		//m.f(c);	
	}
}
