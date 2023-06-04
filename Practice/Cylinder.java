public class Cylinder extends Circle { 
    private double height;
    public Cylinder(){
        super();
        height = 0;
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
