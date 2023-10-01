public class BookingSystem {
    public static void main(String[] args) {
        AccommodationBooking hotelBooking = new AccommodationBooking("Rixos Aktau", 500);
        AccommodationBooking vacationRentalBooking = new AccommodationBooking("Aktau Beach", 400);
        AccommodationBooking hostelBooking = new AccommodationBooking("Aktau Hostel", 200);


        hotelBooking.setPricingStrategy(new StandardPricing());
        vacationRentalBooking.setPricingStrategy(new DiscountPricing(10));
        hostelBooking.setPricingStrategy(new DiscountPricing(15));

        System.out.println("Booking Details:");
        System.out.println("1. Accommodation: " + hotelBooking.getAccommodationName());
        System.out.println("   Total Price: $" + hotelBooking.calculateTotalPrice());
        System.out.println("2. Accommodation: " + vacationRentalBooking.getAccommodationName());
        System.out.println("   Total Price: $" + vacationRentalBooking.calculateTotalPrice());
        System.out.println("3. Accommodation: " + hostelBooking.getAccommodationName());
        System.out.println("   Total Price: $" + hostelBooking.calculateTotalPrice());
    }
}
