package com.dn.BasicArray;

public class DuplicateNumberInArray {

	public static void main(String[] args)
	{
		int[]a= {2,3,4,5,2,4,8,3,9,5,9,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
