public class MammalInterface implements AnimalInterface
{
    public void eat()
    {
        System.out.println("Mammal eats.");
    }
    
    public void move()
    {
        System.out.println("Mammal moves.");
    }
    public int numberOfLegs()
    {
        return 0;
    }
    
    public static void main(String[] args)
    {
        MammalInterface mInt = new MammalInterface();
        mInt.eat();
        mInt.move();
        
        
    }
}