package collections;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		
		String ss="singaveerareddy";
		
		HashMap <Character,Integer> ap=new HashMap<>();
		char[] ch=ss.toCharArray();
		
		for(char c: ch) {
			
			if(ap.containsKey(c)) {
				
				ap.put(c, ap.get(c)+1);
				
			}else {
				
				ap.put(c, 1);
			}
			
			
			
		}
		
		System.out.println(ap);
		
	}

}
