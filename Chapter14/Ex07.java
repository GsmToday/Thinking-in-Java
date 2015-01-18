package typeinfo;
class Candy{
	static{
		System.out.println("Loading Candy");
	}
}

class Gum{
	static{
		System.out.println("Loading Gum");
	}
}

class Cookie{
	static{
		System.out.println("Loading Cookie");
	}
}
public class Ex07 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		for(String arg:args){
			Class.forName(arg);
		}
	}

}
