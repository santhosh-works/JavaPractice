package Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWords {
	public static void main(String[] args) {
		String str = "brown brown fox jumps over lazy dog";
		//dog lazy over jumps fox brown brown
		String rev=Arrays.stream(str.split(" "))
				.map(word-> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(str);
		System.out.println(rev);
	}
}
