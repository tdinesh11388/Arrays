package com.dn.BasicArray;

public class BinarySearchANumIsExitOrNot {

	static int binarySearch(int[]a,int k)
	{
		int f=0;int l=a.length-1;
		while(f<=l)
		{
			int mid=(f+l)/2;
			if(k==a[mid])return a[mid];
			else if(k<a[mid]) l=mid-1;
			else f=mid+1;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[]a= {10,20,30,50,60,70,80,90};
		int z=90;
		System.out.println(binarySearch(a,z));
	}

}
