/**
 * Enum
 * Chapter 5 in Thinking in Java
 * Practice 21/22
 */
package initializationandcleanup;

public class E21 {
	Cash par;
	public E21(Cash par){
		this.par = par;
	}
	public void describe(){
		Prt.prt("The cash par is: ");
		switch(par){
			case ONE: 
				Prt.prt("ONE RMB");
				break;
			case FIVE:
				Prt.prt("FIVE RMB");
				break;
			case TEN:	
				Prt.prt("TEN RMB");
				break;
			case FIFTY:
				Prt.prt("FIFTY RMB");
				break;
			case ONEHUNDRED:
				Prt.prt("ONEHUNDRED RMB");
				break;
			default:
					Prt.prt("Not exists this par");
		}
	}
	// this is practice 22
//	public static void main(String[] args) {
	//	for(Cash c : Cash.values())
		//	Prt.prt(c + ", ordinal " + c.ordinal());
	//}
	public static void main(String[] args){
		E21 e = new E21(Cash.ONE);
		e.describe();
	}
}
