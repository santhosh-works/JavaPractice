package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Frequency {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("B", "A", "A", "C", "B", "A");
		Set<String> distinct = new HashSet<>(list);	
		
		for(String s:distinct) {
			System.out.println(s + ": " + Collections.frequency(list, s));
		}
		System.out.println("_________________");
		
		List<Integer> listnew=Arrays.asList(1,2,3,3,3,4,4,5,5);
		
		Set<Integer> check=new HashSet<>(listnew);
		for(Integer i : check) {
			System.out.println(i + ": " + Collections.frequency(listnew,i));
		}
		
		System.out.println("_________________");
		Map<String,Integer> test=new HashMap<>();
		
		for(String s: list) {
			
			Integer count=test.get(s);
			if(count==null) {
				count=0;
			}
			test.put(s, count+1);
		}
		 for (Map.Entry<String, Integer> entry: test.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	}

}
