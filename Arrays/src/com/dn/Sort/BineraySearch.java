package com.dn.Sort;

public class BineraySearch {

	public static void main(String[] args)
	{
		int[]a= {1,2,3,4,5,6,7,8,9,12,13,14};
		
		int x=search(a,13);
		System.out.println(x);
	}
	public static int search(int[]a,int e)
	{
		int first=0;int last=a.length-1;
		
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(a[mid]==e)return mid;
			else if(e<a[mid]) last=mid-1;
			else first=mid+1;
		}
		return -1;
	}

}
