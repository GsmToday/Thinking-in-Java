package Arrays;
import java.util.*;

public class Ex02 {
	public static BerylliumSphere[] test(int N){
		BerylliumSphere[] results = new BerylliumSphere[N];
		for(int i= 0;i<N;i++){
			results[i] = new BerylliumSphere();
		}
		return results;
	}
	public static void main(String[] args) {
		Prt.prt(""+Arrays.toString(test(5)));
	}
}
