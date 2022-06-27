//lop truu tuong
abstract class Person{
    private String name;
    private String address;
    public Person(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
}
class Employee extends Person{
    private int salary;
    public Employee(String name,String address,int salary){
        super(name,address);
        this.salary=salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
    public void display(){
        System.out.println("Employee name: "+this.getName());
        System.out.println("Employee address: "+this.getAddress());
        System.out.println("Employee salary: "+this.getSalary());
    }
}
class Customer extends Person{
    private int balance;
    public Customer(String name,String address,int balance){
        super(name,address);
        this.balance=balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
    public void display(){
        System.out.println("Customer name: "+this.getName());
        System.out.println("Customer address: "+this.getAddress());
        System.out.println("Customer balance: "+this.getBalance());
    }
}

public class Entry3 {
	public static void main(String[] args) {
		Person person1 = new Employee("Trung", "HN", 3300);
		Person person2 = new Customer("Linh", "BN", 10400);
		person1.display();
		person2.display();
	}
}