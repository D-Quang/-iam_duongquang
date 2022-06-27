import java.lang.Object;
import java.util.Scanner;

interface Stack {
    public void push(Object num);

    public boolean isEmpty();

    public Object top();

    public int size();

    public Object pop();
}

class ArrStack implements Stack {
    private int top;
    private Object[] arr = new Object[100];

    public ArrStack() {
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if (top == -1) {
            empty = true;
        }
        return empty;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public Object top() {
        if (this.isEmpty() == false) {
            return arr[top];
        } else {
            return null;
        }
    }

    @Override
    public void push(Object num) {
        if (top < 99) {
            top++;
            arr[top] = num;
        } else {
            System.out.println("Stack is full");
        }
    }

    @Override
    public Object pop() {
        if (top != -1) {
            Object temp = arr[top];
            top--;
            return temp;
        } else {
            return null;
        }
    }
}

class linkList {
    private Object num;
    private linkList next;
    private int check;

    linkList() {
        num = null;
        next = null;
        check = 0;
    }

    public void setNum(Object num) {
        this.num = num;
        check = 1;
    }

    public int getCheck() {
        return check;
    }

    public Object getNum() {
        return num;
    }

    public void setNext(linkList next) {
        this.next = next;
    }

    public linkList getNext() {
        return next;
    }
}

class LLStack extends linkList implements Stack {
    private linkList top;
    private int count;

    public LLStack() {
        top = new linkList();
        count = 0;
    }

    public boolean checkStack() {
        boolean status = false;
        if (top.getCheck() != 0) {
            status = true;
        }
        return status;
    }

    @Override
    public void push(Object num) {
        if (!checkStack()) {
            top.setNum(num);
        } else {
            linkList newTop = new linkList();
            newTop.setNum(num);
            newTop.setNext(top);
            top = newTop;
        }
        count++;
    }

    @Override
    public Object pop() {
        if (!checkStack()) {
            System.out.println("Stack is empty!!");
            return 0;
        } else {
            linkList temp = top;
            top = top.getNext();
            temp.setNext(null);
            count--;
            return temp.getNum();

        }

    }

    @Override
    public Object top() {
        if (top.getCheck() == 1) {
            return this.top.getNum();
        } else {
            return -100;
        }
    }

    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if (top.getCheck() == 0) {
            empty = true;
        }
        return empty;
    }

    @Override
    public int size() {
        return count;
    }
}

public class Student {
    static int[] reArrByAS(int[] a, int[] b) {
        ArrStack as = new ArrStack();
        for (int i = 0; i < a.length; i++) {
            as.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = (int) as.pop();
        }
        return b;
    }

    static void Traver(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static int[] reArrByLLS(int[] a, int[] b) {
        LLStack llstack = new LLStack();
        for (int i = 0; i < a.length; i++) {
            llstack.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = (int) llstack.pop();
        }
        return b;
    }

    static Student1[] relistStudent(Student1[] a) {
        Student1[] b = new Student1[a.length];
        LLStack llstack = new LLStack();
        for (int i = 0; i < a.length; i++) {
            llstack.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = (Student1) llstack.pop();
        }
        return b;
    }

    public static void main(String[] args) {
        // int a[] = { 1, 2, 3, 4, 5 };
        // int[] b = new int[a.length];
        // Traver(a);
        // System.out.println("\nchuyen mang a bang Array Stack");
        // b = reArrByAS(a, b);
        // Traver(b);
        // System.out.println("\nchuyen mang a bang link-list Stack");
        // b = reArrByLLS(a, b);
        // Traver(b);
        // System.out.println("\nStack voi sinh vien");
        Student1[] s1 = new Student1[3];
        Student1[] s2 = new Student1[3];
        s1[0] = new Student1("Danh", 0, 9);
        s1[1] = new Student1("Tan", 1, 10);
        s1[2] = new Student1("Quang", 2, 10);
        s2 = relistStudent(s1);
        System.out.println("\nDanh sach sinh vien ban dau:");
        for (int i = 0; i < s1.length; i++) {
            s1[i].Print();
        }
        System.out.println("\nDanh sach sinh vien luc sau:");
        for (int i = 0; i < s2.length; i++) {
            s2[i].Print();
        }
    }
}

class Student1 {
    private String name;
    private int code;
    private double gpa;

    public Student1(String name, int code, double gpa) {
        this.name = name;
        this.code = code;
        this.gpa = gpa;
    }

    public Student1() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getCode() {
        return this.code;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void Print() {
        System.out.println("Ho va ten: " + this.name);
        System.out.println("Ma sinh vien: " + this.code);
        System.out.println("GPA: " + this.gpa);
    }
}