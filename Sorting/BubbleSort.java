package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] nums={43,12,3,-54,34,908,4,-2,6};
		
		System.out.println("Before sorting:");
		for(int num: nums)
		{
			System.out.println(num);
		}
		
		nums=sort(nums);
		
		System.out.println("After sorting:");
		for(int num: nums)
		{
			System.out.println(num);
		}
		
		System.out.println("Done!");

	}

	private static int[] sort(int[] nums) {
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length-1;j++)
			{
				if(nums[j]>nums[j+1])
				{
					int temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;					
				}
			}
		}
		
		return nums;
	}

}

