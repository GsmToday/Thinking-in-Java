package typeinfo;
class A{}
class B extends A{}
class C extends B{}

public class Ex08 {
	static void printInfo(Object obj){
		if(obj.getClass().getSuperclass() != null){
			Prt.prt(obj.getClass()+ " is a subclass of "+obj.getClass().getSuperclass());
		}
		try{
			printInfo(obj.getClass().getSuperclass().newInstance());
		}catch(InstantiationException e) {
			System.out.println("Unable to instantiate obj");
		} catch(IllegalAccessException e) {
			System.out.println("Unable to access");
		}catch(NullPointerException e){
			System.out.println("End");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C e = new C();
		printInfo(e);
	}

}
