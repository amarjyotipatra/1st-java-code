//Calculation of a+b,a-b,a*b according to user input

import java.util.Scanner;

public class operation{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            int b;
            System.out.print("Enter the values of a and b");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
        }
    }
}