import java.io.*;
import java.util.*;
//import java.util.Scanner;

public class DaySo{
    static String filename = "dayso2.dat";
    final static double DOUBLE_SIZE =8;
    public static double[] inputData(int n){
        Scanner scan = new Scanner(System.in);
        double[] a = new double[n];
        for(int i=0; i<a.length; i++){
            System.out.println("Nhap vao phan tu thu " + i+ ":");
            a[i]=scan.nextDouble();
        }
        return a;
    }

    public static void writeFile(double[]a, String filename) throws IOException{
        File dataFile = new File(filename);
        RandomAccessFile out_file = new RandomAccessFile(dataFile, "rw");
        for(int i=0; i<a.length; i++) out_file.writeDouble(a[i]);
        out_file.close();
    }

    public static double[] readFile(String filename) throws IOException{
        File datFile = new File(filename);
        RandomAccessFile in_file = new RandomAccessFile(datFile, "r");
        long len = in_file.length();
        int m=(int) (len/8);
        double a[]= new double[m];
        int j=0;
        for(int i=0; i<len; i+= DOUBLE_SIZE){
            in_file.seek(i);
            a[j]=in_file.readDouble();
            j=j+1;
        }
        in_file.close();
        return a;
    }

    public static void display(double[] a){
        for(int i=0; i<a.length; i++) System.out.println(a[i] + " ");
        System.out.println();
    }

    public static void sort(double[] a){
        double tg;
        for(int i=0; i<a.length-1; i++)
            for(int j=i+1; j<a.length; j++)
            if(a[i]> a[j]){
                tg=a[i];
                a[i]=a[j];
                a[j]=tg;
            }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhap vao phan tu cua day so: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        double a[] = inputData(n);
        System.out.println("Day so da nhap la: ");
        display(a);
        writeFile(a,"ds1.dat");
        a=readFile("ds1.dat");
        System.out.println("Day so doc tu tep la: ");
        sort(a);
        writeFile(a,"sx.dat");
        a=readFile("sx.dat");
        display(a);
    }
}