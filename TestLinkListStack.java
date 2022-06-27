//Cai dat stcak bang linklist
import java.util.ArrayList;
import java.util.function.BooleanSupplier;

interface IStack{
    //value: giá trị mình push vào mảng
    public boolean push(int value);
    public int pop();
    public boolean isFull(); //Kiểm tra xem trong mảng có full không
    public boolean isEmpty();   //Kiểm tra xem trong mảng có rỗng không
    public void show();
}

class MyLinkListStack implements IStack{
    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    Node topNode;
    MyLinkListStack(){
        topNode = null;
    }

    public boolean isEmpty(){
        return topNode== null;
    }

    public boolean isFull(){
        return false;
    }

    public boolean push(int value){
        if(!isFull()){
            //Them mot phan tu dau linklist
        Node newNode = new Node(value);
        newNode.next = topNode;
        topNode= newNode;
            return true;
        }
        return false;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int value = topNode.value;
        topNode= topNode.next;
        return value;
    }

    public void show(){
        if(isEmpty()){
            System.out.println("Stack rong");
            return;
        }

        Node temp =  topNode;
        ArrayList<Integer> tempList = new ArrayList<>();
        while(temp != null){
            System.out.println(temp.value + " " );
            tempList.add(temp.value);
            temp=temp.next;
        }
        for(int i=tempList.size()-1; i>=0; i--){
            System.out.print(tempList.get(i) + " ");
        }
        System.out.println();
    }
}

class TestLinkListStack{
    public static void main(String[] args){
        MyLinkListStack stack = new MyLinkListStack();
        stack.push(1);     
        stack.push(2);
        stack.push(3);
        stack.show();
        
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();

    }
}