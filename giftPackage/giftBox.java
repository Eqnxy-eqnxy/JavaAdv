package giftPackage;

public abstract class giftBox {
    private String candyName;
    public giftBox(String candyName) {
        this.candyName = candyName;
    }

    @Override
    public String toString() {
        return "Candy = " + candyName;
    }
}
