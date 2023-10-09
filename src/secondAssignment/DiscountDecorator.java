package secondAssignment;

public class DiscountDecorator implements BookingComponent{
    private BookingComponent component;
    private double discountPercentage;

    public DiscountDecorator(BookingComponent component, double discountPercentage) {
        this.component = component;
        this.discountPercentage = discountPercentage;
    }

    public BookingComponent getComponent() {
        return component;
    }

    public void setComponent(BookingComponent component) {
        this.component = component;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateTotalPrice() {
        return component.calculateTotalPrice() * ((100 - discountPercentage) / 100);
    }
}
