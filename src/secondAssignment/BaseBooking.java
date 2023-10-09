package secondAssignment;

public class BaseBooking implements BookingComponent{
    private String name;
    private double basePrice;

    public BaseBooking(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calculateTotalPrice() {
        return basePrice;
    }
}
