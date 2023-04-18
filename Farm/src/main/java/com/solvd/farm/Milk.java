package main.java.com.solvd.farm;

public class Milk {
    private String type;
    private double pricePerLiter;
    private long expiryDate;

    private boolean pasteurized;

    public Milk(String type, double pricePerLiter, long expiryDate, boolean pasteurized) {
        this.type = type;
        this.pricePerLiter = pricePerLiter;
        this.expiryDate = expiryDate;
        this.pasteurized = pasteurized;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setPasteurized(boolean pasteurized) {
        this.pasteurized = pasteurized;
    }

    public boolean isPasteurized() {
        return pasteurized;
    }

    public String getType(){
        return type;
    }

    public double getPricePerLiter(){
        return pricePerLiter;
    }

    public long getExpiryDate(){
        return expiryDate;
    }
}
