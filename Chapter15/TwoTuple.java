package generics;

public class TwoTuple<A, B> {
	public final A first;
	public final B second;
	public TwoTuple(A a, B b){
		this.first = a;
		this.second = b;
	}
	public String toString(){
		return "(" + first + "," + second + ")";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
class FourTuple<A,B,C,D> extends TwoTuple<A,B>{
	public final C third;
	public final D fourth;
	
	FourTuple(A a, B b, C c, D d){
		super(a, b);
		this.third = c;
		this.fourth = d;
	}
	public String toString(){
		return "(" + this.first + "," + second + ", "+ this.third+","+this.fourth +")";
	}
}