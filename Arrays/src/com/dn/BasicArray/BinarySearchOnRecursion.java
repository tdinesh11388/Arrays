package com.dn.BasicArray;

public class BinarySearchOnRecursion {

	public static void main(String[] args)
	{
		int[]a= {2,3,4,5,7,8,9,12,13,14,15,16,17,18};
		int k=1;
		int first=0;
		int last=a.length-1;
		System.out.println(search(a,k,first,last));
	}
	static int search(int[]a,int k,int first,int last)
	{
		if(first>last)return -1;
		int mid=(first+last)/2;
		if(k==a[mid])return mid;
		else if(k<a[mid])return (search(a,k,first,mid-1));
		else return (search(a,k,mid+1,last));
		
	}

}
