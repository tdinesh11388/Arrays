package com.dn.Sort;

public class SelectIonSort {

	public static void main(String[] args)
	{
		//int[]a= {3,7,2,9,5};
		int[]a= {3,6,8,2,1,4,9,};

		sort(a);
		for(int s:a)
		{
			System.out.print(s);
		}
	}
	public static void sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<=a[index])
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
	}

}
