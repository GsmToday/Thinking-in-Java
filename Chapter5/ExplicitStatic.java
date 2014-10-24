package initializationandcleanup;

class Cup{
	Cup(int marker){
		Prt.prt("Cup(" + marker + ")");
	}
	void f(int marker){
		Prt.prt("f(" + marker + ")");
	}
}

class Cups {
	Cup cup3 = new Cup(3);
	static Cup cup1 = new Cup(1);
	static Cup cup2= new Cup(2);
	//static {
		//cup1;
		//cup2 = new Cup(2);
	//}
	Cups(){
		Prt.prt("Cups()");
	}
}
public class ExplicitStatic {
	//static Cups cups1 = new Cups();
	//static Cups cups2 = new Cups();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prt.prt("Inside main()");
		Cups.cup1.f(99);
	}

}
