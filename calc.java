public class calc {

    private double propertyPrice;
    private double rate;
    private int year;
    private int freqPayment;
    private double downPayment;

    calc(double propertyPrice, double rate, int rate, int freqPayment) {
        this.propertyPrice = propertyPrice;
        this.year = year;
        this.freqPayment = freqPayment;
    }

    public int mortage(){
        return propertyPrice-downPayment;
    }

}