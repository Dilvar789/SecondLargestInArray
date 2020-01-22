
import java.util.*;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter size of the array: ");
		int n=s.nextInt();
		System.out.println("enter elements: ");
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		Arrays.sort(ar);
	    System.out.println("Largest: "+ar[n-1]);
	    System.out.println("Second Largest: "+ar[n-2]);
	    s.close();
	}
}
