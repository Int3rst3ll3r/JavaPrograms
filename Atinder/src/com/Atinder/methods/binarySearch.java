package com.Atinder.methods;

public class binarySearch {

	   int binarysearch(int a[],int k) {
		   int low = 0;
		   int high=a.length-1;
		   while(low<=high) {
			  int mid=(low+high)/2;
			   if(k==a[mid]) {
				   return mid;
			   }
			   else if(k<mid) {
				   low=low;
				   high=mid-1;
			   }
			   else {
				   low=mid+1;
				   high=high;
			   }
		   }
		   return -7;
	   }
}
