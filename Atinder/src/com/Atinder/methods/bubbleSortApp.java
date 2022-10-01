package com.Atinder.methods;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      
	      System.out.println("enter the length of array");
	      int l = scan.nextInt();
	      int arr[]=new int[l];
	      System.out.println("enter the array elements");
	      for(int i=0;i<l;i++) {
	       arr[i]=scan.nextInt();
	      }
	      System.out.println("Arrays before sorting");
	      System.out.println(Arrays.toString(arr));
	      bubbleSort bs = new bubbleSort();
	      bs.bubblesort(arr);

	}

}
