package com.singledimension;

import java.util.Arrays;
import java.util.Scanner;

//1) create array object using literal.
//2) create array object using new keyword.
/*

public class TestSingleDimension {

	public static void main(String[] args) {
		
		int marks[]= {80,60,40,30};
		
		for(int i=0;i<4;i++)
		{
			System.out.println(marks[i]);
		}

	}

}*/

//create array object using new keyword 

/*
public class TestSingleDimension {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter size of an array");
		size=new Scanner(System.in).nextInt();
		
		int []marks=new int[size]; 
		
		System.out.println("Enter element in an array");
		for(int i=0;i<4;i++)
		{
			marks[i]=new Scanner(System.in).nextInt();
		}
		
		System.out.println("Display Array");
		for(int i=0;i<4;i++)
		{
			System.out.println(marks[i]);
		}

	}
}
*/
//TestSingleDimension
/*
public class TestSingleDimension
{
	public static void main(String[]args) {

		Scanner sc=new Scanner(System.in);
   char ch[]=new char[5];
   int vowel=0,consonent=0;
   System.out.println("Enter the Characters:");

   for(int i=0;i<5;i++)
   {
	   ch[i]=sc.next().charAt(0);
	   
   }
   for(int i=0;i<5;i++)
   {
	 System.out.println(ch[i]);
   }
   for(int i=0;i<ch.length;i++)
   {
	   if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	   {
		   vowel++;
	   }
	   else if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
	   {
		   consonent++;
	   }
	   
   }
      System.out.println("Vowels are: "+vowel);
      System.out.println("Consonents are: "+consonent);

	}
	
}

*/


//Input and display using function

/*
public class TestSingleDimension {

	int [] input()
	{
		int size;
		System.out.println("Enter size of an array");
		size=new Scanner(System.in).nextInt();
		
		int []marks=new int[size]; 
		
		System.out.println("Enter element in an array");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=new Scanner(System.in).nextInt();
		}
		
		return marks;
	}
	
	void display(int m[]){
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
	}
	public static void main(String[] args) {
		
		
		TestSingleDimension ob=new TestSingleDimension();
		int []marks=ob.input();
		
		System.out.println("Display Array");
		
		ob.display(marks);
		

	}
}

*/


/*

5
	char[] input() {
		Scanner sc=new Scanner(System.in);
		   char ch[]=new char[5];
		   int vowel=0,consonent=0;
		   System.out.println("Enter the Characters:");

		   for(int i=0;i<5;i++)
		   {
			   ch[i]=sc.next().charAt(0);
			   
		   }
		   return ch;
	}
	void display(char c[])
	{
		for(int i=0;i<5;i++)
		   {
			 System.out.println(c[i]);
		   }
	}
	void find(char ch[]) {
		int vowel=0,consonent=0;
		for(int i=0;i<ch.length;i++)
		   {
			   if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			   {
				   vowel++;
			   }
			   else if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
			   {
				   consonent++;
			   }
			   
		   }
		      System.out.println("Vowels are: "+vowel);
		      System.out.println("Consonents are: "+consonent);
	}
	public static void main(String[]args) {

		TestSingleDimension ob = new TestSingleDimension();
		char c[]=ob.input();
		ob.display(c);
		ob.find(c);
	}
	
}
*/

/*
public class TestSingleDimension
{
	public static void main(String []args)
	{
		int i,n;
		int flag=0;
		int []a=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the the number that you want to find:");
		n=sc.nextInt();
		
		for(i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				flag=1;
				break;
				
			}
			
			
		}
		if(flag==1)
			System.out.println("number found:");
		else		
			System.out.println("not found:");
		
		
		
	}
}
*/

//Different ways to print array
/*
public class TestSingleDimension {

	public static void main(String[] args) {
		
		int marks[]= {80,60,40,30};
		
		for(int i=0;i<4;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("using for each");
		
		for(int i:marks)
		{
			System.out.println(i);
		}
		
		System.out.println("using forEach stream java8");
		Arrays.stream(marks).forEach(System.out::println);
		
		Arrays.stream(marks).forEach(System.out::println);
	
		System.out.println("using object tostring method");
		System.out.println(Arrays.toString(marks));
		
				
	}

}
*/

public class TestSingleDimension {
    int[] input() {
    	int a[]=new int[4];
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter an elements");
    	for(int i=0;i<a.length;i++) {
    		a[i]=sc.nextInt();
    	}
    	return a;
    }
   
    float average(int marks[]) {
    	int sum=0;
    	for(int m : marks) {
			sum = sum + m ;
		}
    	return (float)sum/marks.length;
    }
	public static void main(String[] args) {
		
		TestSingleDimension s=new TestSingleDimension();
     
		int a[]=s.input();
		System.out.println(s.average(a));
		
		
		
	
	}
}	