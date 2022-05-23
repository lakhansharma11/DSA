package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 25, 8, 0,77777, 14, -95, 15};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	
	static void insertion(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			
			for(int j=i+1 ; j>0; j-- ) {
				
				if(arr[j]<arr[j-1]) {
					SelectionSort.swap(arr, j, j-1);
				}
				
			}
				
		
		}
	}

}
