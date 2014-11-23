/**
 * Inner class
 * Chapter 10 in Thinking in Java
 * Practice 16
 * Anonymous inner class
 */
package Innerclass;
//产品
interface Cycle{
	void ride();
}
//工厂
interface CycleFactory{
	Cycle createCycle();
}
//产品
class Unicycle implements Cycle{
	private Unicycle(){}
	public void ride(){
		Prt.prt("Ride Unicycle");
	}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle createCycle(){
			return new Unicycle();
		}
	};
}
//产品
class Bicycle implements Cycle{
	private Bicycle(){}
	public void ride(){
		Prt.prt("Ride Bicycle");
	}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle createCycle(){
			return new Bicycle();
		}
	};
}
//产品
class Tricycle implements Cycle{
	private Tricycle(){};
	public void ride(){
		Prt.prt("Ride Tricycle");
	}
	//工厂内部类对象
	public static CycleFactory factory = new CycleFactory(){
		public Cycle createCycle(){
			return new Tricycle();
		}
	};
}



//一个统一的工厂类，负责创建product对象
/*class Factory implements CycleFactory{
	private Cycle i ;
	private Factory(Cycle i){
		this.i = i;
	}
	public Cycle createCycle(){
		return  i;
	}
}*/

public class Ex18 {
	/*
	public static void createCycle(CycleFactory cf){
		Cycle c = cf.createCycle();
		c.ride();
		
	}
	public static void main(String[] args) {
		createCycle(new Factory(new Bicycle()));
		createCycle(new Factory(new Unicycle()));
		createCycle(new Factory(new Tricycle()));
		
	}*/
	public static void serviceConsumer(CycleFactory fact){
		Cycle c = fact.createCycle();
		c.ride();
	}
	public static void main(String[] args) {
		serviceConsumer(Unicycle.factory);
		serviceConsumer(Bicycle.factory);
		serviceConsumer(Tricycle.factory);
	}
}
