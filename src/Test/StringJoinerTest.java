package Test;

import java.util.StringJoiner;

public class StringJoinerTest {
	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",", "#", "#");
		stringJoiner.add("Interview");
		stringJoiner.add("Questions");
		stringJoiner.add("Answers");
		System.out.println("String after adding # in suffix and prefix :");
		System.out.println(stringJoiner);
	}
}
