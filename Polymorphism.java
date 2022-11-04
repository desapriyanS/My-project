 package com;

 class school {


			public   void maths(){
			System.out.println("they maths...");

		}
		}

		class drr  extends school{
			public void school () { 
				System.out.println("the tamil school... ");
				} 
				public void drr() {
					System.out.println("the tamil");
				}
		}
		public class Polymorphism{
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				drr v=new drr();
				v.maths();
				v.school();
				v.drr();
				//Animal u=new Animal();
				//u.eat();


	}

		}
