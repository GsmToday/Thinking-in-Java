package Arrays;
import java.util.*;

public class Ex03 {
	public static double[][] generateTwoDArray(int x, int y, double valStart, double valEnd){
		double [][] array = new double[x][y];
		double increment = (valEnd - valStart)/ (y*x);
		double val = valStart;
		for(int i = 0;i<array.length;i++){
			for(int j = 0;j<array[i].length;j++){
				array[i][j] = val;
				val = val + increment;
			}
		}
		return array;
	}
	public static void printArray(double[][] array){
		for(int i = 0;i<array.length;i++){
			for(int j = 0;j<array[i].length;j++){
				Prt.prt(""+array[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] result =  generateTwoDArray(2,3,10.0,20.0);
		Prt.prt(Arrays.deepToString(result));
		double[][] result2 =  generateTwoDArray(3,4,100.0,200.0);
		Prt.prt(Arrays.deepToString(result2));
	}
}
