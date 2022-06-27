import java.lang.Math;
import java.util.Scanner;

class SoPhuc {
    private double a;
    private double b;

    SoPhuc(double a, double b){
        this.a=a;
        this.b=b;
    }

    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return a;
    }

    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }

    public String toString(){
        String str = a + "+j*" + b;
        if(a==0){
            str = "j*" + b;
            return str;
        }
        else if(b==0){
            str= Double.toString(a);
            return str;
        }
        return str;
    }

    public void Modun(){
        System.out.println("Do lon cua so phuc la: " + toString() + " = " + Math.sqrt(a*a+b*b));
    }

    public static void SoSanh(SoPhuc s1, SoPhuc s2){
        if(s1.a == s2.a && s1.b == s2.b){
            System.out.println("Hai so phuc bang nhau");
        }else{
            System.out.println("Hai so phuc khong bang nhau");
        }
    }

    public static void Tong_Hai_SoPhuc(SoPhuc s1, SoPhuc s2){
        double PhanThuc1 = s1.a + s2.a;
        double PhanAo1 = s1.b + s2.b;
        System.out.println("Tong hai so phuc = " + PhanThuc1 + (" + j*") + PhanAo1);  
    }

    public static void Hieu_Hai_SoPhuc(SoPhuc s1, SoPhuc s2){
        double PhanThuc2 = s1.a - s2.a;
        double PhanAo2 = s1.b - s2.b;
        System.out.println("Hieu hai so phuc = " + PhanThuc2 + (" - j*") + PhanAo2);
    }

    public static void Nhan_Hai_SoPhuc(SoPhuc s1, SoPhuc s2){
        double PhanThuc3 = (s1.a * s2.a) - (s1.b * s2.b);
        double PhanAo3 = (s1.a * s2.b) + (s1.b * s1.a);
        System.out.println("Tich hai so phuc = " + PhanThuc3 + " + j*" + PhanAo3);
    }

    public static void Chia_Hai_SoPhuc(SoPhuc s1, SoPhuc s2){
        double PhanThuc4 = ((s1.a * s2.a) + (s1.b * s2.b))/ (s2.a*s2.a + s2.b*s2.b);
        double PhanAo4 = ((s1.b*s2.a) - (s1.a * s2.b)) / (s2.a*s2.a + s2.b*s2.b);
        System.out.println("Thuong cua hai so phuc = " + PhanThuc4 + " + j*" + PhanAo4);
    }

    public static void NhanSoThuc_Voi_SoPhuc(double n, SoPhuc s1){
        double PhanThuc5 = n * s1.a;
        double PhanAo5 = n * s1.b;
        System.out.println("Nhan so thuc voi so phuc = " + PhanThuc5 + " + j*" + PhanAo5);
    }

    public static void SoPhuc_LineHop(SoPhuc s1){
        double PhanThuc6= s1.a;
        double PhanAo6 = (-1) * s1.b;
        System.out.println("So phuc lien hop = " + PhanThuc6 + "j* " + PhanAo6);
    }

    public static void main(String[] args){
        SoPhuc s1 = new SoPhuc(3, 4);
        SoPhuc s2 = new SoPhuc(6, 8);
         
        s1.Modun();
        s2.Modun();

        SoSanh(s1, s2);
        Tong_Hai_SoPhuc(s1, s2);
        Hieu_Hai_SoPhuc(s1, s2);
        Nhan_Hai_SoPhuc(s1, s2);
        Chia_Hai_SoPhuc(s1, s2);
        NhanSoThuc_Voi_SoPhuc(3, s1);
        SoPhuc_LineHop(s1);
    }
}

