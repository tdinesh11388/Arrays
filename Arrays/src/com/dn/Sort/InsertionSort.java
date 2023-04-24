package com.dn.Sort;

public class InsertionSort {

	public static void main(String[] args)
	{
		int[]a= {3,6,1,8,7,9};
		
		sort(a);
		for(int s:a)
		{
			System.out.println(s);
		}
	}
	public static void sort(int []a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>=key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
