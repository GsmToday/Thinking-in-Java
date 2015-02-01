package containerindepth;
import java.util.*;
//给TreeSet构造函数传入比较器，使得按照字母排序

public class Ex09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		ts.addAll(CollectionData.list(new RandomGenerator.String(), 10));
	}

}
