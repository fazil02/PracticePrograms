package com.pattern;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Enter the string which have to reverse it..");
String s=scan.nextLine();
String s1 = "";

for(int i=s.length()-1;i>=0;i--)
{
	s1=s1+s.charAt(i);
	
	}
System.out.println(s1);

	}

}
