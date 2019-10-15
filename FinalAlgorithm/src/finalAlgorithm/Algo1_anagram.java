package finalAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
public class Algo1_anagram 
{
	 public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter strings");
	        String s1 = sc.nextLine();
	        String s2 = sc.nextLine();
	        if(s1.length()!=s2.length())
	        {
	            System.out.println("Given strings are not anagram");
	            return;
	        }
	        else
	        {
	            char []arr1=s1.toLowerCase().toCharArray();
	            char []arr2=s2.toLowerCase().toCharArray();
	            Arrays.sort(arr1);
	            Arrays.sort(arr2);
	            if(Arrays.equals(arr1,arr2))
	            {
	                System.out.println("Given strings are anagram");
	            }
	            else
	            {
	                System.out.println("Given strings are not anagram");
	            }
	        }
	    }
	    
}
