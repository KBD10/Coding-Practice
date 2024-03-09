//Problem Statement :- https://www.codingninjas.com/studio/problems/rotate-array_1230543

public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int[] arr = new int[size];
			for(int i = 0; i < size; i++)
				arr[i] = sc.nextInt();
			int k = sc.nextInt();
			int[] newarr = new int[size];
			int breakRange = k - size;
			int i = 0;
			while(k > breakRange){
				newarr[(size - k) % size] = arr[i];
				i++;
				k--;
			}
			for(int j = 0; j < size - 1; j++)
				System.out.print(newarr[j] + " ");
			System.out.print(newarr[size - 1]);
			
		
	}
