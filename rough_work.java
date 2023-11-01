package assignment1;

import java.util.ArrayList;
import java.util.HashSet;

public class rough_work {
	
		public static void main(String[] args) {
		        int[] nums1 = {1,2,2,1};
		        int[] nums2 = {2,2};
		       // int m = nums1.length;
		        //int n = nums2.length;
		         System.out.println("Intersection of two arrays is : ");
		        intersection(nums1, nums2);
		   
	}
		  public static int[] intersection(int[] nums1, int[] nums2){
//		      HashSet<Integer> hs=new HashSet<>();
//		      for(int i=0;i<nums1.length;i++) {
//		    	  hs.add(nums1[i]);
//		      }
//		      for(int i=0;i<nums2.length;i++) {
//		    	 if( hs.contains(nums2[i])) {
//		    		 System.out.println(nums2[i]);
//		    		 hs.remove(nums2[i]);
//		    	 }
//		      }
//			return nums2;
//		      }
	//}
			   HashSet<Integer> set=new HashSet<Integer>();
		       ArrayList<Integer> ans=new ArrayList<Integer>();
			      for(int i=0;i<nums1.length;i++) {
			    	set.add(nums1[i]);
			      }
			      for(int i=0;i<nums2.length;i++) {
			    	 if( set.contains(nums2[i])) {
		                 ans.add(nums2[i]);
			    		 //System.out.println(nums2[i]);
			    		 set.remove(nums2[i]);
			    	 }
			      }
		          int[] arr=new int[ans.size()];
		          for(int i=0;i<ans.size();i++){
		              arr[i]=ans.get(i);
		          }
				return arr;
				
			      }
		}
