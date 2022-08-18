import java.util.Scanner;

// Binary Converter
class Converter {
    public static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, (num % 2));
            num /= 2;
        }
        return binary.toString();
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number (integer) = ");
        int x = sc.nextInt();
        System.out.print("Binary = " + Converter.toBinary(x));
    }
}

//The binary numeric system uses only two digits: 0 and 1. Computers operate in binary, meaning they store data and perform calculations using only zeros and ones.
//
//You need to make a program to convert integer numbers to their binary representation.
//Create a Converter class with a static toBinary() method, which returns the binary version of its argument.
//The code in main takes a number as input and calls the corresponding static method. Make sure the code works as expected.