package com.pattern;

public class ForEach {

	public static void main(String[] args) {
	//int	[][] ar ={{10,20},{30,40,10},{10,20,30,40,50}};
	
//	for(int elem[]:ar)
//	{
//		for(int a:elem)
//		{
//			System.out.print(a+" ");
//		}
//		System.out.println();
//	}

		int [] a = {10,20,30,40,50,60,70,80,90};
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
			i++;
			
		}
	

	}

}
