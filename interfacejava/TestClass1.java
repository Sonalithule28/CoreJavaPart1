package com.interfacejava;
interface TestInterface
{
   
    public void square(int a);
  
    
    default void method()
    {
      System.out.println("Default Method Executed");
    }
} 
class TestClass1 implements TestInterface
{
    
    public void square(int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
        TestClass1 d = new TestClass1();
        d.square(6);
  
       


	

}


}
