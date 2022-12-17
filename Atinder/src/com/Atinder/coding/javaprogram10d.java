package com.Atinder.coding;
//Showing array in spiral order 
import java.util.Scanner;

public class javaprogram10d {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter row number ");
		 int m = scan.nextInt();
		 System.out.println("Enter coloumn number ");
		 int n = scan.nextInt();
		 int arr[][]= new int[m][n];
		 int top=0,left=0,right=n-1,bottom=n-1;
		 if(m==n) {
			 for(int i=0;i<m;i++) {
				 for(int j=0;j<n;j++) {
					 System.out.println("Enter the elements  a["+i+"]["+j+"]");
					 arr[i][j]=scan.nextInt();
				 }
			 }
			 for(int[]array : arr) {
				 for(int ele:array) {
					 System.out.print(ele+" ");
				 }
				 System.out.println();
			 }
			 int dir=0;
			 for(int j=dir%4;top<n;j++) {
			 if(dir==0) {
				 for(int i=left;i<=right;i++) {
					 System.out.println(arr[top][i]);
				 }
				 top++;
				 dir=1;
			 }
			 if(dir==1) {
				 for(int i=top;i<=bottom;i++) {
					 System.out.println(arr[i][right]);
				 }
				 dir =2;
				 --right;
			 }
			 if(dir==2) {
				 for(int i=right;i>=left;i--) {
					 System.out.println(arr[bottom][i]);
				 }
				 dir=3;
				 --bottom;
			 }
			 if(dir==3) {
				 for(int i=bottom;i>=top;i--) {
					 System.out.println(arr[i][left]);
				 }
				 left++;
				 dir=0;
			 }
			 }
		 }

	}

}
