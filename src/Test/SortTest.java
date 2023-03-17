package Test;

import java.util.Arrays;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		List<String> name= Arrays.asList("Shyam","Santhosh","Nidhin");	
		name.stream().sorted().forEach(System.out::println);
	}
}
