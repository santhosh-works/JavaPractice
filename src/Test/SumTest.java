package Test;

import java.util.Arrays;
import java.util.List;

public class SumTest {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4,5);
		int sum=nums.stream().mapToInt(Integer::intValue).sum();
		System.out.print(sum);
	}
}
