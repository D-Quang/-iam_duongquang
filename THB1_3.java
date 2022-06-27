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

    public void MatPhang(Point p, Point q){
        double X1 = this.x - p.getX();
        double Y1= this.y - p.getY();
        double Z1= this.z - p.getZ();
        double X2 = this.x - q.getX();
        double Y2 = this.y - q.getY();
        double Z2 = this.z - q.getZ();
        
    }
}

class Point3d extends Point{
    private double z;

    public void setZ(double z){
        this.z=z;
    }
    public double getZ(){
        return z;
    }

    Point3d(double x, double y, double z){
        super(x,y);
        this.z=z;
    }

    Point3d(){

    }

    Point3d(Point3d a){
    a.getX();
    a.getY();
    this.z=a.z + 1;
    }
}