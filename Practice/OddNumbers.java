import java.util.Scanner;

public class OddNumbers {
    

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();
        if (num1 % 2 == 0) {
            num1--;
        }
        for(num1+=2; num1 < num2 ; num1+=2){
            System.out.print(num1+ ", ");
        }
    }
}