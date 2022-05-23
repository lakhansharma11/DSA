package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1, 2, 3, 44};
		
		Bubble(arr);
		System.out.println(Arrays.toString(arr));
	
	}
 static void Bubble(int[] arr) {
		// TODO Auto-generated method stub
	 
	 boolean  swepped = false;
		for(int i=0; i<arr.length;i++) {
		
			for(int j=1; j< arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swepped = true;
				}
			}
			if(!swepped) {
				break;
			}
			
		}
		
	}
	
}
