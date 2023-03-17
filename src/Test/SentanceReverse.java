package Test;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SentanceReverse {

	public static void main(String[] args) {
		String str = "brown fox jumps over lazy dog";
		
		String s[]= str.split(" ");
		String rev="";
		for(int i=0;i<s.length;i++) {
			 rev= s[i]+" "+rev;
		}
		
		String strRev = Arrays.stream(rev.split(" "))
		.map(w-> new StringBuffer(w).reverse())
		.collect(Collectors.joining(" "));
		
		System.out.println(strRev);
	}

}
