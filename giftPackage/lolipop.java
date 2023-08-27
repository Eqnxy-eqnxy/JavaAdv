package giftPackage;

public class lolipop extends giftBox{
    private String lolipopName;
    private Double lolipopWeight;
    private Double lolipopPrice;
    private String lolipopSpace;

    public lolipop(String candyType, String lolipopName, Double lolipopWeight, Double lolipopPrice, String lolipopSpace) {
        super(candyType);
        this.lolipopName = lolipopName;
        this.lolipopWeight = lolipopWeight;
        this.lolipopPrice = lolipopPrice;
        this.lolipopSpace = lolipopSpace;
    }

    public String getLolipopName() {
        return lolipopName;
    }

    public void setLolipopName(String lolipopName) {
        this.lolipopName = lolipopName;
    }

    public Double getLolipopWeight() {
        return lolipopWeight;
    }

    public void setLolipopWeight(Double lolipopWeight) {
        this.lolipopWeight = lolipopWeight;
    }

    public Double getLolipopPrice() {
        return lolipopPrice;
    }

    public void setLolipopPrice(Double lolipopPrice) {
        this.lolipopPrice = lolipopPrice;
    }

    public String getLolipopSpace() {
        return lolipopSpace;
    }

    public void setLolipopSpace(String lolipopSpace) {
        this.lolipopSpace = lolipopSpace;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "Name = " + lolipopName + ", " + "Weight = " + lolipopWeight + ", " + "Space = " + lolipopSpace + ", " + "Price = " + lolipopPrice;
    }
}
