package com;

import java.util.Scanner;

public class Forloo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc = new Scanner (System.in);
		 
		  int number, i, add =1;
		   
		  number =  sc.nextInt();
		  
		  for( int i1= 0; i1<=number; i1++)
		  {
			  
				  add=add +i1;	  
			  
		  }
		  
			System.out.println("\n the add numbers  "+ number+" = "+add);	 
		  
			}
	{
  int number, i, even =0;
   
  Scanner sc = new Scanner (System.in);
 
number =  sc.nextInt();
  for( int i1= 1; i1<=number; i1--)
  {
		  even=even +i1;
  }
	System.out.println("\n the Even numbers  "+ number+" = "+even);	 
  
	}

}
