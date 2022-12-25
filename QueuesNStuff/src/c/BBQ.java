package c;

import java.util.LinkedList;
import java.util.Queue;

public class BBQ {

	public static void main(String[] args) {
		
		//poll and peek are the two main methods used in queue
//		Queue<String> bbqLine = new LinkedList<String>();
//		
//		bbqLine.add("Jackson");
//		bbqLine.add("Tyreek");
//		bbqLine.add("Susan");
//		
//		bbqLine.poll();
//		bbqLine.poll();
//		
//		System.out.println(bbqLine);
//	}
		Queue<String> q = new LinkedList<String>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		
		q.poll();
		
		System.out.println(q.contains("C"));
		System.out.println(q.poll());
		System.out.println(q.peek());
		
	}

}
