package generics;

public class Holder<T> {
	private T a;
	private T b;
	private T c;
	public Holder(T a, T b, T c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public T getA(){
		return this.a;
	}
	public T getB(){
		return this.b;
	}
	public T getC(){
		return this.c;
	}
	public void setA(T a) 
	{ 
		this.a = a; 
	}
	public void setB(T b)
	{
		this.b = b; 
	}
	public void setC(T c) 
	{
		this.c = c; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
