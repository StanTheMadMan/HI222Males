public class Lab5 {
    public static void main(String args[]){
        int number1 = 10;
        int number2 = 20;

        int add = number1 + number2;
        int sub = number1 - number2;
        int mult = number1 * number2;
        int div = number1 / number2;
        int rem = number1 % number2;

        System.out.println("Addition of " + number1 + " and " + number2 + " is " + add);
        System.out.println("Subtraction of " + number1 + " and " + number2 + " is " + sub);
        System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + mult);
        System.out.println("Division of " + number1 + " over " + number2 + " is " + div);
        System.out.println("Remainder of " + number1 + " over " + number2 + " is " + rem);
    }
}
