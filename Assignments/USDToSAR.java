import java.util.Scanner;

public class USDToSAR {

    public static void main(String[] args){

        //Define Scanner (Input)
        Scanner input = new Scanner(System.in);

        //Integers needed
        int usd;

        //Input & Output
        System.out.println("input the amount you want to convert from U.S. Dollars");
        usd = input.nextInt();

        double sar = (usd * 3.75);
        System.out.println(usd + "$ converted to Saudi Riyal would be " + sar + "SAR");

    }

}