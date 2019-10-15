package finalAlgorithm;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Algo4 
{
	public String []bubbleSort(String []str)
	{
		long start_time_bubble = 0;
    	start_time_bubble = System.currentTimeMillis();
		long end_time_bubble = 0;
		long cal_time_bubble ;
		String temp;
		for (int j = 0; j < str.length; j++) 
		{
	   	   for (int i = j + 1; i < str.length; i++) 
	   	   {
	   		   if (str[i].compareTo(str[j]) < 0) 
	   		   {
				temp = str[j];
				str[j] = str[i];
				str[i] = temp;
	   		   }
		   }
		}
		end_time_bubble = System.currentTimeMillis();
        System.out.println("Bubble time string = "+((end_time_bubble-start_time_bubble)/1000));
		return str;
	}
	public String []insertionSort(String []array,int f)
	{
		long start_time_insertion = 0;
		 start_time_insertion = System.currentTimeMillis();
		long end_time_insertion = 0;
		long cal_time_insertion ;
		String temp="";
		for(int i=0;i<f;i++)
		{
			for(int j=i+1;j<f;j++)	
			{
				if(array[i].compareToIgnoreCase(array[j])>0)
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		end_time_insertion = System.currentTimeMillis();
        System.out.println("insertion time string= "+((end_time_insertion-start_time_insertion)/1000));

		return array;
	}
	public int []insertionSortint(int []arr)
    {
		long start_time_insertion = 0;
		 start_time_insertion = System.currentTimeMillis();
		long end_time_insertion = 0;
		long cal_time_insertion ;
        int size = arr.length;
        for(int i=1;i<size;++i)
        {
            int key = arr[i];
            int j= i-1;
            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
        }
        end_time_insertion = System.currentTimeMillis();
        System.out.println("insertion time int= "+((end_time_insertion-start_time_insertion)/1000));
        return arr;
    }
    public void binarySearchint(int []arr,int key)
    {
        arr = insertionSortint(arr);
        int ray = arr.length;
        int search = ray/2;
        if(arr[search]==key)
        {
            System.out.println("\n"+key+" found in array");
            return;
        }
        else
        {
            if(key<arr[search])
            {
                binarySearchint(Arrays.copyOfRange(arr, 0, search-1),key);
            }
            else
            {
                binarySearchint(Arrays.copyOfRange(arr,search+1,ray-1),key);
            }
        }
    }
    public int []bubbleSortint(int []arr,int size)
    {
    	long start_time_bubble = 0;
    	start_time_bubble = System.currentTimeMillis();
		long end_time_bubble = 0;
		long cal_time_bubble ;
       // int size = arr.length;
        if(size==1) return arr;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }   
            arr=bubbleSortint(arr,size-1);
            end_time_bubble = System.currentTimeMillis();
            System.out.println("Bubble time int= "+((end_time_bubble-start_time_bubble)));
           return arr;
    }
    public void print(int []arr)
    {
        int size = arr.length;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
    public void print(String []arr)
    {
        int size = arr.length;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) 
    {
        Algo4 algo = new Algo4();
        String []array = {"sourabh","aniket","rahul","pooja","ankita","raju"};
        int []arr = {12,13,15,7,5,11,9,10};
        int  size = arr.length;
        
	
        int []arr1=algo.bubbleSortint(arr,size);
        algo.print(arr1);
      
        int []arr2=algo.insertionSortint(arr);
        algo.print(arr2);
        
        String arr3[]=algo.insertionSort(array,array.length);
        algo.print(arr3);
       
        //System.out.println();
        
        String arr4[]=algo.bubbleSort(array);
        algo.print(arr3);
        
        algo.binarySearchint(arr, 11);
    }
}
