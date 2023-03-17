package Test;

import java.util.ArrayList;
import java.util.Comparator;

public class MinimumNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> listInt=new ArrayList<>();
	    listInt.add(1);
	    listInt.add(21);
	    listInt.add(3);
	    listInt.add(4);
	    listInt.add(6);
	    
	    Integer min=listInt.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("The Minimum number is: " + min);	
        
        Integer max=listInt.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("The Maximum number is: " + max);	

	}

}
