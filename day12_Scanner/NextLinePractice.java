package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age =input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA:");
        double gpa =input.nextDouble();

        input.nextInt();
        System.out.println("Enter your school name");
        String school = input.nextLine();

        System.out.println("age = "+age);
        System.out.println("fullName = "+fullName);
        System.out.println("GPA = "+gpa);
        System.out.println("schoolName = "+school);

        input.close();
    }

}

/*
    1. Ask the user to enter age (nextInt() )
    2. Ask the to enter full name (nextLine() )
 */