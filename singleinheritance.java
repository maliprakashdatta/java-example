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

class singleinheritance
{
  public static void main(String args[])
	{
	  	B b1=new B();
		b1.show();
		b1.display();
	}
}