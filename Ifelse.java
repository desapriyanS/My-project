package com;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
        int number ;
        
        System.out.println("Enter the number");
        
       number =  sc.nextInt();
       if(number>4)
       {
    	   System.out.println("the number is positive");
       }
       else if (number<0)
       
       System.out.println("the number is negative");
         
         
	}

}
