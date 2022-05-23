
public class OddNumber {
		
	
	public int Odd(int a[],int n) {

        // if(array size if 0 or 1 array is already sorted)
		/*
		 * if (n == 0 || n == 1) { return n; }
		 */
        int j = 0;
  
 
        for (int i = 0; i < n; i++) {
            if (a[i] %2 != 0) {
                a[j++] = a[i];
            }
        }
  
       
  
        return j;
        }

	

}
