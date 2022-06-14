import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int weeks;

        System.out.print("Enter number of weeks: ");          // Accepts user input for number of weeks
        weeks = input.nextInt();

        int days = weeks * 7;                                   //Calculates and creates variables for all required values
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        System.out.println(days + " days.");                    //Prints out all required values
        System.out.println(hours + " hours.");
        System.out.println(minutes + " minutes.");
        System.out.println(seconds + " seconds.");

    }
}
