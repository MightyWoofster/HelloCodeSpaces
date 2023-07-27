public class Factorial {
    public static int calc (int n){
        int result=1;
        if (n > 0){
            result = (n * calc(n-1));
        }
        return result;

    }
    public static void main (String[] args){
        System.out.println(calc(10));

    }
}
