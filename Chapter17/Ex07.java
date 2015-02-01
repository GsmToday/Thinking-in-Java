package containerindepth;
import generics.Prt;

import java.util.*;
public class Ex07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> llist = new LinkedList<Integer>();
		List<Integer> alist = new ArrayList<Integer>();
		
		llist.add(1);llist.add(2);llist.add(3);llist.add(4);
		alist.add(11);alist.add(22);alist.add(33);alist.add(44);
		
		Iterator lit = llist.iterator();
		Iterator ait = alist.iterator();
		
		ListIterator llit = llist.listIterator(llist.size());
		ListIterator lait = alist.listIterator();
		
		while(lit.hasNext()){
			Prt.prt(""+lit.next());
		}
		while(ait.hasNext()){
			Prt.prt(""+ait.next());
		}
		//llit.previous();
		while(llit.hasPrevious()&&lait.hasNext()){
			llit.add(lait.next());
			llit.previous();
			llit.previous();	
		}		
		
		Prt.prt(""+llist);
	}

}
