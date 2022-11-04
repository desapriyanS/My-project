package com;

import java.util.Scanner;

public class Arrayl {

	public static void main(Out[] args) {
		// TODO Auto-generated method stub
		
	int size , i;
		
		int even = 0, odd = 0;
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println(" please Enter Number of elements in an Array : ");
		
		size = Sc.nextInt();
		
		int [] mark = new int [size];
		System.out.println ("please Enter " + size + "elements in an for Array : ");
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
		System.out.println("\n total Number of even numbers this Array ="+odd);
		System.out.println("\n total Number of add numbers this Array="+even);
				{
	}
	}


		
				
	}


