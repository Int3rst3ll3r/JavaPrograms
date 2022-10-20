package com.Atinder.debugging;

public class program6 {

//	public static void main(String[] args) {
//		 
//			 //Counter variable to store the count of vowels and consonant
//			 int vCount = 0, cCount = 0;
//			 //Declare a string
//			String str = "This is a really simple sentence";
//			//Converting entire string to lower case to reduce the comparisons
//			 str = str.toLowerCase();
//			 for(int i = 0; i < str.length(); i++) {
//			 //Checks whether a character is a vowel
//			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
//			 str.charAt(i) == 'o' || str.charAt(i) == 'u')
//			{
//			 //Increments the vowel counter
//			 vCount++;
//			 }
//			 //Checks whether a character is a consonant
//		     else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
//			 //Increments the consonant counter
//			 cCount++;
//			}
//			 }
//			 System.out.println("Number of vowels: " + vCount);
//			 System.out.println("Number of consonants: " + cCount);
//			 }
//			
//
//	}
//	    public static void main(String[] args){
//		 //Counter variable to store the count of vowels and consonant
//		 int vCount = 0, cCount = 0;
//		 //Declare a string
//	      String str = "This is a really simple sentence";
//		// Converting entire string to lower case to reduce the comparisons
//		 str = str.toLowerCase();
//		 for(int i = 0; i < str.length(); i++) {
//		 //Checks whether a character is a vowel
//		 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
//		str.charAt(i) == 'o' || str.charAt(i) == 'u')
//		 {
//		 //Increments the vowel counter
//		 vCount++;
//		 }
//		 //Checks whether a character is a consonant
//		 else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
//	      //Increments the consonant counter
//		 cCount++;
//		 }
//		 }
//	    System.out.println("Number of vowels: " + vCount);
//		System.out.println("Number of consonants: " + cCount);
//		}
//		 }
	
//	 public static void main(String[] args){
//		//Counter variable to store the count of vowels and consonant
//		 int vCount = 0, cCount = 0;
//	      //Declare a string
//		 String str = "This is a really simple sentence";
//		 //Converting entire string to lower case to reduce the comparisons
//		 str = str.toLowerCase();
//		for(int i = 0; i < str.length(); i++) {
//		//Checks whether a character is a vowel
//		 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
//		str.charAt(i) == 'o' || str.charAt(i) == 'u')
//		 {
//		 //Increments the vowel counter
//		 vCount++;
//		 }
//		 //Checks whether a character is a consonant
//		 else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
//		 //Increments the consonant counter
//		 cCount++;
//	  }
//		 }
//		 System.out.println("Number of vowels: " + vCount);
//		 System.out.println("Number of consonants: " + cCount);
//		 }
	
	
//	 public static void main(String[] args){
//		 //Counter variable to store the count of vowels and consonant
//		 int vCount = 0, cCount = 0;
//		 //Declare a string
//		 String str = "This is a really simple sentence";
//		 //Converting entire string to lower case to reduce the comparisons
//		 str = str.toLowerCase();
//		 for(int i = 0; i < str.length(); i++) {
//	     //Checks whether a character is a vowel
//		 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
//		str.charAt(i) == 'o' || str.charAt(i) == 'u')
//	   {
//		//Increments the vowel counter
//		 vCount++;
//		 }
//		 //Checks whether a character is a consonant
//		 else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
//		//Increments the consonant counter
//		 cCount++;
//		 }
//	  }
//		System.out.println("Number of vowels: " + vCount);
//		 System.out.println("Number of consonants: " + cCount);
//		 }
	
//	     public static void main(String[] args){
//		 String str = "FUN";
//		 int len = str.length();
//		 int temp = 0;
//		 //Total possible subsets for string of size n is n*(n+1)/2
//		 String arr[] = new String[len*(len+1)/2];
//		 //This loop maintains the starting character
//		 for(int i = 0; i < len; i++) {
//		 //This loop adds the next character every iteration for the subset to form
//         //and add it to the array
//		 for(int j = i; j < len; j++) {
//		 arr[temp] = str.substring(i, j+1);
//		 temp++;
//		 }
//		 }
//		 //This loop prints all the subsets formed from the string.
//	     System.out.println("All subsets for given string are: ");
//		 for(int i = 0; i < arr.length; i++) {
//	       System.out.println(arr[i]);
//		}
//		}
//	output 
//	All subsets for given string are: 
//		F
//		FU
//		FUN
//		U
//		UN
//		N
	
//	public static void main(String[] args){
//		 String str = "FUN";
//		 int len = str.length();
//		 int temp = 0;
//		 //Total possible subsets for string of size n is n*(n+1)/2
//		 String arr[] = new String[len*(len+1)/2];
//		 //This loop maintains the starting character
//		 for(int i = 0; i < len; i++) {
//		 //This loop adds the next character every iteration for the subset to form
//         //and add it to the array
//		 for(int j = i; j < len; j++) {
//		 arr[temp] = str.substring(i, j+1);
//		 temp++;
//		 }
//		 }
//		 //This loop prints all the subsets formed from the string.
//		 System.out.println("All subsets for given string are: ");
//		 for(int i = 0; i < arr.length; i++) {
//		 System.out.println(arr[i]);
//		 }
//		 }
	
//	public static void main(String[] args){
//		String str = "FUN";
//		int len = str.length();
//		int temp = 0;
//		 //Total possible subsets for string of size n is n*(n+1)/2
//		 String arr[] = new String[len*(len+1)/2];
//		 //This loop maintains the starting character
//		for(int i = 0; i < len; i++) {
//		 //This loop adds the next character every iteration for the subset to form
//         //and add it to the array
//		 for(int j = i; j < len; j++) {
//		 arr[temp] = str.substring(i, j+1);
//		temp++;
//		 }
//		 }
//		 //This loop prints all the subsets formed from the string.
//		 System.out.println("All subsets for given string are: ");
//		 for(int i = 0; i < arr.length; i++) {
//		 System.out.println(arr[i]);
//		}
//		}
	
//	public static void main(String[] args){
//		 String str1="Remove white spaces";
//		 //Removes the white spaces using regex
//		 str1 = str1.replaceAll("\\s" , "");
//		 System.out.println("String after removing all the white spaces : " + str1);
//		 }
	
//	public static String lcp(String s, String t){
//		 int n = Math.min(s.length(),t.length());
//		 for(int i = 0; i < n; i++){
//		 if(s.charAt(i) != t.charAt(i)){
//		 return s.substring(0,i);
//	 }
//		 }
//		 return s.substring(0,n);
//		 }
//		 public static void main(String[] args){
//		 String str = "acbdfghybdf";
//		 String lrs="";
//		 int n = str.length();
//		 for(int i = 0; i < n; i++){
//		 for(int j = i+1; j < n; j++){
//		 //Checks for the largest common factors in every substring
//		 String x = lcp(str.substring(i,n),str.substring(j,n));
//		
//		 //then it takes the current one as longest repeating sequence
//		 if(x.length() > lrs.length()) lrs=x;
//		 }
//		 }
//		 System.out.println("Longest repeating sequence: "+lrs);
//		 }
	
	 public static String lcp(String s, String t){
		 int n = Math.min(s.length(),t.length());
		 for(int i = 0; i < n; i++){
		 if(s.charAt(i) != t.charAt(i)){
		 return s.substring(0,i);
		}
		}
		return s.substring(0,n);
		 }
		 public static void main(String[] args){
		 String str = "acbdfghybdf";
		 String lrs="";
		 int n = str.length();
		for(int i = 0; i < n; i++){
		 for(int j = i+1; j < n; j++){
		 //Checks for the largest common factors in every substring
		 String x = lcp(str.substring(i,n),str.substring(j,n));
		 //If the current prefix is greater than previous one
		 //then it takes the current one as longest repeating sequence
		 if(x.length() > lrs.length()) lrs=x;
		}
		}
		 System.out.println("Longest repeating sequence: "+lrs);
		 }
}

