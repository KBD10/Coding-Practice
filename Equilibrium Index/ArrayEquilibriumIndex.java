//Approach 1

public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n = arr.length;
		int leftSum = 0;
		int rightSum = 0;
		for(int i = 0; i < n; i++)
			rightSum += arr[i];
		for(int j = 0; j < n; j++){
			leftSum += arr[j];
			if(leftSum == rightSum)
				return j;
			rightSum -= arr[j];
		}
		return -1;
	}

//Approach 2

public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n = arr.length;
		int leftSum = 0;
		int rightSum = 0;
		for(int i = 0; i < n; i++)
			rightSum += arr[i];
		if(leftSum == rightSum){
			return 0;
		}

		for(int j = 0; j < n; j++){
			if(leftSum == rightSum - leftSum - arr[j]){
				return j;
			}
			leftSum += arr[j];
			
		}
		return -1;
	}
