package Arrays;
import java.util.*;
public class Ex01 {	
	public static void test(BerylliumSphere[] sphere){
		Prt.prt(""+Arrays.toString(sphere));	
	}
	public static void main(String[] args) {
		BerylliumSphere[] sphere;
		//dynamic
		test( 
				sphere = new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()}
				);
		//aggregate
		BerylliumSphere[] a = { new BerylliumSphere(), 
				new BerylliumSphere(), new BerylliumSphere() };
		test(a);
	}

}
