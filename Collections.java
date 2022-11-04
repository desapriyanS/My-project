package com;

import java.util.Scanner;

public class Collections {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String characters;
		int conut=0 ;
		  int count[] = new int[233];

      System.out.println("Enter The String: ");
      characters = sc.nextLine();  
      
	 for (int i=0 ;i<characters.length();i++)
	 {
		 
count[(characters.charAt(i))]++;
		}
	 
	for (int i=0;i<233;i++)
		 if (count[i] !=0){
		 
        System.out.println((char)i+" = "+count[i]);
	}
	}
}
	