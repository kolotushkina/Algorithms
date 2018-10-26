package Searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int [] nums={43,12,3,-54,34,908,4,-2,6};
		Arrays.sort(nums);
		
		if(search(nums,43))
			System.out.println("Element found");
		else		
			System.out.println("Element not found");		
	}		
	
	private static boolean search(int [] nums, int num)
	{
		if(nums.length==0)
			return false;
		
		int middle=nums.length/2;
		if(nums[middle]==num)
			return true;
		else if(num<nums[middle])
			return search(Arrays.copyOfRange(nums, 0, middle),num);
		else 
			return search(Arrays.copyOfRange(nums, middle+1, nums.length),num);		
	}	
}
