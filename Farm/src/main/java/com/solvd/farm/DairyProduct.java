package main.java.com.solvd.farm;

public class DairyProduct {
    private int quantity;
    private double fatContent;
    private String name;

    public DairyProduct(int quantity, double fatContent, String name) {
        this.quantity = quantity;
        this.fatContent = fatContent;
        this.name = name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getFatContent(){
        return fatContent;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
