package assignment1;

import java.util.Scanner;

public class Is_Armstrong_Number {

		 static void findMajority(int arr[], int n)
		    {
		        int maxCount = 0;
		        int index = -1; // sentinels
		        for (int i = 0; i < n; i++) {
		            int count = 0;
		            for (int j = 0; j < n; j++) {
		                if (arr[i] == arr[j])
		                    count++;
		            }
		 
		            // update maxCount if count of
		            // current element is greater
		            if (count > maxCount) {
		                maxCount = count;
		                index = i;
		            }
		        }
		 
		        // if maxCount is greater than n/2
		        // return the corresponding element
		        if (maxCount > n / 2)
		            System.out.println(arr[index]);
		 
		        else
		            System.out.println("No Majority Element");
		    }
		 
		    // Driver code
		    public static void main(String[] args) {
		 
				
				  Scanner scn = new Scanner(System.in);
				  int size = scn.nextInt(); 
				  int[] arr =new int[size];
				  
				 for(int i=0;i<size;i++) { arr[i] = scn.nextInt(); }
				 
				 for(int alo : arr) { System.out.print(alo+ " "); } 
				 int n = arr.length;
				  
				  // Function calling findMajority(arr, n);
			
		    	  
		         
		   
		          // Function calling
		          findMajority(arr, n);
		    }
		    // This code is contributed by ajit.
		}
	
	
	