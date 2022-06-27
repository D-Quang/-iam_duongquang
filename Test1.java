class Test{
    private int id;
    private String name;
    private String gender;
    private double gpa;

    Test(int id, String name, String gender, double gpa) {
        this.id=id;
        this.name= name;
        this.gender=gender;
        this.gpa=gpa;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }

    public void setGPA(double gpa){
        this.gpa=gpa;
    }
    public double getGPA(){
        return gpa;
    }

    public void show(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: "+ gender);
        System.out.println("GPA: " + gpa);
    }
}

class Test1{
    public static void main(String[] args){
        Test t = new Test(20010793, "Duong Van Quang", "Name", 7.8);
        t.show();
    }
}