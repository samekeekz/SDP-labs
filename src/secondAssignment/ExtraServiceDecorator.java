package secondAssignment;

public class ExtraServiceDecorator implements BookingComponent{
    private BookingComponent component;
    private double extraServiceCost;

    public ExtraServiceDecorator(BookingComponent component, double extraServiceCost) {
        this.component = component;
        this.extraServiceCost = extraServiceCost;
    }

    public BookingComponent getComponent() {
        return component;
    }

    public void setComponent(BookingComponent component) {
        this.component = component;
    }

    public double getExtraServiceCost() {
        return extraServiceCost;
    }

    public void setExtraServiceCost(double extraServiceCost) {
        this.extraServiceCost = extraServiceCost;
    }

    @Override
    public double calculateTotalPrice() {
        return component.calculateTotalPrice() + extraServiceCost;
    }
}
