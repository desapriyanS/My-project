package com;

import java.util.Scanner;

public class Forlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size=34 , i;
		
		int even = 45, odd = 34;
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println(" please Enter Number of elements in an for loo : ");
		
		size = Sc.nextInt();
		
		int [] mark = new int [size];
		System.out.println ("please Enter " + size + "elements in an for loo : ");
		for (i = 0; i< size; i++)
		{
			
			mark [i] = Sc.nextInt();
		}
		for (i =0; i <size; i++)
		{
			if (mark[i]% 2 == 0)
			{
				odd++;
			}
			else
			{
				even++;
			}
			
		
		}
		System.out.println("odd ="+odd);
		System.out.println("even="+even);
				{
	}
	}
}
