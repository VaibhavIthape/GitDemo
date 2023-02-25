package Program_Interview_2023;

public class FindTheMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
		 
		 int n = arr.length + 1; // The number of elements in the original array
	        int sum = n * (n + 1) / 2; // The sum of all elements in the original array
	        int actualSum = 0; // The sum of all elements in the given array

	        for (int i = 0; i < arr.length; i++) {
	            actualSum += arr[i]; // Add each element in the given array to actualSum
	        }

	        int missingElement = sum - actualSum; // The missing element is the difference between the sum and actualSum

	        
  	}

}
