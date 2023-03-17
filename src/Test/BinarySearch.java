package Test;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		System.out.println(search(a, 5));
	}

	public static int search(int a[], int searchNumber) {

		int firstPosition, lastPosition, middlePosition, searchPositiopn;

		firstPosition = 0;
		lastPosition = a.length-1 ;
		
		while (firstPosition <= lastPosition) {
			middlePosition = (firstPosition + lastPosition) / 2;
			if (a[middlePosition] == searchNumber) {
				return middlePosition;
			} else if (a[middlePosition] > searchNumber) {
				lastPosition = lastPosition - 1;
			} else {
				firstPosition = middlePosition + 1;
			}

		}
		return -1;
	}
}
