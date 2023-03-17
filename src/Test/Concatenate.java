package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concatenate {
	public static void main(String[] args) {
		List<Integer> firstList = Arrays.asList(1, 2, 3, 4);
		List<Integer> secondList = Arrays.asList(5, 6, 7, 8);
		Stream<Integer> merge = Stream.concat(firstList.stream(), secondList.stream());
		merge.forEach(System.out::println);
	}
}
