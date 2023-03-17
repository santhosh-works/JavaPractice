package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthCheck {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Shyam", "Nidhin", "Santhosh");
		long num = name.stream().filter(names -> names.length() > 6).count();
		System.out.println(num);
		name.stream().filter(names->names.length()>6).collect(Collectors.toList()).forEach(System.out::println);;
	}
}
