import java.util.*;
public class Java_A3_Q3 
{
	public static void main(String[]args)
	{
		String str= "Java String pool refers to the collection of Strings which are stored in heap memory";
		String s1= str.toLowerCase();
		String s2= str.toUpperCase();
		String s3= str.replace('a','$');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		if(str.contains("collection"))
		{
			System.out.println("the string contains'collection'");
		}
		else
		{
			System.out.println("the string doesn't contains'collection'");
		}
		if(str.equals("java string pool refers to the collection of strings which are stored in heap memory"))
		{
			System.out.println("the strings are equal");	
		}
		else
		{
			System.out.println("the strings are not equal");
		}
		if(str.equalsIgnoreCase("java string pool refers to the collection of strings which are stored in heap memory"))
		{
			System.out.println("the strings are equal when case is ignored");	
		}
		else
		{
			System.out.println("the strings are not equal even if case is ignored");
		}
		
		
	}
}
