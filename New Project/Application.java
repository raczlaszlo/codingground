public class Application
{
    public static void main(String []args)
    {
        int a = 5; int b = 2;
        Calculation mainApp = new Calculation();
        ExCalculation mainExApp = new ExCalculation();
        
        //do some addition
        mainApp.add(a,b);
        
        
        //do some multiplication
        mainExApp.multi(a,b);
        mainExApp.add(a,b);
        
    }
    
    
    
}