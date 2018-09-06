package anotherMethod;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int [] A={5,2,4,128,1,1,3,2,6,5,-16}; //,4,6
		int start=0;		//0
		int end=A.length;  //4
		
		System.out.println("Массив до сортировки");
		for(int i: A)
		{
			System.out.println(i);
		}
		
		A=Sort(A);
		
		System.out.println("Массив после сортировки");
		for(int i: A)
		{
			System.out.println(i);
		}
		
		System.out.println("Сортировка завершена");
		
	}

	private static int[] Sort(int[] a) {
		int start=0;
		int end=a.length-1;
		if(a.length==1)
			{
				return a;
			}
		else { 
			int mid=(a.length)/2;
			int first[]=Arrays.copyOfRange(a, start, mid);       
			int second[]=Arrays.copyOfRange(a, mid, end+1); 
			first=Sort(first);
			second=Sort(second);
			return merge(first,second);
		}
		
	}

	private static int[] merge(int[] first, int[] second) {
		
		int i=0,j=0; // èíäåêñû äâóõ ïîäìàññèâîâ first è second
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
