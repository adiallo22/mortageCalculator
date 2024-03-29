import java.util.*;

public class calc {

    private double propertyPrice;
    private double rate;
    private int year;
    private int freqPayment;
    private double downPayment;

    calc(double propertyPrice, double rate, int year, int freqPayment, double downPayment) {
        this.propertyPrice = propertyPrice;
        this.rate = rate;
        this.year = year;
        this.freqPayment = freqPayment;
        this.downPayment = downPayment;
    }

    public static double mortage(){
        return propertyPrice - downPayment;
    }

    public static double payment(){
        double mortage = mortage();
        double num = mortage * rate / freqPayment;
        double den = Math.pow(1 - (1 + (rate / freqPayment)), -freqPayment*year);
        return num/den;
    }

    public static double totalPayment(){
        return payment()*freqPayment*year;
    }

    public static double interest(){
        return totalPayment()-downPayment;
    }


}