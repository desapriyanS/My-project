package com;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
		 Scanner scanner= new Scanner (System.in);
		 
		 System.out.println("Enter the number");
		 
	 int  number =  scanner.nextInt();
		  
		  
		  for (int i=1; i<=10; i++) {
		  
		System.out.println(""+i+"*"+ ""+number+"="+(i*number));
     
	}

}
}