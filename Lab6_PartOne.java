import java.util.Scanner;

public class Lab6_PartOne {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an intger: ");

        int n = input.nextInt();

        if(n%2 == 0){
            System.out.println("Even");
        }
        if(n%2 != 0){
            System.out.println("Odd");
        }
    }
}