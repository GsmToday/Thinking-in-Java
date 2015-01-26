package generics;

class SixTuple<A,B,C,D,E,F> extends FourTuple<A,B,C,D>{
	public final E e;
	public final F f;
	SixTuple(A a,B b,C c,D d,E e,F f){
		super(a,b,c,d);
		this.e = e;
		this.f = f;
	}
	public String toString(){
		return "(" + this.first + "," + second + ", "+ this.third+","+this.fourth + ", " + this.e+","+this.f+")";
	}
}
public class Ex03{
	static SixTuple<Integer,Integer,Integer,Integer,Integer,String> f(){
		return new SixTuple<Integer,Integer,Integer,Integer,Integer,String>(1,2,3,4,5,"6");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SixTuple<Integer,Integer,Integer,Integer,Integer,String> six = f();
		Prt.prt(""+six);
	}

}
