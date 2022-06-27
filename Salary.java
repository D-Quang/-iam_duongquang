import java.util.Scanner;

class Person{
    private String name;

    Person(){
    }

    Person(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

class Employee extends Person{
    private int employeeID;
    private double factor;  //he so luong
    private int basicSalary;    //luong co ban

    Employee(){
    }

    Employee(String name, int employeeID, double factor, int basicSalary){
        super(name);
        this.employeeID=employeeID;
        this.factor=factor;
        this.basicSalary=basicSalary;
    }

    public void setEmployeeID(int employeeID){
        this.employeeID=employeeID;
    }
    public int getEmployeeID(){
        return employeeID;
    }

    public void setFactor(double factor){
        this.factor=factor;
    }
    public double getFactor(){
        return factor;
    }

    public void setFontBasicSalary(int basicSalary){
        this.basicSalary=basicSalary;
    }
    public int getBasicSalary(){
        return basicSalary;
    }

    public double getSalary(){
        return factor*basicSalary;
    }
}

public class Salary{
    public static void main(String[] args){
        int n;
        String name;
        int employeeID;
        double factor;
        int basicSalary;

        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap so nguoi: ");
        n= ip.nextInt();

        //System.out.println("Nhap ten: ");
        //System.out.println("Nhap ma so nguoi: ");
        //System.out.println("Nhap he so luong: ");
        //System.out.println("Nhap luong co ban: ");

       Employee e[] = new Employee[n];
       for(int i=0; i<n; i++){
        System.out.println("Nhap ten: ");
        name = ip.next();
        System.out.println("Nhap ma ID: ");
        employeeID = ip.nextInt();
        System.out.println("Nhap he so luong: ");
        factor = ip.nextDouble();
        System.out.println("Nhap luong co ban: ");
        basicSalary = ip.nextInt();
        e[i] = new Employee(name, employeeID, factor,basicSalary);
       }

       for(int i=0; i<n; i++){
           System.out.println("------------------------------------------------------------------");
           System.out.println("Name: " + e[i].getName());
           System.out.println("ID: " + e[i].getEmployeeID());
           System.out.println("Salary: " + e[i].getSalary());
       }
    }
}
