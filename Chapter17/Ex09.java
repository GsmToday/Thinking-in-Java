package containerindepth;
import java.util.*;
//��TreeSet���캯������Ƚ�����ʹ�ð�����ĸ����

public class Ex09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		ts.addAll(CollectionData.list(new RandomGenerator.String(), 10));
	}

}
