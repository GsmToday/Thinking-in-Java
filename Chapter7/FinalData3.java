/** The protected keyword
 * Composition for code reuse
 * Chapter 7 in Thinking in Java
 * Practice 19
 */
package reusing;

public class FinalData3 {

	//Blank final reference
	private final int value;
	FinalData3()
	{
		value = 10;
	}
	FinalData3(int value)
	{
		this.value = value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalData3 fd1 = new FinalData3();
		//fd1.value = 12;
		FinalData3 fd2 = new FinalData3(100);
		//fd2.value = 12;
	}

}
