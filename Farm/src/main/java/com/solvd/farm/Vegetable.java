package main.java.com.solvd.farm;

public class Vegetable {
    private String name;
    private double pricePerKg;
    private int maturityTimeInDays;

    public Vegetable(String name, double pricePerKg, int maturityTimeInDays) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.maturityTimeInDays = maturityTimeInDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setMaturityTimeInDays(int maturityTimeInDays) {
        this.maturityTimeInDays = maturityTimeInDays;
    }

    public String getName() {
        return name;
    }
    public double getPricePerKg() {
        return pricePerKg;
    }
    public int getMaturityTimeInDays() {
        return maturityTimeInDays;
    }
}