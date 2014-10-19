package reusing;
/**
 * Composition with public class member
 * For code reuse
 * Chapter 7 in Thinking in Java
 * Practice 16/17
 */
class Amphibian{
	public void show()
	{
		Prt.prt("Amphibian");
	}
}
public class Frog extends Amphibian{
	// Frog 覆盖基类中的方法的定义
	public void show()
	{
		Prt.prt("frog");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian frog = new Frog();
		frog.show();
		//frog.frogshow();
	}

}
