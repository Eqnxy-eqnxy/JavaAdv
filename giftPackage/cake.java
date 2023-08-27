package giftPackage;

public class cake extends giftBox{
    private String cakeName;
    private Double cakeWeight;
    private Double cakePrice;
    private String cakeSpace;

    public cake(String candyType, String cakeName, Double cakeWeight, Double cakePrice, String cakeSpace) {
        super(candyType);
        this.cakeName = cakeName;
        this.cakeWeight = cakeWeight;
        this.cakePrice = cakePrice;
        this.cakeSpace = cakeSpace;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public Double getCakeWeight() {
        return cakeWeight;
    }

    public void setCakeWeight(Double cakeWeight) {
        this.cakeWeight = cakeWeight;
    }

    public Double getCakePrice() {
        return cakePrice;
    }

    public void setCakePrice(Double cakePrice) {
        this.cakePrice = cakePrice;
    }

    public String getCakeSpace() {
        return cakeSpace;
    }

    public void setCakeSpace(String cakeSpace) {
        this.cakeSpace = cakeSpace;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + "Name = " + cakeName + ", " + "Weight = " + cakeWeight + ", " + "Space = " + cakeSpace + ", " + "Price = " + cakePrice;
    }
}
