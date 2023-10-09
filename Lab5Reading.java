import java.util.Scanner;

public class Lab5Reading {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float age;
        String name;

        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextFloat();

        System.out.println("Welcome" + name);
        System.out.println("Your age next year is: " + (age+1));
    }
}
