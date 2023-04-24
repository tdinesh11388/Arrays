package com.in.Multidimensional;

public class MatrixMultiplication1 {

	public static void main(String[] args)
	{
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]b= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]c=multiply(a,b);
		for(int []z:c)
		{
			for(int x:z)
			{
				System.out.print(x+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] multiply(int[][]a,int[][]b)
	{
		int len=a.length;
		int[][]c=new int[len][len];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					c[i][j]+=a[j][k]*b[k][j];
				}
			}
		}
		return c;
	}

}
