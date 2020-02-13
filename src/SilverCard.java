public class SilverCard extends BaseCard{
    private Double discountRate;

    public SilverCard(Integer turnover, Integer purchaseValue) {
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
        if (turnover > 300) {
            this.discountRate = 3.5;
        } else {
            this.discountRate = 2.0;
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
