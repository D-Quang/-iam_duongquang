import java.lang.Math;
class Point{
    private double x;
    private double y;
    Point(){
    }
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point(Point a){
        this.x = a.x+1;
        this.y = a.y-1;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void PhuongTrinh(Point p){
        double X = this.x - p.getX();
        double Y = this.y - p.getY();
        double Xn= Y;
        double Yn= (-1)*X;
        double C = (-1)*(this.x*Xn + this.y*Yn);
        System.out.println("Phuong trinh duong thang di qua 2 diem la: ");
        System.out.println(Xn+"*x" + "+"+ Yn+"*y"+"+"+ +C +"=0");
    }
}
class Vector{
    private double x;
    private double y;
    public void setX(Point a, Point b) {
        this.x= b.getX()-a.getX();
    }
    public void setY(Point a, Point b) {
        this.y= b.getY()-a.getY();
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
class THB1_2{
    static boolean checkPoint(Point a, Point b,Point c){
        boolean st=false;
        Vector v1= new Vector();
        Vector v2= new Vector();
        v1.setX(a,b);
        v1.setY(a,b);
        v2.setX(a,c);
        v2.setY(a,c);
        if((v1.getX()/v2.getX())==(v1.getY()/v2.getY())){
            st=true;
        }
        return st;
    }
    static double Distance(Point a, Point b){
        Vector v = new Vector();
        v.setX(a,b);
        v.setY(a,b);
        return Math.sqrt(v.getX()*v.getX()+v.getY()*v.getY());
    }
    static void PerArea(Point a, Point b,Point c){
        if(checkPoint(a,b,c)==true){
            System.out.println("Ba diem tren la ba diem thang hang!!!!!");
            return;
        }else{
            double d1=Distance(a,b);
            double d2=Distance(a,c);
            double d3=Distance(b,c);
            double p= (d1+d2+d3)/2;
            double s=Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
            System.out.println("Dien tich cua tam giac la: "+s);
        }
    }

    
    public static void main(String[] args) {
        Point a = new Point();
        a.setX(-1);
        a.setY(0);
        Point b = new Point(a.getX(),4);
        Point c = new Point(a);
        PerArea(a,b,c);
        Point d = new Point(-3,4);
        System.out.println("ba diem a,c,d la ba diem thang hang: "+checkPoint(a,c,d));
        b.PhuongTrinh(c);
    }
}