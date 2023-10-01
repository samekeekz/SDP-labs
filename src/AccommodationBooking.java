public class AccommodationBooking {
    private String accommodationName;
    private double basePrice;
    private PricingStrategy pricingStrategy;

    public AccommodationBooking(String accommodationName, double basePrice) {
        this.accommodationName = accommodationName;
        this.basePrice = basePrice;
        this.pricingStrategy = new StandardPricing(); // Default strategy
    }

    public String getAccommodationName() {
        return accommodationName;
    }

    public void setAccommodationName(String accommodationName) {
        this.accommodationName = accommodationName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTotalPrice(){
        return pricingStrategy.calculatePrice(basePrice);
    }
}
