public class GoldCard extends BaseCard {
    private Double discountRate;

    public GoldCard(Integer turnover, Integer purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public Double calculateDiscountRate(Integer turnover) {
        Double initialValue = 2.0;
        Integer growRate = turnover / 100;
        if (growRate + initialValue.intValue() > 10) {
            this.discountRate = 10.0;
        } else {
            this.discountRate = growRate.doubleValue() + initialValue;
        }
        return this.discountRate;
    }

    @Override
    public Double calculateDiscount() {
        return (super.getPurchaseValue() * this.discountRate) / 100.0;
    }

    @Override
    public Double calculateTotalSum() {
        return super.getPurchaseValue() - this.calculateDiscount();
    }
}
