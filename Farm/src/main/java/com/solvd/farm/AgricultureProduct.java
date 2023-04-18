package main.java.com.solvd.farm;

public class AgricultureProduct {
    private int quantity;
    private int price;
    private String name;

    public AgricultureProduct(int quantity, int price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
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

    public int getQuantity(){

        return quantity;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){

        return name;
    }

}
