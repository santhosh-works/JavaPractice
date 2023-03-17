package Test;

import java.util.Arrays;
import java.util.Optional;

public class CharCheck {
	public static void main(String[] args) {
		char array[][]= {{'a','b','c','d'},{'e','f','g','h'}};
		char find='w';
		boolean found = Arrays.stream(array)
		.flatMapToInt(i->new String(i).chars())
		.anyMatch(c-> c==find)
		;
		
		if(found) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not present");
		}
	}
}
