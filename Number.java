package com;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//System.out.println("Welcome to bitwise operator");
		Scanner sc=new Scanner(System.in);
		
       int x = 42;
       int y = 54;
       int c  = x&y;
       System.out.println(c);
       
       int d = x|y;
       System.out.println(d);
	}

}
