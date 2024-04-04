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
class C extends B
{
   void display1()
	{
         System.out.println("Class C is Print..");	
       }
}


class multilevelinheritance
{
  public static void main(String args[])
	{
	  	C c1=new C();
		c1.show();
		c1.display();
                c1.display1();

	}
}