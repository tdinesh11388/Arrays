package com.in.Multidimensional;

public class Transpose {

	public static void main(String[] args)
	{
		int[][]a= {{1,2,3},{3,4,5},{7,8,9}};
		int len=a.length;
		int[][]b=new int[len][len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		for(int[] z:b)
		{
			for(int x:z)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
