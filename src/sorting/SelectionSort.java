package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  {-10,-2,4,6,-12,0,11};
		Selection(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void Selection(int[] arr) {
		
		for(int i =0; i<arr.length;i++) {
			
			int last = arr.length -i -1;
			int max = getMax(arr, 0,last);
			swap(arr, max,last);
			
		}
		
	}
	
	static int getMax(int[] arr, int start, int last) {
		// TODO Auto-generated method stub
		
		int max = last;
		for(int i= 0; i<last; i++){
			if(arr[max]< arr[i]) {
				max = i;
			}
			
	
			
		}
		
		return max;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
		
	}

}
