public class mainApp
{

    public static void main(String []args)
    {
        Mammal mammalInstance = new Mammal();
        Dog dogInstance = new Dog();
        
        if (mammalInstance instanceof Animal)
            System.out.println("Mammal is instance of Animal");
        
        if (dogInstance instanceof Animal)
            System.out.println("Dog is instance of Animal");
        
        if (dogInstance instanceof Mammal)
            System.out.println("Dog is instance of Mammal");
        
        if (mammalInstance instanceof Dog)
            System.out.println("Mammal is instance of Dog");
        else
            System.out.println("Mammal is NOT instance of Dog");
    }
}
