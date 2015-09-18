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
        System.out.println("Dog can walk and run.");
    }
}

public class mainApp
{
    public static void main(String []args)
    {
        //create instances, look at the different types and the contructors:
        Animal a = new Animal();
        Animal b = new Dog();
        
        //lets check what these animals can do:
        a.move();
        b.move();
    }
}
