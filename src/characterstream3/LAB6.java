package characterstream3;

import java.util.Scanner;

public class LAB6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println(name);
        System.out.println("Enter age:");
        int age = input.nextInt();
        System.out.println(age);
        System.out.println("Enter Height");
        double height = input.nextDouble();
        System.out.println(height);
        System.out.println("Enter weight");
        double weight = input.nextDouble();
        System.out.println(weight);
    }
}