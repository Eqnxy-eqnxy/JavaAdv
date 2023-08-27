package giftPackage;

public class jelly extends giftBox{
    private String jellyName;
    private Double jellyWeight;
    private Double jellyPrice;
    private String jellySpace;

    public jelly(String candyType, String jellyName, Double jellyWeight, Double jellyPrice, String jellySpace) {
        super(candyType);
        this.jellyName = jellyName;
        this.jellyWeight = jellyWeight;
        this.jellyPrice = jellyPrice;
        this.jellySpace = jellySpace;
    }

    public void setJellyName(String jellyName) {
        this.jellyName = jellyName;
    }

    public Double getJellyWeight() {
        return jellyWeight;
    }

    public void setJellyWeight(Double jellyWeight) {
        this.jellyWeight = jellyWeight;
    }

    public Double getJellyPrice() {
        return jellyPrice;
    }

    public void setJellyPrice(Double jellyPrice) {
        this.jellyPrice = jellyPrice;
    }

    public String getJellySpace() {
        return jellySpace;
    }

    public void setJellySpace(String jellySpace) {
        this.jellySpace = jellySpace;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + "Name = " + jellyName + ", " + "Weight = " + jellyWeight + ", " + "Space = " + jellySpace + ", " + "Price = " + jellyPrice;
    }
}
