package firstAssignment;

public class DiscountPricing implements PricingStrategy{
    private double discountPercentage;


    public DiscountPricing(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * ((100 - discountPercentage) / 100);
    }
}
