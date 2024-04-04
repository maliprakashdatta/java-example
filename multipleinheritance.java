class A
{
   void show()
	{
         System.out.println("Class A is Print..");	
       }
}
 class B extends A
{
   void display()
	{
         System.out.println("Class B is Print..");	
       }
}
class C extends A
{
   void display1()
	{
         System.out.println("Class C is Print..");	
       }
}


class multipleinheritance
{
  public static void main(String args[])
	{
	  	C c1=new C();
                c1.show();
                B b1=new B();
		b1.display();
                c1.display1();
               
                

	}
}