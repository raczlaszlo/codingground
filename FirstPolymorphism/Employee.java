public class Employee
{
    private String name;
    private String address;
    private int number;
    
    //constructor:
    public Employee(String name, String address, int number)
    {
        System.out.println("Constructing an instance with EmployeeConstructor");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    public void mailCheck()
    {
        System.out.println("Employee class mailcheck function");
        System.out.println("Mailing a check to " + this.name + "to the address " + this.address);
    }
    
    
    public String toString()
    {
        return name + "\t" +address+"\t" + number;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public int getNumber()
    {
        return this.number;
    }
    
    public void setAddress(String newAddress)
    {
        this.address = newAddress;
    }
}

