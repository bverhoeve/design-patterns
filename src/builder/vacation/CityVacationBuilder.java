package builder.vacation;



public class CityVacationBuilder extends VacationBuilder {	

	public CityVacationBuilder() {
		this.name = "City Vacation";
	}

	public CityVacationBuilder addAccommodation() {
		this.accommodations.add(new Hotel(this.name));

		return this;
	}

	public CityVacationBuilder addAccommodation(String name) {
		this.accommodations.add(new Hotel(name));
		return this;
	}

	public CityVacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int roomNumber) {
		Reservation reservation = new Reservation();
		reservation.setArrivalDate(year, month, day);
		reservation.setNights(nights);
		
		Hotel hotel = new Hotel(name);
		hotel.setReservation(reservation);
		hotel.setRoomNumber(roomNumber);
		this.accommodations.add(hotel);
		return this;
	}

}