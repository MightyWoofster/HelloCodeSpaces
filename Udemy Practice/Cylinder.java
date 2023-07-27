public class Cylinder extends Circle { 
    private double height;
    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double r, double h){
        super(r);
        height = h;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getHeight(){
        return height;
    }
    public double findVolume(){
        return findArea()*height;

    }
    
}
