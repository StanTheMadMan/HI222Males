import java.util.Scanner;

public class Assingment2Tempreture {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float celsius;

        System.out.println("enter tempreture in celsius:");
        celsius = input.nextFloat();
        System.out.println(celsius + "\u00B0c is " + (celsius * 9/5 + 32) + "\u00B0f in Fahrenheit");
    }
}
