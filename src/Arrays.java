import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        // Reverse a String
        char[] reverseArr = new char[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[j] = arr[i];
            j++;
        }
        System.out.println(reverseArr);
    }
}

//Write a program to take a string as input and output its reverse.
//The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.