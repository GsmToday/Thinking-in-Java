//数组越界arrayindexoutofbounds
package Exception;

public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = new char[10];
		try{
			for(int i = 0; i<20;i++){
				array[i] = 'a';
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
