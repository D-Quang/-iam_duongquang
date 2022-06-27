import java.util.Scanner;
public class dayfibonacci {
    /**
     * Tính số fibonacci thứ n
     * 
     * @param n: chỉ số của số fibonacci tính từ 0 
     *           vd: F0 = 0, F1 = 1, F2 = 1, F3 = 2
     * @return số fibonacci thứ n
     */
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        int sum=0;
        for(int i=0; i<n; i++){
            if(fibonacci(i) < 100){
                sum+=fibonacci(i);
            }
        }
        System.out.println("\nTong so trong day nho hon 100 la : "+ sum);
    }
}