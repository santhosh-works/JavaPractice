package Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllCheck {
	public static void main(String[] args) {
		List list1 = Arrays.asList(1, 2, 3, 4);
		List list2 = Arrays.asList(1, 2, 3, 4);
		Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);
		
		
		String str = "brown fox jumps over lazy dog";
		String s[]=str.split(" ");
		String rev="";
		
		for(int i=0;i<s.length;i++) {
			rev=s[i]+" "+rev;
		}
		
		System.out.println(rev);
	}
}
