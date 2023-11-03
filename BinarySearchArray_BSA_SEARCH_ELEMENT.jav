package com.binary_search.umar;

public class BinarySearchArray_BSA_SEARCH_ELEMENT {
	public static void main(String[] args) {
		String res="NO";
		int e=11,arr[]= {1,2,6,8,10};
		int l=0,r=arr.length-1,mid=0;
		while(l+1<r) {
//			mid=(l+r)/2;
			mid=l+(r-l)/2;
			if(arr[mid]>=e) {
				r=mid;
			}else {
				l=mid;
			}
		}
		System.out.println(l+" "+r);
		if(arr[mid]==e) {
			res="YES";
		}
		System.out.println(res);
	}
}
