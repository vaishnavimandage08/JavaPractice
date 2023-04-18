package main.java.com.solvd.farm;

public class Flower {

    private double pricePerUnit;
    private String name;
    private String color;
    private boolean isFragrant;

    public Flower(double pricePerUnit, String name, String color, boolean isFragrant) {
        this.pricePerUnit = pricePerUnit;
        this.name = name;
        this.color = color;
        this.isFragrant = isFragrant;
    }

    public double getPricePerUnit (){
        return pricePerUnit;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFragrant(boolean fragrant) {
        isFragrant = fragrant;
    }

    public boolean isFragrant(){
        return isFragrant;
    }

}
