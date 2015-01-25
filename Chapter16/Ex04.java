package Arrays;

import java.util.Arrays;

public class Ex04 {
	public static double[][][] generateThreeDArray(int x, int y, int z, double valStart, double valEnd){
		double [][][] array = new double[x][y][z];
		double increment = (valEnd - valStart)/ (y*x*z);
		double val = valStart;
		for(int i = 0;i<array.length;i++){
			for(int j = 0;j<array[i].length;j++){
				for(int k = 0; k<array[i][j].length;k++){
					array[i][j][k] = val;
					val = val + increment;
				}
			}
		}
		return array;
	}
	public static void printArray(double[][][] array){
		for(int i = 0;i<array.length;i++){
			for(int j = 0;j<array[i].length;j++){
				for(int k = 0; k<array[i][j].length;k++){
					Prt.prt(""+array[i][j][k]);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][][] result =  generateThreeDArray(2,3,4,10.0,20.0);
		Prt.prt(Arrays.deepToString(result));
	}

}
