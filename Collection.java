package com;

import java.util.Scanner;

public class Collection {

	public static void main(String[] args, int j) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
	System.out.println( "enter the string");
	
	String st = sc.nextLine();
	char ch []=st.toCharArray();//converting String to character array 
	int n=ch.length;
	for (int i=0;i<n ; i++)
	{
       int conut=1;
       for (int j1=i+1;j1<n;j1++ );
       {
    	   
		if (ch[i]==ch[j])
    	   {
    		conut= conut+1;
    		for (int k=j;k<n-1;k++)
    		{
    		ch [k]=ch[k+1];
    	   }
    		j--;
    		n--;
       }

}
	System.out.println(ch[i]+"="+conut);
	
	
   }	
}
}