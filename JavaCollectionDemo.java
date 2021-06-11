package javashowcase.Day12Collections;

import java.util.*;

public class JavaCollectionDemo {

	public static void main(String[] args) {
		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo();
	}
	
 	private static void doListDemo() {
 		System.out.println("In doListDemo");
 		//Creating List
 		List<String> list = new LinkedList<String>();
 		//Adding object to the list
 		list.add("Ravi");
 		list.add("Ravi");
 		list.add("vijay");
 		list.add("Ajay");
 		
 		//Traversing list through Iterator
 		Iterator iterator = list.iterator();
 		while(iterator.hasNext()) {
 			System.out.println(iterator.next());
 		}
 	}
 	
 	private static void doStackDemo() {
 		System.out.println("\nIn doStackDemo");
 		Stack<String> stack = new Stack<>();
 		stack.push( "Ayush");
 		stack.push( "Govind");
 		stack.push( "Amit");
 		stack.push( "Anita");
 		stack.push( "Avinash");
 		String popString = stack.pop();
 		Iterator<String> iterator = stack.iterator();
 		while(iterator.hasNext()) {
 			System.out.println(iterator.next());
 		} 		
 	}
 	
 	private static void doQueueDemo() {
 		System.out.println("\nIn doQueueDemo");
 		PriorityQueue<String> queue = new PriorityQueue<>();
 		queue.add("Ravi");
 		queue.add("Rani");
 		queue.add("Ravi");
 		queue.add("sham");
 		System.out.println("head: " + queue.element());
 		System.out.println("head: " + queue.peek());
 		System.out.println("iterating the queue elements:");
 		Iterator iterator = queue.iterator();
 		while(iterator.hasNext()) {
 			System.out.println(iterator.next());
 		}
 		queue.remove();
 		queue.poll();
 		System.out.println("After removing two elements: ");
 		Iterator<String> itr2 = queue.iterator();
 		while(itr2.hasNext()) {
 			System.out.println(itr2.next());
 		}
 	}
 	
 	private static void doSetDemo() {
 		System.out.println("In doSetDemo");
 		Set<String> set = new LinkedHashSet<>();
 		set.add("Amit");
 		set.add("Amit");
 		set.add("Rahul");
 		for(String str : set) {
 			System.out.println(str);
 		}
 		}
 	
 	private static void doMapDemo() {
 		System.out.println("\nIn doMapDemo");
 		Map<Integer, String> map = new HashMap<>();
 		map.put(100, "Amit");
 		map.put(102, "Vijay");
 		map.put(102, "Rahul");
 		//Elements can travers in any order
 		for(Map.Entry m:map.entrySet()) {
 			System.out.println(m.getKey() + " " + m.getValue());
 		}
 	}
 	
}