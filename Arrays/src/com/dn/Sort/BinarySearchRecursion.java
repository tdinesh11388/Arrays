package com.dn.Sort;

public class BinarySearchRecursion {

	public static void main(String[] args)
	{
		int []a= {1,2,3,4,5,6,7,8,9,11,23,24};
		
		int x=search(a,4,0,a.length-1);
		
		System.out.println(x);
	}
	public static int search(int []a,int e,int first,int last)
	{
		if(first>last)return -1;
		
		int mid=(first+last)/2;
		
		if(a[mid]==e)return mid;
		else if(e<a[mid])return search(a,e,first,mid-1);
		else return search(a,e,mid+1,last);
	}

}
