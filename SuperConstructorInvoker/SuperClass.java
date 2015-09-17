public class SuperClass
{
    private int age;
    
    SuperClass (int age)        //constructor
    {
        this.age = age
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void superDisplay()
    {
        System.out.println("I am the SUPERCLASS");
    }
}