public class calc {

    private double propertyPrice;
    private double rate;
    private int year;
    private int freqPayment;
    private double downPayment;

    calc(double propertyPrice, double rate, int rate, int freqPayment, double downPayment) {
        this.propertyPrice = propertyPrice;
        this.year = year;
        this.freqPayment = freqPayment;
        this.downPayment = downPayment;
    }

    public double mortage(){

        return propertyPrice-downPayment;

    }

    public double payment(){
        double mortage = mortage();
        double num = mortage * rate / freqPayment;
        double den = (1 - (1 + (rate / freqPayment))math.pow(-freqPayment*year));
        return num/den;
    }


}