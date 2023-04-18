package main.java.com.solvd.farm;

public class Seed {
    private String name;
    private double pricePerKg;
    private String plantType;

    public Seed(String name, double pricePerKg, double germinationRate, String plantType) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.plantType = plantType;
    }
    public String getName(){
        return name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }
}
