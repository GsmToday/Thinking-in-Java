package generics;
import java.util.*;
public class New {
	public static <K,V> Map<K,V>  map(){
		return new HashMap<K,V>();
	}
	
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> lList(){
		return new LinkedList<T>();
	}
	
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	
	public static <T> Queue<T> queue(){
		return new LinkedList<T>();
	}
	public static void main(String[] args) {
		List<SixTuple<Byte,Short,String,Float,Double,Integer>> list = New.list();
		list.add(
				new SixTuple<Byte,Short,String,Float,Double,Integer>(
				(byte)1, (short)1, "A", 1.0F, 1.0, 1));
		Prt.prt(""+list);

	}

}
