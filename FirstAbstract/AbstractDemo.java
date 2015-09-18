public class AbstractDemo
{
    public static void main(String[] args)
    {
        System.out.println("\n\n");
        //creating instance with reference Salary, object Salary
        Salary el = new Salary("Ercsenyi Lajos","Zsambek, Fo utca 1.",12,750000.00);
        el.mailCheck();
        //System.out.println("Name");
        System.out.println(el.computePay()+" is the weekly salary of "+el.getName());
        System.out.println("\n\n");
        //creating instance with reference Employee, object Salary
        Employee sc = new Salary("Soos Csaba","Debrecen, Virag utca 5.",7,600000.00);
        sc.mailCheck();
        System.out.println("Information about the person:\n"+sc.toString());
        System.out.println("\n\n");
        //creating instance with reference Employee, obejct Employee
        /*Employee rl = new Employee("Racz Laszlo","Kiskunhalas, Kosar utca 14.",2);
        rl.mailCheck();
        System.out.println("Information about the person:\n"+rl.toString());
        Salary rl_s = new Salary(rl.getName(), rl.getAddress(), rl.getNumber(), 0);
        rl_s.setSalary(80000.00);
        System.out.println(rl_s.computePay()+" is the weekly salary of "+rl_s.getName());
        //System.out.println("No information about salary.");*/
    }
}