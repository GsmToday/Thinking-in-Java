/*
 * practice 5
 * by GSM 11-30
 */
package holding;
import java.util.*;

public class ListFeaturesInt {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8));
		System.out.println("1 " + ints);
		//生成自动包装机制的int对象
		Integer i = new Integer(8);
		ints.add(i);
		System.out.println("2 " + ints);
		System.out.println("3 " + ints.contains(i));
		ints.remove(i);
		System.out.println("4 " + ints.contains(i));
		Integer i2 = ints.get(2);
		System.out.println("4 " + i2 +"'s index is"+ ints.indexOf(i2));
		Integer i3 = new Integer(3);
		System.out.println("5 " +  ints.indexOf(i3));
		System.out.println("6 " +  ints.remove(i3));
		System.out.println("7 " +  ints.remove(i2));
		System.out.println("8 " +  ints);
		//ints.add(2, new Integer(3));
		System.out.println("9 " +  ints);
		List<Integer> sub = ints.subList(1, 4);
		System.out.println("subList: " +  sub);
		System.out.println("10: "+ints.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sorted subList: " +  sub);
		Collections.shuffle(sub,rand);
		System.out.println("shuffed subList: " +  sub);
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		System.out.println("int: " +  ints);
		System.out.println("sub: " +  sub);
		copy.retainAll(sub);
		System.out.println("13: " +  copy);
		copy = new ArrayList<Integer>(ints);
		//copy.remove(Integer.valueOf(2));
		copy.remove(2);//结果是不一样的
		System.out.println("14: " +  copy);
		copy.removeAll(sub);
		System.out.println("15: " +  copy);
		copy.set(1, 400);
		System.out.println("16: " +  copy);
		copy.addAll(2,sub);
		System.out.println("17: " +  copy);
		System.out.println("18: " +  ints.isEmpty());
		ints.clear();
		System.out.println("19: " +  ints);
		System.out.println("20: " +  ints.isEmpty());
		ints.addAll(Arrays.asList(1,2,3,4));
		System.out.println("21: " +  ints);
		Object[] o = ints.toArray();
		System.out.println("22: " +  o[2]);
		Integer[] pa = ints.toArray(new Integer[4]);
		System.out.println("23: " +  pa[3]);
	}

}
