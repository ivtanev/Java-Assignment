public class BronzeCard extends BaseCard{
    private Double discountRate;

    public BronzeCard(Integer turnover, Integer purchaseValue) {
        super(turnover, purchaseValue);
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public Double calculateDiscountRate(Integer turnover) {
        if (turnover > 100 && turnover < 300) {
            this.discountRate = 1.0;
        } else if (turnover > 300) {
            this.discountRate = 2.5;
        } else {
            this.discountRate = 0.0;
        }
        return discountRate;
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
