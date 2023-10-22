package secondAssignment;

public class BookingSystem {
    public static void main(String[] args) {
        BookingComponent hotelBooking = new BaseBooking("Luxury Hotel", 200);
        BookingComponent discountedHotelBooking = new DiscountDecorator(hotelBooking, 10);

        BookingComponent vacationRentalBooking = new BaseBooking("Beach House", 150);
        BookingComponent extraServiceRentalBooking = new ExtraServiceDecorator(vacationRentalBooking, 20);

        
        // Calculate total prices for different bookings
        double price1 = discountedHotelBooking.calculateTotalPrice();
        double price2 = extraServiceRentalBooking.calculateTotalPrice();

        // Display booking details and total prices
        displayBookingDetails("Discounted Hotel Booking", hotelBooking, price1);
        displayBookingDetails("Extra Service Rental Booking", vacationRentalBooking, price2);
    }

    public static void displayBookingDetails(String bookingType, BookingComponent booking, double totalPrice) {
        System.out.println("Booking Details for " + bookingType + ":");
        System.out.println("Base Price: $" + booking.calculateTotalPrice());
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("-----------------------");
    }
}
