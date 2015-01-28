package generics;

interface InterfaceOfTwoMethods{
	public void method1();	
	public void method2();
}
class ClassOne implements InterfaceOfTwoMethods{
	public void method1(){Prt.prt("method1");}	
	public void method2(){Prt.prt("method2");};	
	public void method3(){Prt.prt("method3");};
}
class Foo<T> {
	T var;
}
public class Ex20 {
	public static <T extends InterfaceOfTwoMethods> T test(T x){
		x.method1();
		x.method2();
		return x;
	}
	public static void main(String[] args) {
		ClassOne x = test(new ClassOne());
		x.method3();
	}

}
