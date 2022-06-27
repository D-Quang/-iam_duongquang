//Cài đặt stack bằng mảng
import java.util.function.BooleanSupplier;

interface IStack{
    //value: giá trị mình push vào mảng
    public boolean push(int value);
    public int pop();
    public boolean isFull(); //Kiểm tra xem trong mảng có full không
    public boolean isEmpty();   //Kiểm tra xem trong mảng có rỗng không
    public void show();
}

class MyStackArray implements IStack{
    private int[] array;
    private int SIZE;
    private int topIndex;

    MyStackArray(int size){
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }

    public boolean isFull(){
        return topIndex==SIZE - 1;
    }

    public boolean isEmpty(){
        return topIndex < 0;
    }

    public boolean push(int value){
        if(isFull()){
            return false;
        }else{
            topIndex++; //Tro vao vi tri dau tien
            array[topIndex] = value; //Mảng nhảy lên 1 
            return true;
        }
    }

    public int pop(){
        if(!isEmpty()){ //Nếu trong mảng ko rỗng phần tử
            int value = array[topIndex];    //Lấy phần tử đầu tiên ra
            topIndex--; //Giảm xuống 1
            return value;
        }else{
            System.out.println("Ko the chen them phan tu vi Stack day");
            return -1;
        }
    }

    public void show(){
        if(isEmpty()){
            System.out.println("Stack rong");
        }else{
            for(int i=0; i<=topIndex; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}

class TestArrayStack{
    public static void main(String[] args){
    MyStackArray myStack = new MyStackArray(5);
    
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);
    myStack.push(5);
    myStack.show();

    System.out.print(myStack.pop() + " ");
    System.out.print(myStack.pop() + " ");
    System.out.print(myStack.pop() + " ");
    System.out.print(myStack.pop() + " ");
    System.out.print(myStack.pop() + " ");
    }
}