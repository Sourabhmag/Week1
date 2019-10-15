package finalFunctional;
import java.util.*;
public class Fun10_SumOfThreeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter array size");
	    int size = sc.nextInt();
	    System.out.println("Enter the array elements");
	    int []arr = new int[size];
	    for(int i=0;i<size;i++)
	    {
	            arr[i]=sc.nextInt();
	    }
	    int sum,count=0;
	    Arrays.sort(arr);
	    for(int i=0;i<size-1;i++)
	     {
	         for(int j=i+1;j<size;j++)
	         {
	        	 for(int k=j+1;k<size;k++)
	        	 {
	        		 if(arr[i]+arr[j]+arr[k]==0)
	        		 {
	        			 count++;
	        			 System.out.println("Triplet = "+arr[i]+" "+arr[j]+" "+arr[k]);
	        		 }
	        	 }
	         }
	     }
	     System.out.println("Total count = "+count);
	}
}
