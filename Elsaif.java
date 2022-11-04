package com;

import java.util.Scanner;

public class Elsaif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println( "Enter the mark ");
	
        n=sc.nextInt();
        if (n>97);
        {
        System.out.println( "grade  A ");
	}
	
		 if(n>67);
        {	
		System.out.println("grade B");
	}
        
        	if(n>45);
        {
        	System.out.println("grade C");
        	
        }
        
        
        	if(n>29);
        {
        	System.out.println("grade D");
        }
}      
}