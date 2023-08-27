package giftPackage;

public class chocoBar extends giftBox{
    private String chocoBarName;
    private Double chocoBarWeight;
    private Double chocoBarPrice;
    private String chocoBarSpace;

    public chocoBar(String candyType, String chocoBarName, Double chocoBarWeight, Double chocoBarPrice, String chocoBarSpace) {
        super(candyType);
        this.chocoBarName = chocoBarName;
        this.chocoBarWeight = chocoBarWeight;
        this.chocoBarPrice = chocoBarPrice;
        this.chocoBarSpace = chocoBarSpace;
    }

    public String getChocoBarName() {
        return chocoBarName;
    }

    public void setChocoBarName(String chocoBarName) {
        this.chocoBarName = chocoBarName;
    }

    public Double getChocoBarWeight() {
        return chocoBarWeight;
    }

    public void setChocoBarWeight(Double chocoBarWeight) {
        this.chocoBarWeight = chocoBarWeight;
    }

    public Double getChocoBarPrice() {
        return chocoBarPrice;
    }

    public void setChocoBarPrice(Double chocoBarPrice) {
        this.chocoBarPrice = chocoBarPrice;
    }

    public String getChocoBarSpace() {
        return chocoBarSpace;
    }

    public void setChocoBarSpace(String chocoBarSpace) {
        this.chocoBarSpace = chocoBarSpace;
    }
    @Override
    public String toString() {
        return super.toString() + ", " + "Name = " + chocoBarName + ", " + "Weight = " + chocoBarWeight + ", " + "Space = " + chocoBarSpace + ", " + "Price = " + chocoBarPrice;
    }
}
