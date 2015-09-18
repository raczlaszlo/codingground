public class Salary extends Employee
{
    private double salary;
    
    //constructor
    public Salary(String name, String address, int number, double salary)
    {
        super(name, address, number);
        System.out.println("Constructing an instance with SalaryConstructor");
        setSalary(salary);
        
    }
    
    public void setSalary(double newSalary)
    {
        if (newSalary>=0.0)
            salary = newSalary;
    }
    
    //method override
    public void mailCheck()
    {
        System.out.println("Salary class mailcheck function");
        System.out.println("Mailing check to "+getName()+" with salary "+this.salary);
    }
    
    public double getSalary()
    {
       return salary;
    }
    
    public double computePay()
    {
        System.out.println("Computing weekly salary payment for "+ getName());
        return salary/52;
    }
}