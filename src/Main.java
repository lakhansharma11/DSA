import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		System.out.print("Enter no: ");
//		InputStreamReader r = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(r);
//		int n[] = br.read();
		
		int[] n = {1,1,1,2,2,2,3,4,5,8,16,2,14,8,9,27,12};
		int a = n.length;
		int temp=0;
//		
		OddNumber od = new OddNumber();
	 temp= od.Odd(n,a);
	for(int i =0; i< temp;i++) {
		System.out.print( n[i] +",");
				
		}
//		if (n[i]%2 == 0) {
//		System.out.println(n[i]);
//		}
//	}
//		
	}

}
