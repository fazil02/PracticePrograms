package com.pattern;

public class Patternprogramming {

	public static void main(String[] args) {
		int n= 12;
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==j||j==n-1)
				//if(i==0||j==0||j==n-1||i==n-1||i==j||i+j==n-1||i==(n-1)/2||j==(n-1)/2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
