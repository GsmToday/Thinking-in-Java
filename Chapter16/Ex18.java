//拷贝对象数组
package Arrays;
import java.util.*;
import java.lang.reflect.*;

public class Ex18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] sphere =  { new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere()};
		BerylliumSphere[] target = new BerylliumSphere[3];
		System.arraycopy(sphere, 0, target, 0 , sphere.length);
		Prt.prt("sphere = "+Arrays.toString(sphere));
		Prt.prt("target = "+Arrays.toString(target));
	}

}
