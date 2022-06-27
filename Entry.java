import javax.swing.plaf.synth.SynthMenuItemUI;

class Person{
    private String name;
    private int age;
    private String address;

    Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;       
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Student extends Person{
    private int gpa;
    public Student(String name, int age, String address, int gpa){
        super(name, age, address);
        this.gpa=gpa;
    }

    public void setGpa(int gpa){
        this.gpa=gpa;
    }
    public int getGpa(){
        return gpa;
    }

    public void display(){
        super.display();
        System.out.println("Gpa: " + gpa);
    }
}

class Teacher extends Person{
    private int salary;
    public Teacher(String name, int age, String address, int salary){
        super(name, age, address);
        this.salary=salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }

    public void display(){
        super.display();
        System.out.println("Salary: " + salary);
    }
}


public class Entry {
    public static void main(String[] agrs){
        Student s = new Student("Danh", 20, "Bac Ninh", 8);
        s.display();
        System.out.println("-----------------------------------------------------------");
        Teacher t = new Teacher("Tan", 20, "Bac Ninh", 18000000);
        t.display();
    }
}

