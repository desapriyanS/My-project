package com;

import java.util.Scanner;

public class ExitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		Scanner input= new Scanner(System.in);
	
		System.out.println("Write the name that are enter");
		length = input.nextInt();
		
         String [] names = new String[length];
		
		
		for (int counter =0 ;counter<length; counter++) {
			System.out.println("Enter the name of friend"+(counter+1));
			names[counter] = input.next();
		}
		input.close();
		
		System.out.println("your friends are");
		for (int counter=0;counter<length;counter++) {
			System.out.println(names[counter]);
		}
	}

}
