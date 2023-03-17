package Test;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<String> checkDuplicate= Arrays.asList("Shyam","Shyam","Santhosh","Nidhin");
		//checkDuplicate.stream().collect(Collectors.toSet()).forEach(System.out::println);
		checkDuplicate.stream().distinct().forEach(System.out::println);
		List<Integer> checkDuplicste=Arrays.asList(1,2,3,3,1,2,5,6,7,8);
		checkDuplicste.stream().distinct().forEach(System.out::println);
	}

}
	