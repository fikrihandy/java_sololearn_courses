import java.util.Scanner;

public class BasicConcepts {
    public static void main(String[] args) {
        System.out.print("Days = ");
        Scanner scanner = new Scanner(System.in);
        // Time Converter
        int days = scanner.nextInt();
        // Explanation: 12 days are 12*24 = 288 hours, which are 288*60 = 17280 minutes, which are 17280*60 = 1036800 seconds.
        int seconds = ((days * 24) * 60) * 60;
        System.out.println("Seconds = " + seconds);
    }
}

//You need a program to convert days to seconds.
//The given code takes the amount of days as input. Complete the code to convert it to seconds and output the result.