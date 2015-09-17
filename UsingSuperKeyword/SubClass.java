public class SubClass extends SuperClass
{
    int number = 93;
    
    public void display()
    {
        System.out.println("This is the SUBCLASS");
    }
    
    public void callerMethod()
    {
        SubClass subInstance = new SubClass();
        
        sub.display();
        super.display();
        System.out.println("SUBCLASS integer: "+sub.number);
        System.out.println("SUPERCLS integer: "+super.number);
    }
}