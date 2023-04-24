package com.dn.BasicArray;

public class SelectionSort {

	public static void main(String[] args)
	{
		int[]a= {3,4,8,9,2,8,2,1};
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
				{
					index=j;
				}
				if(i!=index)
				{
					int temp=a[i];
					a[i]=a[index];
					a[index]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
