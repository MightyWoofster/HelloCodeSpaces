import java.util.ArrayList;

public class PositiveNegative {
    public static void main (String[] args){
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(3);
        numList.add(-5);
        numList.add(10);
        numList.add(-10);
        numList.add(13);
        int negative = 0;
        for (int x=0; x < numList.size(); x++){
           if (numList.get(x) < 0){
            negative++;
           }
            
        }
        System.out.println(negative);
    }
}
