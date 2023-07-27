
public class Polygon{
    
    private int numSides;
    public Polygon(){
        numSides = 1;

    }
    public Polygon(int numSides){
        this.numSides = numSides;

    }
    public void setName(int numSides){
        this.numSides = numSides;

    }
    public String toString(){
        return "The polygon has " + numSides + " sides.";
    }
    public int getnumSides(){
        return numSides;

    }




}