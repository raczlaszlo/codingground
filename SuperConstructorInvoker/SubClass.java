public class SubClass extends SuperClass
{
    SubClass (int age)              //sub constructor...
    {
        super(age);                 //...just calls the super constructor
        
    }
    
    public void subDisplay()
    {
        System.out.println("I am the SUBCLASS");
    }
}
