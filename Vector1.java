import java.lang.Math;

class Vector {
    protected int n;
    protected double[] arr = new double[n];
    Vector(){
    }

    Vector(int n){
        this.n = n;
    }
    
    Vector(double[] arr, int n){
        this.arr = arr;
        this.n = n;
    }

    public double DoDai_Vector(){
        double x = 0;
        for(int i=0; i<n; i++)
        {
            x += arr[i] * arr[i];
        }
        return Math.sqrt(x);
    }

    public Vector Cong(Vector x, Vector y, Vector z){
        for(int i=0; i<n; i++)
        {
            z.arr[i] = x.arr[i] + y.arr[i];
        }
        return z;
    }

    public Vector Tru(Vector x, Vector y, Vector z)
    {
        for(int i=0; i<n; i++)
        {
            z.arr[i] = x.arr[i] - y.arr[i];
        }
        return z;
    }

    public Vector Nhan(Vector x, int m)
    {
        for(int i=0; i<n; i++)
        {
            x.arr[i] = x.arr[i] * m;
        }
        return x;
    }

    public Vector Chia(Vector x, double m)
    {
        for(int i=0; i<n; i++)
        {
            x.arr[i] = x.arr[i] / m;
        }
        return x;
    }

    public Vector vtdonvi(Vector x)
    {
        return x.Chia(x, x.DoDai_Vector());
    }

    public String toString()
    {
        String s = "( ";
        for(int i=0; i<n; i++)
        {
            s += Double.toString(arr[i]) + " ";
        }
        s += ")";
        return s;
    }

    public void display()
    {
        System.out.print("Vector: ");
        for(int i=0; i<n; i++)
        {               
            System.out.print(arr[i] + " ");
        }
    }
}

public class Vector1{
    public static void main(String[] args)
    {
        double[] arr =  new double[] {1, 2, 3};
        double[] arr2 =  new double[] {4, 5, 6};
        Vector x = new Vector(arr, arr.length);
        Vector y = new Vector(arr2, arr2.length);
        Vector z = new Vector(arr, arr.length);

        z.Cong(x, y, z);
        System.out.println("Cong hai vector = " + z.toString());

        z.Tru(x, y, z);
        System.out.println("Tru hai vector = " + z.toString());

        z.Nhan(x, 2);
        System.out.println("Nhan vector voi mot so = " + z.Nhan(x, 2));

        z.Chia(x, 2);
        System.out.println("Chia vector voi mot so = " + z.Chia(x, 2));

        z.DoDai_Vector();
        System.out.println("Do dai vector = " + z.DoDai_Vector());

        z.vtdonvi(x);
        System.out.println("Vector don vi = " + z.vtdonvi(x));


    }
}