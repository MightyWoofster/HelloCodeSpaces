//dayName.java
import java.util.Scanner;

public class dayName {
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);
        int day;
        System.out.println("Enter the number of the day of the week:");
        day = s.nextInt();
        System.out.println("Day of the week: " + getName(day));
    }

    public static String getName(int dayNum){
        if(dayNum == 1){
            return "Sunday";
        }
        else if(dayNum == 2){
            return "Monday";
        }
        else if(dayNum == 3){
            return "Tuesday";
        }
        else if(dayNum == 4){
            return "Wednesday";
        }
        else if(dayNum == 5){
            return "Thursday";
        }
        else if(dayNum == 6){
            return "Friday";
        }
        else if(dayNum == 7){
            return "Saturday";
        }
        else{
            return "Invalid Number";
        }

    }



}
