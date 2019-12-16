import java.util.Scanner;
import java.util.*;

public class mortageCalc {

    public static Scanner input;

    public static void main (String[] args) {

        input=new Scanner(System.in);
        System.out.println("Enter the price of the property : ");
        double propertyPrice = input.nextDouble();
        System.out.println("Enter the rate : ");
        double rate = input.nextDouble();
        System.out.println("How many time a year you make payment : ");
        int freqPayment = input.nextInt();
        System.out.println("How many years are you paying the house? : ");
        int year = input.nextInt();
        System.out.println("How much did you pay down? : ");
        double downPayment = input.nextDouble();

        calc serie = new calc(propertyPrice, rate, year, freqPayment, downPayment);

        System.out.println("payment: "+calc.payment());
        System.out.println("total payment: "+calc.totalPayment());
        System.out.println("Interest: "+calc.interest());

    }

}