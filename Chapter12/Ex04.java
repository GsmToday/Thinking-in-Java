package Exception;

class ESimpleException extends Exception{
	private String msg;
	ESimpleException(String s){
		msg = s;
	}
	public void show()
	{
		System.out.println(msg);
	}
}
public class Ex04 {
	public static void main(String[] args) {
		try{
			throw new ESimpleException("SimpleException message");
		}catch(ESimpleException e){
			//e.printStackTrace();
			System.out.println(e);
			//e.show();
		}

	}

}
