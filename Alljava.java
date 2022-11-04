package com;

public class Alljava {
	

	public String name;
	public String fathername;
	public String mothername;
	public double monthsalary;
	public long mobile;
	public String email;
	public int ramage;
	public char myletter;
    public boolean Ramjavadeveloper;
    public float a;
	public static String rams="dhurairaj";
	public final static String ram="elango";
	public void setname(String yourname) {
		this.name=yourname;
	}
	public String getname(){
		return this.name;
	}
	public void normalmethod() {
		System.out.println("this is normal method");
	}
	public static void staticmethod() {
		System.out.println("this is a static method");
	}
	public Alljava(String name,String fathername,String mothername,double monthsalary,long mobile,String email,int Ramage,char Myletter,boolean Javadeveloper,float A) {
		this.name=name;
		this .fathername=fathername;
		this.mothername=mothername;
		this.monthsalary=monthsalary; 
		this.mobile=mobile;
		this.email=email;
		this.ramage=Ramage;
		this.myletter=Myletter;
		this.Ramjavadeveloper=Javadeveloper;
		this.a=A;
	}
	public Alljava() {

	}
	public static void main(String[] args) {
		 Alljava bb1=new  Alljava();
		bb1.name="ragu";
		bb1.fathername="krishnamoorthi";
		bb1.mothername="malarvizhi";
		bb1.monthsalary=25000;
		bb1.mobile=9585252723L;
		bb1.email="ragu8214@gmail.com";
		bb1.ramage=27;
		bb1.myletter='R';
		bb1.Ramjavadeveloper=false;
		bb1.a=5.980f;
		 Alljava rr= new  Alljava();
			rr.setname("mohanraj");
			System.out.println(rr.name);
			 Alljava mm=new  Alljava();
		mm.normalmethod();
		 Alljava.staticmethod();
		 Alljava bb=new  Alljava("kannan", "pugal", "malathi", 2354.00, 32448819808l," ragu141@gmail.com",29,'r', false,5.00f);
		System.out.println(bb.name+"  "+bb.fathername+"  "+bb.mothername+"  "+bb.monthsalary+"  "+bb.mobile+"  "+bb.email+"   "+bb.ramage+"  "+bb.myletter+"  "+bb.Ramjavadeveloper+"  "+bb.a);
		System.out.println(bb1.name+ " " +bb1.fathername+" " +bb1.mothername+"  "+bb1.monthsalary+"  "+bb1.mobile+"  "+bb1.email+"   "+bb1.ramage+"  "+bb1.myletter+"  "+bb1.Ramjavadeveloper+"  "+bb1.a);
		System.out.println(ram);
		System.out.println(rams);
	}
	  
	}
