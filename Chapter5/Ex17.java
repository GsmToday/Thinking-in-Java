package initializationandcleanup;
/**
 * For array initialization
 * Chapter 5 in Thinking in Java
 * Practice 17
 */
class Test{
	Test(String s){
		Prt.prt("String constructor; s = " + s);
	}
}
public class Ex17 {
	public static void main(String[] args) {	
		// 类对象的引用数组
		Test[] array1 = new Test[5];
	}
}
//结果不会输出string constructor构造器语句
// 因为只创建了数组，并没有创建类的对象
