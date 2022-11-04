package com;

class Animal{

	public   void eat (){
	System.out.println("they Animal...");

}
}

class dog extends Animal {
		public void eat () { 
		super.eat ();
		System.out.println("dfgrhnw");
		} 
		public void bark() {
			System.out.println("gffduyfy");
		}
}
public class Inheri{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog v=new dog();
		v.eat();
		v.bark();
		//Animal u=new Animal();
		//u.eat();
	}


	}
	


