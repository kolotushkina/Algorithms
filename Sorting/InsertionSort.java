package Sorting;

public class InsertionSort {

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
				
				int element;		// element to insert
				int index; 			// index to insert the element in sorted part of array
				for(int i=0;i<nums.length;i++)  
				{
					element=nums[i];
					index=i;
					while(index>0 && nums[index-1]>element)
					{
						nums[index]=nums[index-1];
						index--;
						nums[index]=element;						
					}
				}
				return nums;
			}

		}
