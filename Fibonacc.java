import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Fibonacc {
    static int[] ArrFibonacci(int n) {
        int arr[] = new int[n];
        if (n <= 2) {
            if (n == 1) {
                arr[0] = 1;
            }
            if (n == 2) {
                arr[0] = 1;
                arr[1] = 1;
            }
        } else {
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        try {
            // buoc 1 tao cac doi tuong lien ket
            FileOutputStream fos = new FileOutputStream("dayso1.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            // buoc 2 ghi du lieu
            // dos.writeInt();
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int arr[] = ArrFibonacci(n);
            String a;
            for (int i = 0; i < n; i++) {
                a = Integer.toString(arr[i]);
                dos.writeChars(a + "\n");
            }
            // String s = arr.toString();
            // arr = dos.writeChars((String) arr);
            // dos.writeChars(s);
            // dos.writeChars("Helloooooo 2 3 4 5");
            // buoc 3:dong luong
            fos.close();
            dos.close();
            System.out.println("Done!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}