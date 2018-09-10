package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		int [] A={5,2,4,128,1,1,3,2,6,5,-5}; // original array
		int start=0;		
		int end=A.length;  
		
		System.out.println("Before sorting");
		for(int i: A)
		{
			System.out.println(i);
		}
		
		A=Sort(A);
		
		System.out.println("After sorting");
		for(int i: A)
		{
			System.out.println(i);
		}
		
		System.out.println("Done");
		
	}

	private static int[] Sort(int[] a) {
		int start=0;
		int end=a.length;
		if(a.length==1)		// divide until a.len = 1
			{
				return a;
			}
		else { 
			int mid=(a.length)/2;
			int first[] = new int[mid];
			int second[] = new int[end-mid];                           
												 
			for (int i = 0; i < a.length; i++) { 
                if (i < mid)
                    first[i] = a[i];
                else
                    second[i - mid] = a[i];
            }
			first=Sort(first);
			second=Sort(second);
			return merge(first,second);
		}
		
	}

	private static int[] merge(int[] first, int[] second) {
		
		int i=0,j=0; // indexes of first and second subarrays
		int l1=first.length;
		int l2=second.length;
		int B[]=new int[first.length+second.length];
		
		for(int l=0;l<B.length;l++)
		if(i==l1)
		{
			B[l]=second[j];
			j++;
		}
		else if(j==l2)
		{
			B[l]=first[i];
			i++;
		}
		else if(first[i]<second[j])
		{
			B[l]=first[i];
			i++;
		}
		else{
			B[l]=second[j];
			j++;
		}
		return B;
		
		
	}

}
