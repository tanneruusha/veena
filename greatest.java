/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner sc=new Scanner(System.in);
	int n1,n2,n3;
	n1=sc.nextInt();
	n2=sc.nextInt();
	n3=sc.nextInt();
	if(n1>=n2 && n1>=n3)
	{
		System.out.println(n1);
	}
	else if(n2>=n1 && n2>=n3)
	{
		System.out.println(n2);
	}
	else
	{
		System.out.println(n3);
	}
	
	}
	}
	
