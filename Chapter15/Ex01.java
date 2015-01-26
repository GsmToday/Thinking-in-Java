package generics;
import typeinfo.*;
import java.util.*;

class Holder3<T>{
	private T a;
	public Holder3(T a){
		this.a = a;
	}
	public void set(T a){
		this.a = a;
	}
	public T get(){
		return a;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder3<Pet> animal = new Holder3<Pet>(new Dog("wang"));
		Prt.prt(""+animal.get());
	}

}
