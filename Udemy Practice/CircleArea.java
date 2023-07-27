public class CircleArea {
    public static void main (String[] args ){
        System.out.println(calcArea(3));
    }
    public static double calcArea(int radius){
        return Math.pow(radius, 2) * Math.PI;


    }
}
