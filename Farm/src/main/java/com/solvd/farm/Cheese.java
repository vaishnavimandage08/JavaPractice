package main.java.com.solvd.farm;

public class Cheese {
    private String name;
    private double pricePerKg;
    private double weight;
    private long expiryDate;

    public Cheese(String name, double pricePerKg, double weight, long expiryDate) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.expiryDate = expiryDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setExpiryDate(long expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getName(){
        return name;
    }

    public double getPricePerKg(){
        return pricePerKg;
    }

    public double getWeight(){
        return weight;
    }

    public long getExpiryDate(){
        return expiryDate;
    }

}
