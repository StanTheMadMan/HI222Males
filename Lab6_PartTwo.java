import java.util.Scanner;

public class Lab6_PartTwo {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an intger: ");

        int n = input.nextInt();

        if(n > 0){
            System.out.println("Positive");
        }
        if(n < 0){
            System.out.println("Negative");
        }
        if (n == 0) {
            System.out.println("Zero");
        }
    }
}