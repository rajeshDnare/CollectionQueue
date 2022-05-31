package arrayDequeue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDequeueDemo01 {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(30);
		ad.add(40);
		ad.add(10); //add
		ad.add(20);
		ad.add(500);
		ad.add(40);
		ad.add("raj");
//		ad.add(null);
		ad.add(true);
		
		System.out.println(ad);
		
//		boolean a1=ad.offer(90); //offer
//		System.out.println(a1);
//		System.out.println(ad);
		
//		boolean a2=ad.remove(90);
//		System.out.println(a2);
		
//		ad.poll();
//		System.out.println(ad);
		
//		Object a3=ad.element();
//		System.out.println(a3);
//		System.out.println(ad);
		
//		Object a4=ad.peek();
//		System.out.println(a4);
		

	}

}
