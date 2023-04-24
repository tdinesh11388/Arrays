package com.in.Multidimensional;

public class Demo1 {

	public static void main(String[] args)
	{
		int [][]a=new int[3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[0][2]=9;
		a[1][2]=8;
		a[2][0]=6;
		a[2][2]=10;
		a[2][1]=78;
		
		/*for(int[]x:a)
		{
			for(int y:x)
			{
				System.out.print(y+"\t");
			}
			System.out.println();
		}*/
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
