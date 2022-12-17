package com.Atinder.debugging;

public class program14 {

	public static void main(String[] args) {
		B obj = new B();
		obj.i=1;
		obj.j=2;
		obj.display();
		}
		
}
class A
{
public int i =10;
}
class B extends A
{
int j;
void display()
{
 System.out.print(j);
}
}
class C extends B
{
void display()
{
System.out.print(i+" "+j);
}
}


//package com.Atinder.debugging;
//
//public class program14 {
//
//	public static void main(String[] args) {
//	
//		B obj = new B();
//		obj.i=1;
//		obj.j=2;
//		obj.display();
//		}
//}
//class A
//{ 
// protected int i;
//protected int j;
//}
//class B extends A
//{
// int j;
//void display()
//{
//super.j = 3;
//System.out.println(i + " " + j);
//}
//}


//package com.Atinder.debugging;
//
//public class program14 {
//
//	public static void main(String[] args) {
//		B obj = new B();
//		obj.i=1;
//		obj.j=2;
//		obj.display();
//		}
//		
//}
//class A
//{
//protected int i;
//protected int j;
//}
//class B extends A
//{
//int j;
//void display()
//{
//super.j = 3;
//System.out.println(i + " " + j);
//}
//}


//package com.Atinder.debugging;
//
//public class program14 {
//
//	public static void main(String[] args) {
//		B obj = new B();
//		obj.i=1;
//		obj.j=2;
//		obj.display();
//		}
//		
//}
// class A
//{
//protected int i;
//protected int j;
//}
//class B extends A
//{
// int j;
//void display()
//{
//super.j = 3;
//System.out.println(i + " " + j);
//}
//}


//package com.Atinder.debugging;
//
//public class program14 {
//
//	public static void main(String[] args) {
//		B obj = new B(10,20);
//		obj.i=1;
//		obj.j=2;
//		obj.display();
//		}
//		
//}
//class A
//{
//public int i =10;
//protected int j = 20;
//A(int a,int b)
//{
// System.out.print(i+" "+j);
//}
//}
//class B extends A
//{
// int j;
// public B(int i, int j2) {
//	 super(i, j2);
//}
//void display()
//{
//super.j = 3;
//System.out.println(i + " " + j);
//}
//}

//public class program14 {
//
//	public static void main(String[] args) {
//		B obj = new B(10,20);
//		obj.i=1;
//		obj.j=2;
//		
//		}
//		
//}
//class A
//{
//public int i =10;
//protected int j = 20;
//A(int a,int b)
//{
// System.out.println(i+" "+j);
//}
//}
//class B extends A
//{
//int j;
//B(int a,int b)
//{
//	super(a, b);
//j = 3;
//System.out.println(i + " " + j);
//}
//}

//public class program14 {
//
//	public static void main(String[] args) {
//		B obj = new B(10,20);
//		obj.i=1;
//		obj.j=2;
//		
//		}
//		
//}
//class A
//{
//public int i =10;
//protected int j = 20;
//A(int a,int b)
//{
// System.out.print(i+" "+j);
//}
//}
//class B extends A
//{
//
//public B(int a,int b)
//{
//	super(a, b);
//j = 3;
//System.out.println(i + " " + j);
//}
//}

//public class program14 {
//
//	public static void main(String[] args) {
//		B obj = new B(10,20);
//		obj.i=1;
//		obj.j=2;
//		
//		}
//		
//}
//class A
//{
//public int i =10;
//protected int j = 20;
//A()
//{
// System.out.print(i+" "+j);
//}
//}
//class B extends A
//{
//int j;
//B(int a,int b)
//{
//super();
//System.out.println(i + " " + j);
//}
//}



//public class program14 {
//
//	public static void main(String[] args) {
//		B obj = new B(10,20);
//		obj.i=1;
//		obj.j=2;
//		}
//		
//}
//class A
//{
//public int i =10;
//protected int j = 20;
//A(int a,int b)
//{
// System.out.print(i+" "+j);
//}
//}
//class B extends A
//{
//int j;
//B(int a,int b)
//{
//	super(10,20);
//System.out.println(i + " " + j);
//
//}
//}


//public class program14 {
//
//	public static void main(String[] args) {
//		B obj = new B(10,20);
//		obj.i=1;
//		obj.j=2;
//		}
//		
//}
//class A
//{
//public int i =10;
//protected int j = 20;
//A(int a,int b)
//{
// System.out.print(i+" "+j);
//}
//}
//class B extends A
//{
//int j;
//B(int a,int b)
//{
//	super(10,20);
//System.out.println(i + " " + j);
//
//}
//}
