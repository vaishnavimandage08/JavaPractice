package main.java.com.solvd.farm;

public class Fruit {
    private String name;
    private double pricePerKg;
    private int maturityTimeInDays;
    private boolean isSeasonalFruit;

    public Fruit(String name, double pricePerKg, int maturityTimeInDays, boolean isSeasonalFruit) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.maturityTimeInDays = maturityTimeInDays;
        this.isSeasonalFruit = isSeasonalFruit;
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

    public void setSeasonalFruit(boolean seasonalFruit) {
        isSeasonalFruit = seasonalFruit;
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

    public boolean isSeasonalFruit() {
        return isSeasonalFruit;
    }
}
