package com.pattern;

import java.util.Scanner;

public class LaunchUcToLc {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the string..");
	String a=scan.nextLine();
	String a1 = "";
	String a2 = "fazil";
	
	for(int i = 0;i<a.length();i++)
	{
	a1=a1+(char)(a.charAt(i)+32);	
	}
	System.out.println("after copying");
	System.out.println(a1);
	
	String s1 = "FaZiLSadIqBaSHa";
	String s2 = "";
	
	for(int i = 0;i<s1.length();i++)
	{
		if((s1.charAt(i)>='a')&&(s1.charAt(i)<='z'))
				{
			     s2=s2+(char)(s1.charAt(i)-32);
				}
		else
		{
			s2=s2+(char)(s1.charAt(i)+32);
		}
	}
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(a.toUpperCase());
	System.out.println(a2.toLowerCase());
	
	
    
		
     
	}

}
