//如果想控制如何创建对象，阻止别人直接访问某个特定的构造器。
//使用private修饰构造函数，这样其他类就不能创建该类的对象了。 
//但是怎么使用这个类？
//有两种方法
package accesscontrol;
//方法一：
class Soup1{
	private Soup1(){
	}
	
	public static Soup1 makeSoup(){
		return new Soup1();
	}
}
//方法二：
class Soup2{
	private Soup2(){
	}
	private int i;
	private static Soup2 ps1 = new Soup2();
	
	public static Soup2 access(){
		return ps1;
	}
	
	public void f(){}
}

public class Lunch {
	void testStatic(){
		Soup1 soup = Soup1.makeSoup();
	}

	void testSingleton(){
		Soup2.access().f();
	}
	public static void main(String[] args) {		
	}
}
