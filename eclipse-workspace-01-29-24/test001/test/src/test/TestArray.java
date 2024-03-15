package test;

public class TestArray {
	
	//private static 
	//private static Integer givenSum = 11;

	public static void main(String[] args) {
		int count = 0;
		Integer arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		int mid = arr.length/2;
		int givenSum = 11;
		for(int i = mid; i < arr.length; i++) {
			int j = i + 1;
			int tempSum = arr[i]+arr[j];
			if(tempSum == givenSum) {
				System.out.println("Count is ===>"+(++count));
			}
		}
	}

}
