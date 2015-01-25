package Arrays;
import java.util.*;

public class Ex06 {
	public static BerylliumSphere[][] test(int x, int y){
		BerylliumSphere[][] array = new BerylliumSphere[x][y];
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				array[i][j] = new BerylliumSphere();
			return array;
	}
	public static void main(String[] args) {
		Prt.prt(Arrays.deepToString(test(3,3)));
	}

}
