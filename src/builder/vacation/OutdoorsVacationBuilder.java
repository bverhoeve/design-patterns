package builder.vacation;


public class OutdoorsVacationBuilder extends VacationBuilder {	

	public OutdoorsVacationBuilder() {
		this.name = "Outdoors Vacation";
	}

	public OutdoorsVacationBuilder addAccommodation() {
		this.accommodations.add(new Tent(this.name));

		return this;
	}

	public OutdoorsVacationBuilder addAccommodation(String name) {
		this.accommodations.add(new Tent(name));
		return this;
	}

	public OutdoorsVacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int siteNumber) {
		Reservation reservation = new Reservation();
		reservation.setArrivalDate(year, month, day);
		reservation.setNights(nights);
		
		Tent tent = new Tent(name);
		tent.setReservation(reservation);
		tent.setSiteNumber(siteNumber);
		this.accommodations.add(tent);
		return this;
	}
}
