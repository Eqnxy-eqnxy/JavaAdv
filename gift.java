import giftPackage.*;

public class gift {

    public static void main(String[] args) {

        cake cake = new cake("Cake","Blue Sea", 1.2, 100.11, "10");
        jelly jelly = new jelly("Jelly","GummyBears",0.1,5.99,"2");
        chocoBar chocoBar = new chocoBar("ChocoBar", "Bounty",0.33,2.99,"5");
        lolipop lolipop = new lolipop("Lollipop", "Chupa-chups", 0.40,3.00, "3");
        giftBox [] box = {cake, jelly, chocoBar, lolipop};

        double weight = cake.getCakeWeight() + jelly.getJellyWeight() + chocoBar.getChocoBarWeight() + lolipop.getLolipopWeight();
        double price = cake.getCakePrice() + jelly.getJellyPrice() + chocoBar.getChocoBarPrice() + lolipop.getLolipopPrice();

        for (giftBox someBox: box) {
            System.out.println(someBox.toString());
        }
        System.out.println("Total price = " + price + ", " + "Total weight = " + weight);
        }
    }
