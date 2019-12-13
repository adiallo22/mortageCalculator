import java.util.Scanner;
import java.util.*;

public class mortageCalc {

    public Scanner input;

    public static void main (String[] args) {

        input=new Scanner(System.in);
        System.out.println("Enter the price of the property : ");
        double propertyPrice = input.nextDouble();
        System.out.println("Enter the rate : ");
        double rate = input.nextInt();
        System.out.println("How many time a year you make payment : ");
        int freqPayment = input.nextInt();
        System.out.println("How much did you pay down? : ");
        double downPayment = input.nextDouble();

        calc serie = new calc(propertyPrice, rate, rate, freqPayment, downPayment);

    }

}