public abstract class BaseCard {
    private Integer turnover;
    private Integer purchaseValue;


    public BaseCard(Integer turnover, Integer purchaseValue) {
        this.turnover = turnover;
        this.purchaseValue = purchaseValue;
    }

    public Integer getTurnover() {
        return turnover;
    }

    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    public Integer getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(Integer purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public abstract Double calculateDiscountRate(Integer turnover);
    public abstract Double calculateDiscount();
    public abstract Double calculateTotalSum();
}
