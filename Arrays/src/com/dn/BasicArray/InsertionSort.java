package com.dn.BasicArray;

public class InsertionSort {

	public static void main(String[] args)
	{
		int[]a= {4,2,6,7,8,9,1,2};
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
