package main.java.com.solvd.farm;

public class Crop {
    private int quantity;
    private int price;
    private String name;
    private long expiryDate;

    public Crop(int quantity, int price, String name, long expiryDate){
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public int getQuantity(){
        return quantity;
    }
    public int getPrice(){
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getName(){
        return name;
    }
    public long getExpiryDate(){
        return expiryDate;
    }
}

