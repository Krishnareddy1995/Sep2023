package collections;

import java.util.*;



public class List1 {

	public static void main(String[] args) {
		LinkedList<String> al1=new LinkedList<>();
		al1.add("Red");
		al1.add("White");
		al1.add("Blue");
		al1.add("Green");
		
		
		al1.add(0,"Suziki");
		
		LinkedList<String> al2=new LinkedList<>();	
		al2.add("Dog");
		al2.add("Fox");
		al2.add("Lion");
		
		al1.offerFirst("Toyota");
		al1.add(0,"Atlas");
		
		LinkedList<String> al3=new LinkedList<>();
		
		al1.addAll(al2);
		
		
		for(String ss:al1) {
			
			al3.add(ss);
		}
		
		System.out.println(al3);
		
		Iterator p=al3.listIterator();
		
		for(int i=0;i<=al3.size()-1;i++) {
			
			System.out.println(i + " "+al3.get(i));
			
		}
		
	
		
	}

}
