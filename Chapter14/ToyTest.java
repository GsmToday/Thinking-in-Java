package typeinfo;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
interface NewaddInfer{}

class Toy{
	Toy(){}
	Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Waterproof, Shoots,NewaddInfer
{
	FancyToy(){
		super(1);
		}
}

public class ToyTest {
	static void printInfo(Class cc){
		//返回Class对象引用，以及判断是不是interface
		System.out.println(" Class name: " + cc.getName() + " is interface?[ " + cc.isInterface()+" ] " );
		//返回类名
		System.out.println(" Simple name "+cc.getSimpleName());
		System.out.println(" Canonical name "+cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try{
			c = Class.forName("typeinfo.FancyToy");
		}catch(ClassNotFoundException e){
			System.out.println(" Cannot find Fancy toy ");
			//System.exit(1);
		}
		printInfo(c);
		//System.out.println(c.getInterfaces());
		for(Class face : c.getInterfaces()){
			System.out.println("about interface:  \n");
			printInfo(face);
		}
		//父类
		Class up = c.getSuperclass();
		System.out.println("\n");
		printInfo(up);
		//创建虚拟实例
		Object obj = null;
		try{
			System.out.println("\n creating new instance");
			obj = up.newInstance();
		}catch(InstantiationException e){
			System.out.println("cannot instantiate");
		}catch(IllegalAccessException e){
			System.out.println("cannot access");
		}
		
		printInfo(obj.getClass());
	}
}
