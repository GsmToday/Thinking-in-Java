package initializationandcleanup;
/**
 * For array initialization
 * Chapter 5 in Thinking in Java
 * Practice 18
 */
class Test{
	Test(String s){
		Prt.prt("String constructor; s = " + s);
	}
}
public class Ex18 {
	public static void main(String[] args) {	
		// ��������������
		//Test a =new  Test("I");
		Test[] array1 = new Test[]{new  Test("I"), new Test("am"), new Test("GSM")};
	}
}

