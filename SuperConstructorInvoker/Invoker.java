public class Invoker
{
     public static void main(String []args)
     {
        //create a subclass instance, which will invoke the superclass constructor 
        SubClass subInstance = new SubClass(93);
        System.out.println("The set value of the SUPERCLASS number: "+subInstance.getAge());
        
        subInstance.subDisplay();
        subInstance.super.superDisplay();
        
     }
}
