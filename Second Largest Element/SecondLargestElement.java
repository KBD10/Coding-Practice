import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest1stApproach(int n, int[] arr) {
		// Write your code here.
		int max = 0;
		int previousMax = Integer.MIN_VALUE;
		int index = 0;
		for(int i = 1; i <= arr.length - 1; i++){
			max = Integer.MIN_VALUE;
			for(int j = 0; j <= arr.length - i; j++){
				if(arr[j] >= max){
					max = arr[j];
					index = j;
				}
			}
			if(previousMax != max && i > 1){
				return max;
			}
			else{
			int temp = arr[index];
			arr[index] = arr[arr.length - i];
			arr[arr.length - 1] = temp;
			previousMax = max;
		}
	}
	return -1;
	}

	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] != largest){
				secondLargest = arr[i];
			}
		}
		if(secondLargest == Integer.MIN_VALUE){
			return -1;
		}else{
			return secondLargest;
		}
	}
}
