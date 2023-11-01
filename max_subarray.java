package assignment1;

public class max_subarray {
	 public static void main(String[] args){
	      int[] nums = {-1};
			//  int nums=
	       System.out.println(maxSubArray(nums));
	    }

	    public static int maxSubArray(int[] nums) {
	    	 int sum=0;
	    	int max=nums[0];
	    
	       for(int i=0;i<nums.length;i++){
	           sum=sum+nums[i];
	           if(sum>max){
	               max=sum;
	           }
	           
	           if(sum<0){
	               sum=0;
	           }
	          
	       }
	        //     System.out.println(sum);
	       
		return max;
	    
	    }
	}