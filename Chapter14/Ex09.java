package typeinfo;
class A1 { int i; String s; }

class B1 extends A1 { int j; float f; }

class C1 extends B1 { int k; B b;}

public class Ex09 {
	static void printInfo(Object obj){
		Object[] fields = obj.getClass().getDeclaredFields();
		if(fields.length == 0)
			Prt.prt(obj.getClass()+"has no fields");
		if(fields.length>0){
			Prt.prt("Field(s) of " + obj.getClass() + ":");
			for(Object o:fields){
				Prt.prt(""+o);
			}
		}
		//µü´ú
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
		C1 e = new C1();
		printInfo(e);
	}
}