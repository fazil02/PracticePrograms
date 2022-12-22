package com.pattern;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

            int [] a = {12,34,67,44,34};
            Boolean b = false;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
           int key=scan.nextInt();
           
           for(int i=0;i<a.length;i++)
           {
        	   if(key==a[i])
        	   {
        		   System.out.println(key+" "+i);
        		   b=true;
        		   break;
        	   }
           }
           if(b==false)
           {
        	   System.out.println("key not found");
        	   
           }

	}

}
