package Test;

import java.util.Arrays;
import java.util.List;

public class StreamIteration {

	public static void main(String[] args) {
        List<String> str = Arrays.asList("Hello","Interview","Questions","Answers");
        str.stream().forEach(System.out::println);
       
	}

}
