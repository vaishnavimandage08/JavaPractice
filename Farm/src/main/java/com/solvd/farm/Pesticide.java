package main.java.com.solvd.farm;

public class Pesticide {
    private int price;
    private String name;

    public Pesticide(int price, String name){
        this.price= price;
        this.name= name;
    }
    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
