package String;
import java.util.*;

class People{
	int age;
	double height;
	long weight;
	float x;
	String job;
	People(String attri){
		Scanner stdin = new Scanner(attri);
		age = stdin.nextInt();
		weight = stdin.nextLong();
		x = stdin.nextFloat();
		height = stdin.nextDouble();
	
		job = stdin.nextLine();
	}
	public String toString(){
		return age+"";
	}
}
public class Ex20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People Peter = new People("1 10000000000000 1.1 1e55 Howdy Hi");
		System.out.println(Peter);
	}

}
