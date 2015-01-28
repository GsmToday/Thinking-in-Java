package generics;
import gsm.*;

public class GenericMethods {
	public <Integer,Y,Z> void f(Integer x, Y y, Z z){
		Prt.prt(x.getClass().getName()+ "  " + 
				y.getClass().getName()+ "  " +
				z.getClass().getName()+ "  " );
	}
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f(1, 1, 1.0F);
	}

}
