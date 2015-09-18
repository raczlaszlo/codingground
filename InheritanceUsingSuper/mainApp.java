class Animal
{
    public void move()
    {
        System.out.println("Animals can move.");
    }
}

class Dog extends Animal
{
    public void move()
    {
        super.move();        
        System.out.println("Dogs can walk and run.");
    }
}


public class mainApp
{

     public static void main(String []args)
     {
        Animal dogInstance = new Dog();
        dogInstance.move();
     }
}
