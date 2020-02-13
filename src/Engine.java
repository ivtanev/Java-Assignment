public class Engine implements Runnable {
    @Override
    public void run() {
        BronzeCard bronzeCard = new
                BronzeCard(0, 200);

        PayDeck.printPurchaseValue(bronzeCard);
        PayDeck.printDiscountRate(bronzeCard);
        PayDeck.printDiscount(bronzeCard);
        PayDeck.printTotalPurchaseValue(bronzeCard);

        SilverCard silverCard = new SilverCard(600,850);
        PayDeck.printPurchaseValue(silverCard);
        PayDeck.printDiscountRate(silverCard);
        PayDeck.printDiscount(silverCard);
        PayDeck.printTotalPurchaseValue(silverCard);
        GoldCard goldCard = new GoldCard(1500,1300);

        PayDeck.printPurchaseValue(goldCard);
        PayDeck.printDiscountRate(goldCard);
        PayDeck.printDiscount(goldCard);
        PayDeck.printTotalPurchaseValue(goldCard);
    }
}
