public class Circle {
    private double radius;
    public Circle(){
        radius = 1.0;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;

    }
    public double findArea(){
        return Math.pow(radius, 2) * Math.PI;

    }


}
