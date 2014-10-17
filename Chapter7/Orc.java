package reusing;
/** The protected keyword
 * Composition for code reuse
 * Chapter 7 in Thinking in Java
 * Practice 15
 */

class Villain{
	private String name;
	//Note here
	protected void set(String num){
		name = num;
	}
	public String toString(){
		return "I am a Villain and my name is " + name;
	}
}

public class Orc extends Villain{
	private int orcNumber;
	
	public Orc(String name, int orcNumber){
		set(name);//Note here, it is available as protected
		this.orcNumber = orcNumber;
	}
	
	public void change(String name, int orcNumber){
		set(name);//Note here, it is available as protected
		this.orcNumber = orcNumber;
	}
	
	public String toString(){
		return "Orc" + orcNumber + ":"+super.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orc orc = new Orc("Limbuger",12);
		orc.set("GaoShimeng"); //invoke the protected base method;
		Prt.prt(orc.toString());
		orc.change("Bob", 19);
		Prt.prt(orc.toString());
	}

}
