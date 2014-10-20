/**
 * upcasting for polymorphism 
 * Chapter 8 in Thinking in Java
 * Practice 5
 * @author GSM
 */
package polymorphism;

class Cycle{
	private String name = "Cycle";
	private int wheelNum = 0;
	//call wheels()
	public void ride(){
		Prt.prt("Cycle.ride"+ wheels()+"wheels");
	}
	public int wheels()
	{	
		return wheelNum;
	}
	public String toString(){
		return name;
	}
}

class Unicycle extends Cycle{
	private String name = "Unicycle";
	private int wheelNum = 1;
	@Override
	public void ride(){
		Prt.prt("Unicycle.ride "+ wheels() + " wheels");
	}
	
	public int wheels()
	{	
		return wheelNum;
	}
	
	public String toString(){
		return this.name;
	}
}

class Bicycle extends Cycle{
	private String name = "Bicycle";
	private int wheelNum = 2;
	@Override
	public void ride(){
		Prt.prt("Bicycle.ride "+ wheels() + " wheels");
	}
	
	public int wheels()
	{	
		return wheelNum;
	}
	
	public String toString(){
		return this.name;
	}
}

class Tricycle extends Cycle{
	private String name = "Tricycle";
	private int wheelNum = 3;
	@Override
	public void ride(){
		Prt.prt("Tricycle.ride "+ wheels() + " wheels");
	}
	
	public int wheels()
	{	
		return wheelNum;
	}
	
	public String toString(){
		return this.name;
	}
}


public class Man2 {
	public static void travel(Cycle c){
		c.ride();
	}
	public static void main(String[] args) {
		
		Cycle u1 = new Unicycle();
		Cycle b1 = new Bicycle();
		Cycle t1 = new Tricycle();

		travel(u1);
		travel(b1);
		travel(t1);
	}
}
