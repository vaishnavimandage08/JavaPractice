package main.java.com.solvd.farm;

public class FarmProduct {
    private String productName;
    private double pricePerUnit;

    public FarmProduct(String productName, double pricePerUnit) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
