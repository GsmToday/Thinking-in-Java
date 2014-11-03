/**
 * For interface,
 * interface can inherit interfaces
 * Chapter 9 in Thinking in Java
 * Practice 14/15
 */
package interface9;

interface interface1{
	void f01();
	void g01();
}
interface interface2{
	void f02();
	void g02();
}
interface interface3{
	void f03();
	void g03();
}

interface derivedInterface extends interface1,interface2,interface3{
	void defivedF();
}

abstract class ConcreteClass{
	String s;
	public ConcreteClass(String s){
		this.s = s;
	}
	abstract void f_con();
}

class DerivedClass extends ConcreteClass implements derivedInterface{
	DerivedClass(){
		super("Derived Class");
	}
	public void defivedF(){
	}
	public void f01(){};
	public void g01(){};
	public void f02(){};
	public void g02(){};
	public void f03(){};
	public void g03(){};
	public void f_con(){
		Prt.prt("abstractclass");
	};
}

public class Ex14 {
    static void fun01(interface1 i){
    	
    }
    
    static void fun02(interface2 i){
    	
    }
    
    static void fun03(interface3 i){
    	
    }
    
    static void fun04(derivedInterface i){
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass e = new DerivedClass();
		e.f_con();
		fun01(e);
		fun02(e);
		fun03(e);
		fun04(e);	
	}

}
