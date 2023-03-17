package Test;

public class FactorialTrailingZeroMain {

//    public static void main(String[] args)
//    {
//    		int num=29, count=1;
//    		for(int i=5; num> i*5; i=i*5) {
//    			
//    			int x=num/i;
//    			count=count+x;
//    		}
//       System.out.println(count);
//    }

	public static void main(String[] args) {
		FactorialTrailingZeroMain ftzm = new FactorialTrailingZeroMain();
		int countFactorialTrailingZeros = ftzm.countFactorialTrailingZeros(29);

		System.out.println("Factorial trailing zeroes for 29: " + countFactorialTrailingZeros);
	}

	public int countFactorialTrailingZeros(int num) {
		int countOfZeros = 0;
		if (num < 0)
			return -1;
		for (int i = 5; num / i > 0; i *= 5) {
			countOfZeros += num / i;
		}
		return countOfZeros;
	}

}