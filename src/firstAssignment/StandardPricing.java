package firstAssignment;

public class StandardPricing implements PricingStrategy{

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice;
    }
}
