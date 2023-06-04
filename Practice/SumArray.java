public class SumArray {
    public static void main (String [] args){
        int[] n = { 3, 5, 6, 8, 8, 10, 22};
        int sum = 0;
        double avg;
        for(int i : n){
            sum += i;
        }
        avg = (double) sum/n.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        
    }
}
