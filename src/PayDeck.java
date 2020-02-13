public class PayDeck {
    public static void printDiscountRate(BaseCard card){
        System.out.printf("Discount rate: %.1f%%%n",card.calculateDiscountRate(card.getTurnover()));
    }

    public static void printDiscount(BaseCard card){
        System.out.printf("Discount: $%.2f%n",card.calculateDiscount());
    }

    public static void printTotalPurchaseValue(BaseCard card){
        System.out.printf("Total: $%.2f%n",card.calculateTotalSum());
        System.out.println();
    }

    public static void printPurchaseValue(BaseCard card) {
        System.out.printf("Purchase value: $%.2f%n",Double.parseDouble(String.valueOf(card.getPurchaseValue())));
    }
}
