package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String fullName =input.nextLine();

        System.out.println("Enter your Programming Language : ");
        String programming = input.nextLine();

        System.out.println("Enter your age :");
        int age =input.nextInt();

        input.nextLine();//capture the entre key that user pressed for nextInt()

        System.out.println("Enter your school name :");
        String schoolName = input.nextLine();

        System.out.println("fullName = "+fullName);
        System.out.println("programming = "+programming);
        System.out.println("Age = " + age);
        System.out.println("Enter your School Name : "+schoolName);

        input.close();
    }
}
