package Arrays;

public class SelectionSort {
	public static void printArray(int []arr) {
		int n = arr.length;
		for (int i = 0 ; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void selectionSort(int []arr) {
		int n = arr.length;
		for ( int i = 0; i<n-1; i++ ) {
			// insert  element ith position 
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for ( int j = i ; j<n; j++) {
				// finding the minimun element among j positions
				if (arr[j]< min) {
					min = arr[j];
					minIndex=j;
				}
			}
			// swap  element at minIndex with ith element 
			int temp = arr[minIndex];
			arr [minIndex]= arr[i];
			arr[i]= temp;
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,6,4,8,0,3};
		selectionSort(arr);
		printArray(arr);
		
		

	}

}
