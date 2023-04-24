package com.in.Multidimensional;

public class MergeSort {

	public static void main(String[] args)
	{
		int []a= {6,8,2,6,9,1,5,7,3};
		sort(a,0,a.length-1);
		for(int z:a)
		{
			System.out.print(z);
		}
	}
	public static void sort(int[]a,int i,int j)
	{
		if(i<j)
		{
			int mid=(i+j)/2;
			sort(a,i,mid);
			sort(a,mid+1,j);
			merge(a,i,mid,j);
		}
	}
	public static void merge(int[]a,int low,int mid,int high)
	{
		int i=low;
		int j=mid+1;
		int k=high;
		int[]b=new int[a.length];
		while(i<=mid && j<=high)
		{
			if(a[i]<a[j])
			{
				b[k]=a[j];
				i++;
				k++;
			}
			else {
				b[k]=a[j];
				j++;
				k++;
			}
			while(i<=mid)
			{
				b[k]=a[i];
				j++;
				k++;
			}
			while(j<=high)
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		for(i=low;i<=high;i++)
		{
			a[i]=b[i];
		}
		for(int z:a)
		{
			System.out.print(z+" ");
		}
	}

}
