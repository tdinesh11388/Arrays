package com.dn.Sort;

public class QuickSort {

	public static void main(String[] args)
	{
		int[]a= {4,5,9,1,3,6,8};
		
		sort(a,0,a.length-1);
		
		for(int s:a)
		{
			System.out.println(s);
		}
	}
	public static void sort(int[]a,int first,int end)
	{
		if(first>=end)return;
		
		int pivot=a[(first+end)/2];
		
		int i=first;int j=end;
		
		while(i<=j)
		{
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		
		sort(a,first,j);
		sort(a,i,end);
	}

}
