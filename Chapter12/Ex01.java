package Exception;

public class Ex01 {
	public static void main(String[] args) {
		try{
			throw new Exception("ex01");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("ex01 is executed");
		}
	}
}
