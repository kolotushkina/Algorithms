package Sorting;

public class SelectionSort {

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
			int min=nums[i];
			int index=i;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j]<min)
				{
					min=nums[j];
					index=j;
				}
			}
			int temp=nums[i];
			nums[i]=min;
			nums[index]=temp;			
		}		
		
		return nums;
	}

}
